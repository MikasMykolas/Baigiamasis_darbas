package pages.laptopKing;

import pages.Common;
import pages.Locators;

public class HomePage {

    public static void open(String url){
        Common.openUrl(url);
    }
    public static void sleep(int millis) {
        Common.sleep(millis);
    }
    public static void clickOnLoginIcon() {
        Common.clickElement(Locators.LaptopKing.LoginAndAddInfo.headerClickLoginIcon);
    }
    public static void enterValidEmail(String enterEmail) {
        Common.sendKeysToElement(enterEmail,
                Locators.LaptopKing.LoginAndAddInfo.inputValidEmail);
    }


    public static void enterValidPassword(String enterPassword) {
        Common.sendKeysToElement(enterPassword,
                Locators.LaptopKing.LoginAndAddInfo.inputValidPassword);
    }
}
