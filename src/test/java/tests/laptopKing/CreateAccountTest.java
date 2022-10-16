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
        String enterName = "Vardenis";
        String enterSurname = "Pavardenis";
        String enterEmail = "p.vardenis@gmail.com";
        String enterPassword = "Testavimas123";
        String expectedTextOnLoginIcon = "Vardenis";
        String actualTextOnLoginIcon;

        CreateAccountPage.enterFullName(enterName);
        CreateAccountPage.enterFullSurname(enterSurname);
        CreateAccountPage.enterFullEmail(enterEmail);
        CreateAccountPage.enterFullPassword(enterPassword);
        CreateAccountPage.clickButtonIssaugoti();
        actualTextOnLoginIcon = CreateAccountPage.readLoginIconText();

        Assert.assertEquals(actualTextOnLoginIcon, expectedTextOnLoginIcon);
    }
}

