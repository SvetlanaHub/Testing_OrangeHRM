package pageObjectModel;

import static locators.LoginPageLocators.*;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    //Data

    public static final CharSequence USERNAME = ("Admin");
    public static final CharSequence PASSWORD = ("admin123");


    @Step("Login")
    public static void login() {

        username_field.sendKeys(USERNAME);
        password_field.sendKeys(PASSWORD);
        login_button.click();

    }
    @Step("Open login page")
    public static void openLoginPage(){

        open("https://opensource-demo.orangehrmlive.com/");

    }
}

