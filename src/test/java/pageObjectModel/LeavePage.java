package pageObjectModel;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;
import static locators.AdminPageLocators.employee_name_field;
import static locators.LeavePageLocators.*;

public class LeavePage {

    //Data
    public static final SelenideElement LEAVE_TYPE = $x("//select[@id='assignleave_txtLeaveType']//child::option [6]");
    public static final CharSequence EMPLOYEE_NAME_LEAVE = ("Anthony Nolan");

    @Step("Click menu Leave")
    public static void clickMenuLeave() {
        leave_menu.click();
    }

    @Step("Click Assign Leave menu")
    public static void clickAssignLeaveMenu() {
        assign_leave_menu.click();
    }

    @Step("Enter the data in the assign leave form fields")
    public static void enterTheDataInTheAssignLeaveFormFields() {
        employee_name_field.sendKeys(EMPLOYEE_NAME_LEAVE);
        leave_type_field.sendKeys();
        from_date_field.sendKeys();
        to_date_field.sendKeys();
        comment_field.sendKeys();
    }
}


