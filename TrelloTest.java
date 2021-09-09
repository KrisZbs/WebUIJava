package Lesson6.CRMGB;


import Lesson6.Trello.T_MainPage;
import Lesson6.Trello.T_loginPage;
import org.junit.jupiter.api.Test;


public class TrelloTest extends PresetsTests {


    @Test
    public void LoginToTrelloTest() throws InterruptedException {
        new T_loginPage(driver).LoginToTrello();

    }

    @Test
    public void NewSampleBoardTest() throws InterruptedException {
        new T_loginPage(driver).LoginToTrello();

        new T_MainPage(driver)
                .createSample()
                .findSampleClick()
                .useSampleClick()
                .fillBoardNewTitle()
                .createButtonClick();
    }

    @Test
    public void NewBoardCreationTest() throws InterruptedException {

        new T_loginPage(driver).LoginToTrello();
        Thread.sleep(5000);

        new T_MainPage(driver)
                .createNewBoard()
                .boardCreationBtn().fillBoardTitle().newBoardCreationApprove();


    }
}






