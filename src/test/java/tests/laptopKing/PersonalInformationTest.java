package tests.laptopKing;

import org.testng.annotations.BeforeMethod;
import pages.laptopKing.PersonalInformationPage;
import tests.TestBase;

public class PersonalInformationTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        PersonalInformationPage.open("https://laptopking.lt/asmenine-informacija");
    }
}
