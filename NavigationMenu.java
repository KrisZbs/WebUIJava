package Lesson6.GB_CRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;



import java.util.List;

public class NavigationMenu extends Presets {

    @FindBy (xpath = "//div/ul[@class='nav nav-multilevel main-menu']/li")
    public List<WebElement> NavigationMenuItems;

    public NavigationMenu(WebDriver driver) {
        super(driver);
    }


    public void openNavigationMenuItem(final String menuName){
        Actions actions = new Actions(driver);
        actions.moveToElement(NavigationMenuItems.stream().filter
                (element -> element.getText().equals(menuName)).findFirst().get()).perform();


    }
}
