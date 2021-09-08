package Lesson6.GB_CRM;


import org.openqa.selenium.WebDriver;

public class MainPage extends Presets {
public  NavigationMenu navigationMenu;

    public MainPage(WebDriver driver) {
        super(driver);
        navigationMenu = new NavigationMenu(driver);
    }
}
