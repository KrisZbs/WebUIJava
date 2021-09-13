package Lesson7;

import HomeWork6.LoginPage;
import HomeWork6.MainPage;
import HomeWork6.ProfilePage;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LitresTest extends Preset_test {
    private Object WebElement;

    @Test
    @Description("Логин")

    public void loginTest() throws InterruptedException {
        new LoginPage(driver).login();
    }

    @Test
    @Description("Поиск книги и добавление в избранное")
    public void delayTest() throws InterruptedException {
        new LoginPage(driver).login();
        Thread.sleep(10000);
        new MainPage(driver).fillSearchField().getSearch();
        Thread.sleep(10000);
        new MainPage(driver).someResult().delayItem();
        Thread.sleep(5000);
        org.openqa.selenium.WebElement result = driver.findElement(By.
                xpath("//button[@class='art-button art-buttons__favorite art-buttons__favorite_active']"));
        Assertions.assertEquals("ОТЛОЖЕНО", result.getText());

    }

    @Test
    @Description("Изменение ФИО в профиле")
    public void ChangeFIOTest() throws InterruptedException {
        new LoginPage(driver).login();
        Thread.sleep(20000);
        new ProfilePage(driver).goToProfile().aboutMeClick().fioClick().fillName().fillSurname().okClick();
        Thread.sleep(10000);
        WebElement FIOResult = driver.findElement(By.xpath("//div[@class='personal-about__text-value']"));
        Assertions.assertEquals("Testname Test",FIOResult.getAttribute("innerHTML"));
    }
}
