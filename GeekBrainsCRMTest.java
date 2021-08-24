package Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GeekBrainsCRMTest {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();

        LoginToCrm();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//a//span[text()='Контрагенты']")).click();
        driver.findElement(By.xpath("//a//span[text()='Контактные лица']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div/a[@title='Создать контактное лицо']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='crm_contact[lastName]']")).sendKeys("TestSurname");
        driver.findElement(By.xpath("//input[@name='crm_contact[firstName]']")).sendKeys("TestName");
        driver.findElement(By.xpath("//span[text()='Укажите организацию']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//ul/li/div[text()='1234']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='crm_contact[jobTitle]']")).sendKeys("Tester");
        Select statusSelect = new Select(driver.findElement(By.xpath("//select[@name='crm_contact[status]']")));
        statusSelect.selectByVisibleText("Активный");
        driver.findElement(By.cssSelector("div#container div.controls > div > a")).click();
        Select phoneTypeSelect = new Select(driver.findElement(By.xpath("//select[@name='crm_contact[phones][1][type]']")));
        phoneTypeSelect.selectByVisibleText("Рабочий");
        driver.findElement(By.xpath("//input[@name='crm_contact[phones][1][prefixCode]']")).sendKeys("999");
        driver.findElement(By.xpath("//input[@name='crm_contact[phones][1][phone]']")).sendKeys("899");
        driver.findElement(By.xpath("//input[@name='crm_contact[phones][1][internalCode]']")).sendKeys("8989");
        driver.findElement(By.xpath("//button[contains(text(),'Сохранить и закрыть')]")).click();


    }

    public static void LoginToCrm() {
        driver.get("https://crm.geekbrains.space/user/login");


        driver.findElement(By.id("prependedInput")).sendKeys("Applanatest1");
        driver.findElement(By.id("prependedInput2")).sendKeys("Student2020!");
        driver.findElement(By.xpath("//button")).click();


    }
}
