package Lesson6.GB_CRM;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewPersonCreationPage extends Presets {
    public NewPersonCreationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div/a[@title='Создать контактное лицо']")
    public WebElement NewContactCreationButton;

    @Step("Нажимаем на кнопку создания нового контакта")
    public NewPersonCreationPage SelectNewContactCreationButton() throws InterruptedException {

        NewContactCreationButton.click();
        Thread.sleep(5000);
        return this;
    }

    @FindBy(xpath = "//input[@name='crm_contact[lastName]']")
    public WebElement Surname;

    @Step("Заполняем поле ФАМИЛИЯ")
    public NewPersonCreationPage FillSurname() throws InterruptedException {
        Surname.sendKeys("TestSurnameSixthSeptember");
        Thread.sleep(5000);
        return this;
    }

    @FindBy(xpath = "//input[@name='crm_contact[firstName]']")
    public WebElement Name;

    @Step("Заполняем поле ИМЯ")
    public NewPersonCreationPage FillName() throws InterruptedException {
        Name.sendKeys("TestName");
        Thread.sleep(3000);
        return this;
    }

    @FindBy(xpath = "//span[text()='Укажите организацию']")
    public WebElement chooseOrganization;

    @Step("Нажимаем на кнопку УКАЖИТЕ ОРГАНИЗАЦИЮ")
    public NewPersonCreationPage ChooseOrganization() throws InterruptedException {
        chooseOrganization.click();
        Thread.sleep(5000);
        return this;
    }

    @FindBy(xpath = "//ul/li/div[text()='1234']")
    public WebElement Organization;

    @Step("Ищем организацию по 1234")
    public NewPersonCreationPage FillOrganization() throws InterruptedException {
        Organization.click();
        Thread.sleep(5000);
        return this;
    }

    @FindBy(xpath = "//input[@name='crm_contact[jobTitle]']")
    public WebElement jobTitle;

    @Step("Заполняем название должности")
    public NewPersonCreationPage FillJobTitle() {
        jobTitle.sendKeys("Tester");
        return this;
    }

    @FindBy(xpath = "//select[@name='crm_contact[status]']")
    public WebElement statusSelect;

    @Step("Выбираем статус")
    public NewPersonCreationPage SelectStatus(String status) throws InterruptedException {
        new Select(statusSelect).selectByVisibleText(status);
        Thread.sleep(3000);
        return this;

    }

    @FindBy(css = "div#container div.controls > div > a")
    public WebElement phoneAdd;

    @Step("Нажимаем на поле добавления телефона")
    public NewPersonCreationPage FillPhone() throws InterruptedException {
        phoneAdd.click();
        Thread.sleep(3000);
        return this;

    }

    @FindBy(xpath = "//select[@name='crm_contact[phones][1][type]']")
    public WebElement Type;

    @Step("Заполняем тип телефона")
    public NewPersonCreationPage SelectType(String type) {
        new Select(Type).selectByVisibleText(type); //"Рабочий"
        return this;
    }

    @FindBy(xpath = "//input[@name='crm_contact[phones][1][prefixCode]']")
    public WebElement prefix;

    @Step("Заполняем префикс")
    public NewPersonCreationPage FillPrefix() {
        prefix.sendKeys("999");
        return this;
    }

    @FindBy(xpath = "//input[@name='crm_contact[phones][1][phone]']")
    public WebElement internalCode;

    @Step("Заполняем код")
    public NewPersonCreationPage FillInternalCode() {
        internalCode.sendKeys("899");
        return this;
    }

    @FindBy(xpath = "//button[contains(text(),'Сохранить и закрыть')]")
    public WebElement saveAndClose;

    @Step("Сохраняем и закрывам")
    public void SaveAndCloseButton() {
        saveAndClose.click();

    }

    @FindBy(xpath = "//div[contains(text(),'ФИО')]")
    public WebElement FIO;

    @Step("Нажимаем на фильтр по ФИО")
    public NewPersonCreationPage Filter() throws InterruptedException {
        FIO.click();
        Thread.sleep(5000);
        return this;
    }

    @FindBy(xpath = "//input[@name='value']")
    public WebElement FilterString;

    @Step("Заполняем поле фильтра")
    public NewPersonCreationPage FillFilterString() {
        FilterString.sendKeys("SixthSeptember");
        return this;
    }

    @FindBy(xpath = "//button[@class='btn btn-primary filter-update']")
    public WebElement renewButton;

    @Step("Нажимаем кнопку ОБНОВИТЬ")
    public NewPersonCreationPage PushRenewButton() throws InterruptedException {
        renewButton.click();
        Thread.sleep(5000);
        return this;
    }


}
