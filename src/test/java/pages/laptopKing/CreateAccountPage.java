package pages.laptopKing;

import pages.Common;
import pages.Locators;

public class CreateAccountPage {


    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void sleep(int millis) {
        Common.sleep(millis);
    }

    public static void enterFullName(String enterName) {
        Common.sendKeysToElement(enterName,
                Locators.LaptopKing.CreateAccount.inputFirstName);
    }
    public static void enterFullSurname(String enterSurname) {
        Common.sendKeysToElement(enterSurname,
                Locators.LaptopKing.CreateAccount.inputLastName);
    }
    public static void enterFullEmail(String enterEmail) {
        Common.sendKeysToElement(enterEmail,
                Locators.LaptopKing.CreateAccount.inputEmail);
    }
    public static void enterFullPassword(String enterPassword) {
        Common.sendKeysToElement(enterPassword,
                Locators.LaptopKing.CreateAccount.inputPassword);
    }

    public static void clickButtonIssaugoti() {
        Common.clickElement(Locators.LaptopKing.CreateAccount.buttonSubmitCreateAccount);
    }

    public static String readLoginIconText() {
        return Common.getElementText(Locators.LaptopKing.CreateAccount.spanReadLoginIconText);
    }
}
