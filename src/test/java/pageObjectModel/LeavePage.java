package pageObjectModel;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;
import static locators.AdminPageLocators.employee_name_field;
import static locators.LeavePageLocators.*;

public class LeavePage {

    //Data

    public static final CharSequence LEAVE_TYPE = (CharSequence) $x("//select[@id='assignleave_txtLeaveType']//child::option [6]");
    public static final String EMPLOYEE_NAME_LEAVE = ("Anthony Nolan");
    public static final CharSequence FROM_DATE = ("2021-09-14");
    public static final CharSequence TO_DATE = ("2021-09-22");


    @Step("Click menu Leave")
    public static void clickMenuLeave() {
        leave_menu.click();
    }

    @Step("Click assign leave menu")
    public static void clickAssignLeaveMenu() {
        assign_leave_menu.click();
    }

    @Step("Enter the data in the assign leave form fields")
    public static void enterTheDataInTheAssignLeaveFormFields() {
        employee_name_field_assign.sendKeys(EMPLOYEE_NAME_LEAVE);
        leave_type_field_assign.sendKeys(LEAVE_TYPE);
        from_date_field.sendKeys(FROM_DATE);
        to_date_field.sendKeys(TO_DATE);
    }

    @Step("Click assign button")
    public static void clickAssignButton() {
        assign_button.pressEnter();
    }

    @Step("Click leave list menu")
    public static void clickLeaveListMenu() {
        leave_list_menu.click();
    }
    @Step("Click checkbox all")
    public static void clickСheckboxAll() {
        checkbox_all.click();
    }
}


