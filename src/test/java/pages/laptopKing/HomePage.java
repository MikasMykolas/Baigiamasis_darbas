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
    public static void clickButtonPrisijungti() {
        Common.clickElement(Locators.LaptopKing.LoginAndAddInfo.buttonSubmitLogin);
    }
    public static void clickButtonInformacija() {
        Common.clickElement(Locators.LaptopKing.LoginAndAddInfo.spanButtonInformation);
    }
    public static void enterFullCompanyName(String enterCompanyName) {
        Common.sendKeysToElement(enterCompanyName,
                Locators.LaptopKing.LoginAndAddInfo.inputCompanyName);
    }
    public static void enterFullCompanyCode(String enterCompanyCode) {
        Common.sendKeysToElement(enterCompanyCode,
                Locators.LaptopKing.LoginAndAddInfo.inputCompanyCode);
    }
    public static void ReEnterValidPassword(String enterValidPassword) {
        Common.sendKeysToElement(enterValidPassword,
                Locators.LaptopKing.LoginAndAddInfo.reInputValidPassword);
    }
    public static void clickButtonIssaugoti() {
        Common.clickElement(Locators.LaptopKing.LoginAndAddInfo.buttonSubmitSave);
    }
    public static String readConfirmChangesMessage() {
        return Common.getElementText(Locators.LaptopKing.LoginAndAddInfo.readArticleNotificationText);
    }
}
