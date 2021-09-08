package Lesson6.Trello;

import Lesson6.GB_CRM.Presets;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class T_loginPage extends Presets {

    public T_loginPage(WebDriver driver) {
        super(driver);
    }



    @FindBy (xpath = "//input[@placeholder='Укажите адрес электронной почты']")
    public WebElement email;

    public T_loginPage FillEmail(String emailAddress){
        email.sendKeys(emailAddress);
        return this;
    }
    @FindBy (xpath = "//input[@class='button account-button button-green btn btn-success']")
    public WebElement accountButton;

    public T_loginPage AccountBtnClick() throws InterruptedException {
        accountButton.click();
        Thread.sleep(3000);
        return this;
    }

    @FindBy(xpath = "//input[@placeholder='Введите пароль']")
    public WebElement passwordField;

    public T_loginPage FillPassword(String password){
        passwordField.sendKeys(password);
        return this;
    }
    @FindBy (xpath = "//span[text()='Войти']")
    public WebElement buttonLogIn;

    public void PushLoginButton(){
        buttonLogIn.click();
    }


    public void LoginToTrello() throws InterruptedException {
        driver.get("https://trello.com/login");
        new T_loginPage(driver).FillEmail("testertest100@mail.ru")
                .AccountBtnClick()
                .FillPassword("testfortesters")
                .PushLoginButton();
        Thread.sleep(5000);

    }




}
