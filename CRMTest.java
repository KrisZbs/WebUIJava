package Lesson7;

import Lesson6.CRMGB.PresetsTests;
import Lesson6.GB_CRM.LoginPage;
import Lesson6.GB_CRM.NewPersonCreationPage;
import Lesson6.GB_CRM.СounteragentSubMenu;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class CRMTest extends Preset_test {


    @Test
    @Description("Создание нового контактного лица")
    public void NewContactCreationFormTest() throws InterruptedException {
        new LoginPage(driver)
                .LoginToGB()
                .navigationMenu
                .openNavigationMenuItem("Контрагенты");


        new СounteragentSubMenu(driver).GoToNewPersonCreationPage();
        Thread.sleep(5000);
        new NewPersonCreationPage(driver)
                .SelectNewContactCreationButton()

                .FillSurname()
                .FillName()
                .ChooseOrganization()
                .FillOrganization()
                .FillJobTitle()
                .SelectStatus("Активный")
                .FillPhone()
                .SelectType("Рабочий")
                .FillPrefix()
                .FillInternalCode()
                .SaveAndCloseButton();


    }

    @Test
    @Description("Проверка создания нового контактного лица")
    public void NewContactCreationIsSuccessfulTest() throws InterruptedException {

        new LoginPage(driver).LoginToGB().navigationMenu.openNavigationMenuItem("Контрагенты");
        new СounteragentSubMenu(driver).GoToNewPersonCreationPage();
        Thread.sleep(5000);

        new NewPersonCreationPage(driver).Filter().FillFilterString().PushRenewButton();
        WebElement FilterCheckUp = driver.findElement(By.xpath("//td[text()='TestSurnameSixthSeptember TestName']"));
        Assertions.assertEquals("TestSurnameSixthSeptember TestName", FilterCheckUp.getAttribute("innerText"));


    }


}

