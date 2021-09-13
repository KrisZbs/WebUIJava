package HomeWork6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Presets {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name='q']")
    public WebElement SearchField;

    @Step("Заполняем поле поиска")
    public MainPage fillSearchField() {
        SearchField.sendKeys("Чертоги разума. Убей в себе идиота!");
        return this;
    }

    @FindBy(xpath = "//button[@id='go']")
    public WebElement GoSearchBtn;

    @Step("Нажмаем кнопку поиска")
    public MainPage getSearch() {
        GoSearchBtn.click();
        return this;
    }


    @FindBy(xpath = "//span[@class='search__found']")
    public WebElement SearchResults;

    @Step("Выбираем 1 результат поиска")
    public MainPage someResult() {
        SearchResults.click();
        return this;
    }

    @FindBy(xpath = "//button[text()='Отложить']")
    public WebElement Delay;

    @Step("Нажимаем на кнопку ОТЛОЖИТЬ")
    public MainPage delayItem() {
        Delay.click();
        return this;
    }


}
