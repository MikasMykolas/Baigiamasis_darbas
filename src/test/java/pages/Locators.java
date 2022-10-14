package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class LaptopKing {
        public static class CreateAccount {
            public static By inputFirstName = By.xpath("//input[@name='firstname']");
            public static By inputLastName = By.xpath("//input[@name='lastname']");
            public static By inputEmail = By.xpath("//input[@name='email']");
            public static By inputPassword = By.xpath("//input[@name='password']");
            public static By buttonSubmitCreateAccount = By.xpath
                    ("//button[@class='btn btn-primary form-control-submit']");
            public static By spanReadLoginIconText = By.xpath("//*[@id='header-user-btn']/a/span");
        }
        public static class LoginAndAddInfo{
            public static By headerClickLoginIcon = By.xpath("//*[@id='header-user-btn']/a");
            public static By inputValidEmail = By.xpath
                    ("//*[@id='login-form']/section/div[1]/div[1]/input");
            public static By inputValidPassword = By.xpath
                    ("//*[@id='login-form']/section/div[2]/div[1]/div/input");
            public static By buttonSubmitLogin = By.xpath("//button[@id='submit-login']");
            public static By spanButtonInformation = By.xpath("//a[@id='identity-link']");
            public static By inputCompanyName = By.xpath("//input[@name='company']");
            public static By inputCompanyCode = By.xpath("//input[@name='siret']");
            public static By reInputValidPassword = By.xpath
                    ("//*[@id='customer-form']/section/div[6]/div[1]/div/input");
            public static By buttonSubmitSave = By.xpath
                    ("//button[@class='btn btn-primary form-control-submit']");
            public static By readArticleNotificationText = By.xpath
                    ("//aside[@id='notifications']");

        }
    }
}
