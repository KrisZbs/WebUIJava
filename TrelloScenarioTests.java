package Lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

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

        jdriver.findElement(By.xpath("//span//span[text()='Участники'] ")).click();
        jdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        jdriver.findElement(By.xpath("//a//span[text()='Гости']")).click();

        WebElement invite = jdriver.findElement(By.xpath("//span[text()='@kris82173587']"));
        Assertions.assertEquals("@kris82173587", invite.getAttribute("innerText"));


    }

    @AfterAll
    public void AfterAllTests() {
        jdriver.quit();
    }


}
