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

    }

}
