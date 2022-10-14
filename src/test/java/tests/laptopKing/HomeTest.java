package tests.laptopKing;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.laptopKing.HomePage;
import tests.TestBase;

public class HomeTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        HomePage.open("https://laptopking.lt");
    }

    @Test
    private void testLoginAndAddAdditionalInfoInPersonalInfo(){
        String enterEmail = "b.mykolas@gmail.com";
        String enterPassword = "Testavimas";
        String enterCompanyName = "VCS";
        String enterCompanyCode = "123456789";
        String ReEnterValidPassword = "Testavimas";

        HomePage.clickOnLoginIcon();
        HomePage.enterValidEmail(enterEmail);
        HomePage.enterValidPassword(enterPassword);


        HomePage.sleep(2000);


    }
}
