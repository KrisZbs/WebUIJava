package HomeWork6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Presets {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //https://www.litres.ru/
    @FindBy(xpath = "//span[@class='user_container']")
    public WebElement Login;


    public LoginPage loginClick() {
        Login.click();
        return this;
    }

    @FindBy(xpath = "//button[text()='Электронная почта']")
    public WebElement EmailLogin;

    public LoginPage emailLoginClick() {
        EmailLogin.click();
        return this;
    }

    @FindBy(xpath = "//input[@name='email']")
    public WebElement EmailField;

    public LoginPage fillEmailField() {
        EmailField.sendKeys("testertest100@mail.ru");
        return this;
    }

    @FindBy(xpath = "//button[text()='Продолжить']")
    public WebElement Continue;

    public LoginPage continueClick() {
        Continue.click();
        return this;
    }

    @FindBy(xpath = "//input[@name='pwd']")
    public WebElement Password;

    public LoginPage fillPassword() {
        Password.sendKeys("081:926");
        return this;
    }

    @FindBy(xpath = "//button[text()='Войти']")
    public WebElement GetLoginButton;

    public LoginPage getLogin() {
        GetLoginButton.click();
        return this;
    }
    @Step("Логинимся на Литрес")

    public void login() throws InterruptedException {
        driver.get("https://www.litres.ru/");
        new LoginPage(driver).loginClick();
        Thread.sleep(1000);
        emailLoginClick().fillEmailField().continueClick();
        Thread.sleep(1000);
        fillPassword().getLogin();
    }
}
