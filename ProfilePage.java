package HomeWork6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends Presets {
    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='user_name']")
    public WebElement ProfileBtn;

    @Step("Перейти в профиль")
    public ProfilePage goToProfile() {
        ProfileBtn.click();
        return this;
    }

    @FindBy(xpath = "//a[@class='user_menu__about_me']")
    public WebElement AboutMe;

    @Step("Перейти в раздел ОБО МНЕ")
    public ProfilePage aboutMeClick() {
        AboutMe.click();
        return this;
    }

    @FindBy(xpath = "//span[text()='Добавить имя и фамилию']")
    public WebElement FIO;

    @Step("Нажимаем на поле ФИО")
    public ProfilePage fioClick() {
        FIO.click();
        return this;
    }

    @FindBy(xpath = "//input[@placeholder='Имя']")
    public WebElement NameField;

    @Step("Заполняем поле ИМЯ")
    public ProfilePage fillName() {
        NameField.sendKeys("Testname");
        return this;
    }

    @FindBy(xpath = "//input[@placeholder='Фамилия']")
    public WebElement SurnameField;

    @Step("Заполняем поле ФАМИЛИЯ")
    public ProfilePage fillSurname() {
        SurnameField.sendKeys("Test");
        return this;
    }

    @FindBy(xpath = "//div//button[text()='OK']")
    public WebElement OKBtn;

    @Step("Нажимаем кнопку ОК")
    public ProfilePage okClick() {
        OKBtn.click();
        return this;
    }
}
