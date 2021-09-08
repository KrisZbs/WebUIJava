package Lesson6.GB_CRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends Presets {

    @FindBy(id = "prependedInput")
    public WebElement LoginInput;

    @FindBy(id = "prependedInput2")
    public WebElement PasswordInput;

    @FindBy(xpath = "//button")
    public WebElement LoginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public  MainPage LoginToGB() {
        driver = new ChromeDriver();


        driver.get("https://crm.geekbrains.space/user/login");
        LoginInput.sendKeys("Applanatest1");
        PasswordInput.sendKeys("Student2020!");
        LoginButton.click();
        return new MainPage(driver);

    }




}
