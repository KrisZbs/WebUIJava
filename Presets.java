package HomeWork6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Presets {
    WebDriver driver;
    WebDriverWait webDriverWait;

    public Presets (WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
}
