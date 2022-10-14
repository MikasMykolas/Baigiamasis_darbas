package tests.laptopKing;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.laptopKing.CreateAccountPage;
import tests.TestBase;

public class CreateAccountTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        CreateAccountPage.open("https://laptopking.lt/prisijungimas?create_account=1");
    }

    @Test
    private void testToCreateAccount() {
        String enterName = "Mykolas";
        String enterSurname = "Brazauskas";
        String enterEmail = "b.mykolas@gmail.com";
        String enterPassword = "Testavimas";
        String expectedTextOnLoginIcon = "Mykolas";
        String actualTextOnLoginIcon;

        CreateAccountPage.enterFullName(enterName);
        CreateAccountPage.enterFullSurname(enterSurname);
        CreateAccountPage.enterFullEmail(enterEmail);
        CreateAccountPage.enterFullPassword(enterPassword);
        CreateAccountPage.clickButtonIssaugoti();
        actualTextOnLoginIcon = CreateAccountPage.readLoginIconText();

        Assert.assertEquals(actualTextOnLoginIcon, expectedTextOnLoginIcon);



        CreateAccountPage.sleep(2000);


    }


}

