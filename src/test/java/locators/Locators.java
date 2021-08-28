package locators;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Locators {

                              //Locators for Login Page
    //Login form fields
    public static final SelenideElement username_field = $("#txtUsername");
    public static final SelenideElement password_field = $("#txtPassword");

    //Button
    public static final SelenideElement login_button = $("#btnLogin");


                              //Locators for Admin Page

    //Buttons
    public static final SelenideElement admin_button = $x("//b[text()='Admin']");
    public static final SelenideElement add_button = $("#btnAdd");
    public static final SelenideElement save_button = $("#btnSave");

    //User add form fields
    public static final SelenideElement user_role_field = $("#systemUser_userType");
    public static final SelenideElement employee_name_field = $x("//input[@id=\"systemUser_employeeName_empName\"]");
    //public static final SelenideElement username_field = $("#systemUser_userName");
    public static final SelenideElement status_field = $("#systemUser_status");
    //public static final SelenideElement password_field = $("#systemUser_password");
    public static final SelenideElement confirm_password_field = $("#systemUser_confirmPassword");


}
