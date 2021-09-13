package Lesson6.GB_CRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class СounteragentSubMenu extends Presets{
    public СounteragentSubMenu(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "//li//a//span[text()='Контактные лица']")
    public WebElement newPersonItem;


    public void GoToNewPersonCreationPage(){
        newPersonItem.click();



    }
}
