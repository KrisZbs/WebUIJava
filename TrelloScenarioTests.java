package Lesson5;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Lesson5.Jira_TrelloScenario1_2.Login;
import static Lesson5.Jira_TrelloScenario1_2.jdriver;

public class TrelloScenarioTests {

    
    @Test
    public void BoardCreationIsSuccess() throws InterruptedException {
        Login();
        WebElement NewBoard = jdriver.findElement(By.xpath("//span[@class='board-tile-fade']"));
        Assertions.assertEquals("board-tile-fade", NewBoard.getAttribute("class"));


    }
    @Test
    public void InvitationSentSuccessfully() throws InterruptedException {
        Login();
        jdriver.findElement(By.xpath("//span//span[text()='Участники'] ")).click();
        Thread.sleep(5000);
        jdriver.findElement(By.xpath("//a//span[text()='Гости']")).click();

        WebElement invite = jdriver.findElement(By.xpath("//span[text()='@kris82173587']"));
        Assertions.assertEquals("@kris82173587",invite.getAttribute("innerText"));


    }


}
