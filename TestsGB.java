package Lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static Lesson5.GeekBrainsCRMTest.LoginToCrm;
import static Lesson5.GeekBrainsCRMTest.driver;


public class TestsGB {


    public static void GetNameFilter() throws InterruptedException {
        LoginToCrm();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//a//span[text()='Контрагенты']")).click();
        driver.findElement(By.xpath("//a//span[text()='Контактные лица']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[contains(text(),'ФИО')]")).click();
        driver.findElement(By.xpath("//input[@name='value']")).sendKeys("SecondSeptember");
        driver.findElement(By.xpath("//button[@class='btn btn-primary filter-update']")).click();


    }


    @Test

    public void NewContactCreationIsSuccessful() throws InterruptedException {
        GetNameFilter();
        WebElement contacts = driver.findElement(By.xpath("//tbody//tr//td[@class='string-cell grid-cell grid-body-cell grid-body-cell-fio']"));
        Assertions.assertEquals("string-cell grid-cell grid-body-cell grid-body-cell-fio", contacts.getAttribute("class"));
        Thread.sleep(2000);
        driver.quit();

    }

}







