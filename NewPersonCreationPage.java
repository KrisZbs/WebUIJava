package Lesson6.GB_CRM;

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


    public NewPersonCreationPage SelectNewContactCreationButton() throws InterruptedException {

        NewContactCreationButton.click();
        Thread.sleep(5000);
        return this;
    }

    @FindBy(xpath = "//input[@name='crm_contact[lastName]']")
    public WebElement Surname;

    public NewPersonCreationPage FillSurname() throws InterruptedException {
        Surname.sendKeys("TestSurnameSixthSeptember");
        Thread.sleep(5000);
        return this;
    }

    @FindBy(xpath = "//input[@name='crm_contact[firstName]']")
    public WebElement Name;

    public NewPersonCreationPage FillName() throws InterruptedException {
        Name.sendKeys("TestName");
        Thread.sleep(3000);
        return this;
    }

    @FindBy(xpath = "//span[text()='Укажите организацию']")
    public WebElement chooseOrganization;

    public NewPersonCreationPage ChooseOrganization() throws InterruptedException {
        chooseOrganization.click();
        Thread.sleep(5000);
        return this;
    }

    @FindBy(xpath = "//ul/li/div[text()='1234']")
    public WebElement Organization;

    public NewPersonCreationPage FillOrganization() throws InterruptedException {
        Organization.click();
        Thread.sleep(5000);
        return this;
    }

    @FindBy(xpath = "//input[@name='crm_contact[jobTitle]']")
    public WebElement jobTitle;

    public NewPersonCreationPage FillJobTitle() {
        jobTitle.sendKeys("Tester");
        return this;
    }

    @FindBy(xpath = "//select[@name='crm_contact[status]']")
    public WebElement statusSelect;

    public NewPersonCreationPage SelectStatus(String status) throws InterruptedException {
        new Select(statusSelect).selectByVisibleText(status);
        Thread.sleep(3000);
        return this;

    }

    @FindBy(css = "div#container div.controls > div > a")
    public WebElement phoneAdd;

    public NewPersonCreationPage FillPhone() throws InterruptedException {
        phoneAdd.click();
        Thread.sleep(3000);
        return this;

    }

    @FindBy(xpath = "//select[@name='crm_contact[phones][1][type]']")
    public WebElement Type;

    public NewPersonCreationPage SelectType(String type) {
        new Select(Type).selectByVisibleText(type); //"Рабочий"
        return this;
    }

    @FindBy(xpath = "//input[@name='crm_contact[phones][1][prefixCode]']")
    public WebElement prefix;

    public NewPersonCreationPage FillPrefix() {
        prefix.sendKeys("999");
        return this;
    }

    @FindBy(xpath = "//input[@name='crm_contact[phones][1][phone]']")
    public WebElement internalCode;

    public NewPersonCreationPage FillInternalCode() {
        internalCode.sendKeys("899");
        return this;
    }

    @FindBy(xpath = "//button[contains(text(),'Сохранить и закрыть')]")
    public WebElement saveAndClose;

    public void SaveAndCloseButton() {
        saveAndClose.click();

    }

    @FindBy(xpath = "//div[contains(text(),'ФИО')]")
    public WebElement FIO;

    public NewPersonCreationPage Filter() throws InterruptedException {
        FIO.click();
        Thread.sleep(5000);
        return this;
    }

    @FindBy(xpath = "//input[@name='value']")
    public WebElement FilterString;

    public NewPersonCreationPage FillFilterString() {
        FilterString.sendKeys("SixthSeptember");
        return this;
    }

    @FindBy(xpath = "//button[@class='btn btn-primary filter-update']")
    public WebElement renewButton;

   public NewPersonCreationPage PushRenewButton() throws InterruptedException {
      renewButton.click();
      Thread.sleep(5000);
    return this;
    }


}
