package Lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static Lesson5.Jira_TrelloScenario1_2.Login;
import static Lesson5.Jira_TrelloScenario1_2.jdriver;

public class TrelloScenario3 {
    public void ChangeBoardVisibility() throws InterruptedException {

        Login();
        jdriver.findElement(By.xpath("//span//span[text()='Настройки']")).click();
        jdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        jdriver.findElement(By.xpath("//div[@class='setting-item-action']/a[@class='button-link u-text-align-center']")).click();
        jdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        jdriver.findElement(By.xpath("//div/ul/li/a[@class='highlight-icon js-select-public']")).click();

    }

    @Test
    public void ChangeBoardVisibilitySuccessfully() throws InterruptedException {
        Login();
        jdriver.findElement(By.xpath("//span//span[text()='Настройки']")).click();
        jdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement changes = jdriver.findElement(By.xpath("//span[text()='Публичная']"));
        Assertions.assertEquals("Публичная",changes.getAttribute("outerText"));

    }
}
