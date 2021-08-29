package locators;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class LoginPageLocators {

    //Login form fields
    public static final SelenideElement username_field = $("#txtUsername");
    public static final SelenideElement password_field = $("#txtPassword");

    //Button
    public static final SelenideElement login_button = $("#btnLogin");

}
