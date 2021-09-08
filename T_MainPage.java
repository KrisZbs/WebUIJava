package Lesson6.Trello;

import Lesson6.GB_CRM.Presets;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T_MainPage extends Presets {
    public T_MainPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//span[text()='Шаблоны']")
    public WebElement SampleButton;



    public T_MainPage createSample() {
        SampleButton.click();

        return this;
    }

    /*@FindBy(xpath = "//li//a//span[text()='Проектирование']")
    public WebElement Sample_Engineering;
    public T_MainPage engineeringSample(){
     WebDriverWait webDriverWait = new WebDriverWait(driver,10);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath
                ("//li//a//span[text()='Проектирование']")));
        SampleButton.click();
        return this;
    }*/
    @FindBy(xpath = "//div[text()='Найти шаблон']")
    public WebElement FindSampleButton;

    public T_MainPage findSampleClick() {

      SampleButton.click();
      SampleButton.sendKeys("Agile Sprint Board");
        return this;
    }

    @FindBy(xpath = "//button[text()='Использование шаблона']")
    public WebElement UseSampleButton;

    public T_MainPage useSampleClick() {
        UseSampleButton.click();
        return this;
    }

    @FindBy(xpath = "//input[@id='boardNewTitle']")
    public WebElement BoardNewTitle;

    public T_MainPage fillBoardNewTitle() {
        BoardNewTitle.sendKeys("Doing homework");

        return this;
    }

    @FindBy(css = "div#chrome-container input.nch-button.nch-button--primary.wide.js-submit")
    public WebElement CreateButton;

    public T_MainPage createButtonClick() {
        CreateButton.click();
        return this;
    }



/*
    @FindBy(xpath = "//div[@class='board-tile mod-add']")
    public WebElement createNewBoardButton;

    public T_MainPage(WebDriver driver) {
        super(driver);
    }


    public T_MainPage createNewBoard() {
        createNewBoardButton.click();
        return this;
    }

    @FindBy(xpath = "//span[text()='Создать доску']")
    public WebElement boardCreationMenu;

    public T_MainPage boardCreationBtn() throws InterruptedException {
        boardCreationMenu.click();
        Thread.sleep(20000);
        return  this;
    }

    @FindBy(xpath = "//input[@placeholder='Добавить заголовок доски']")
    public WebElement boardTitle;

    public T_MainPage fillBoardTitle() throws InterruptedException {
        //WebDriverWait webDriverWait = new WebDriverWait(driver, 20);
        //webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Добавить заголовок доски']")));
        Actions actions = new Actions(driver);
        actions.moveByOffset(520,266).click().sendKeys("asdgadgsd");
        //actions.sendKeys(boardTitle, "Homework");

       // boardTitle.click();
       // boardTitle.sendKeys("Doing the 6th homeWork");
        //driver.findElement(By.xpath("//input[@placeholder='Добавить заголовок доски']")).sendKeys(" Doing the homeWork");
        return this;


    }


    @FindBy(xpath = "//button[text()='Создать доску']")
    public WebElement boardCreationConfirmButton;

    public T_MainPage newBoardCreationApprove() throws InterruptedException {
        boardCreationConfirmButton.click();
        Thread.sleep(500);
        return this;
    }

*/
}
