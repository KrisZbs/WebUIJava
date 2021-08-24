package Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jira_TrelloScenario1_2 {
    public static WebDriver jdriver;


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        jdriver = new ChromeDriver();
        Login();
        //Сценарий 1: Создание доски;
        Thread.sleep(5000);
        jdriver.findElement(By.cssSelector("div#header div._3L7haCtpIGF1G_ > button[type=\"button\"]:nth-child(1) > span > span")).click();
        jdriver.findElement(By.xpath("//p[contains(text(), 'Доска представляет')]")).click();
        Thread.sleep(5000);
        jdriver.findElement(By.xpath("//input[@placeholder='Добавить заголовок доски']")).sendKeys(" Doing the homeWork");
        jdriver.findElement(By.xpath("//button[@title='green trees under white clouds']")).click();
        jdriver.findElement(By.xpath("//button[text()='Создать доску']")).click();
        Thread.sleep(5000);

        //Сценарий 2: Отправление приглашения
        jdriver.findElement(By.xpath("//span[text()='Пригласить']")).click();
        jdriver.findElement(By.xpath("//input[@placeholder='Адрес электронной почты или имя']")).sendKeys("kriszbs@yandex.ru");
        jdriver.findElement(By.xpath("//button[text()='Отправить приглашение']")).click();

    }

    public static void Login() throws InterruptedException {
        jdriver.get("https://trello.com/login");


        jdriver.findElement(By.xpath("//input[@placeholder='Укажите адрес электронной почты']")).sendKeys(

                "testertest100@mail.ru");
        jdriver.findElement(By.xpath("//input[@class='button account-button button-green btn btn-success']")).click();
        Thread.sleep(5000);
        jdriver.findElement(By.xpath("//input[@placeholder='Введите пароль']")).sendKeys("testfortesters");
        jdriver.findElement(By.xpath("//span[text()='Войти']")).click();
        Thread.sleep(5000);


    }

}