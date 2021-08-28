package pageObjectModel;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AdminPage {

    //Buttons
    public static final SelenideElement admin_button = $x("//b[text()='Admin']");
    public static final SelenideElement add_button = $("#btnAdd");
    public static final SelenideElement save_button = $("#btnSave");

    //User add form fields
    public static final SelenideElement user_role_field = $("#systemUser_userType");
    public static final SelenideElement employee_name_field = $("#systemUser_employeeName_empName");
    public static final SelenideElement username_field = $("#systemUser_userName");
    public static final SelenideElement status_field = $("#systemUser_status");
    public static final SelenideElement password_field = $("#systemUser_password");
    public static final SelenideElement confirm_password_field = $("#systemUser_confirmPassword");

    //Values of fields in the add user form

    public static final CharSequence EMPLOYEE_NAME = ("Anthony Nolan");
    public static final CharSequence USERNAME = ("anthony");
    public static final CharSequence PASSWORD = ("378-admin-UX");
    public static final CharSequence CONFIRM_PASSWORD = ("378-admin-UX");

    @Step("Click admin button")

    public static void clickAdminButton() {
        admin_button.click();
    }

    @Step("Click add button")
    public static void clickAddButton() {
        add_button.click();;
    }

    @Step("Enter the employee name")
    public static void enterTheEmployeeName() {
        employee_name_field.sendKeys(EMPLOYEE_NAME);
    }

    @Step("Enter the username")
    public static void enterTheUsername() {
        username_field.sendKeys(USERNAME);
    }

    @Step("Enter the password")
    public static void enterThePassword() {
        password_field.sendKeys(PASSWORD);
    }

    @Step("Confirm password")
    public static void confirmPassword() {
        confirm_password_field.sendKeys(CONFIRM_PASSWORD);
    }

    @Step("Click save button")
    public static void clickSaveButton() {
        save_button.click();
    }

}
