package pageObjectModel;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import io.qameta.allure.Step;

public class LoginPage {

    //Login form fields
    public static final SelenideElement username_field = $("#txtUsername");
    public static final SelenideElement password_field = $("#txtPassword");

    //Button
    public static final SelenideElement login_button = $("#btnLogin");

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

