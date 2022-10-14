package tests.laptopKing;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Common;
import pages.Locators;
import pages.laptopKing.HomePage;
import tests.TestBase;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class HomeTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        HomePage.open("https://laptopking.lt");
    }

    @Test
    private void testLoginAndAddAdditionalInfoInPersonalInfo() {
        String enterEmail = "b.mykolas@gmail.com";
        String enterPassword = "Testavimas";
        String enterCompanyName = "VCS";
        String enterCompanyCode = "123456789";
        String enterValidPassword = "Testavimas";
        String expectedConfirmChangesMessage = "Informacija atnaujinta.";
        String actualConfirmChangesMessage;

        HomePage.clickOnLoginIcon();
        HomePage.enterValidEmail(enterEmail);
        HomePage.enterValidPassword(enterPassword);
        HomePage.clickButtonPrisijungti();
        HomePage.clickButtonInformacija();
        HomePage.enterFullCompanyName(enterCompanyName);
        HomePage.enterFullCompanyCode(enterCompanyCode);
        HomePage.ReEnterValidPassword(enterValidPassword);
        HomePage.clickButtonIssaugoti();
        actualConfirmChangesMessage = HomePage.readConfirmChangesMessage();

        Assert.assertEquals(actualConfirmChangesMessage, expectedConfirmChangesMessage);
    }

    @Test
    private void testLoginWithInvalidPassword() {
        String enterEmail = "b.mykolas@gmail.com";
        String enetInvalidPassword = "badpassword";
        String expectedAlertMessage = "Identifikavimas nepavyko";
        String actualAlertMessage;

        HomePage.clickOnLoginIcon();
        HomePage.enterValidEmail(enterEmail);
        HomePage.enterValidPassword(enetInvalidPassword);
        HomePage.clickButtonPrisijungti();
        actualAlertMessage = HomePage.readAlertMessage();

        Assert.assertTrue(actualAlertMessage.contains(expectedAlertMessage));
    }
}


