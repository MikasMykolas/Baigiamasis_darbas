package tests.laptopKing;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.laptopKing.UsedHddSsdPage;
import tests.TestBase;

public class UsedHddSsdTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        UsedHddSsdPage.open("https://laptopking.lt/300-naudoti-hddssd");
    }

    @Test
    private void testAddItemToTheCart() {
        String expectedItemCartValue = "1";
        String actualItemCartValue;


        UsedHddSsdPage.clickbuttonToAddItem();
        UsedHddSsdPage.clickContinueShopping();

        actualItemCartValue = UsedHddSsdPage.readCartItemValue();

        Assert.assertTrue(actualItemCartValue.contains(expectedItemCartValue),
                String.format(
                        "Actualt results [%s]; Expected reuslts [%s]",
                        actualItemCartValue,
                        expectedItemCartValue)
        );
    }
}
