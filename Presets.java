package Lesson6.GB_CRM;

import Lesson7.CustomLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;


public class Presets {
    public WebDriver driver;
    WebDriverWait webDriverWait;

    public Presets(WebDriver driver) {
    }



/*
    @BeforeEach
    void driverInit() {
        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new CustomLogger());
        webDriverWait=new WebDriverWait(driver,5);


    }*/

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();

    }






    @AfterEach
    void TearDown() throws InterruptedException {
        Thread.sleep(30000);
        driver.quit();
    }


}
