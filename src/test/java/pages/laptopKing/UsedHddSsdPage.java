package pages.laptopKing;

import pages.Common;
import pages.Locators;

public class UsedHddSsdPage {

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickButtonToAddItem() {
        Common.clickElement(Locators.LaptopKing.AddItemsToCart.clickButtonAddItemOne);
    }

      public static void clickContinueShopping() {
        Common.clickElement(Locators.LaptopKing.AddItemsToCart.clickButtonContinueShopping);
    }

    public static String readCartItemValue() {
        return Common.getElementText(Locators.LaptopKing.AddItemsToCart.paragraphReadItemCartText);
    }
}
