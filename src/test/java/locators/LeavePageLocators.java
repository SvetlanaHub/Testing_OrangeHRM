package locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LeavePageLocators {

    //Menu

    public static final SelenideElement leave_menu = $("#menu_leave_viewLeaveModule");
    public static final SelenideElement assign_leave_menu = $("#menu_leave_assignLeave");
    public static final SelenideElement leave_list_menu = $("#menu_leave_viewLeaveList");

    //Assign leave form fields

    public static final SelenideElement employee_name_field_assign = $x("//input[@id='assignleave_txtEmployee_empName']");
    public static final SelenideElement leave_type_field_assign = $x("//select[@id='assignleave_txtLeaveType']");
    public static final SelenideElement from_date_field = $x("//input[@id='assignleave_txtFromDate']");
    public static final SelenideElement to_date_field = $x("//input[@id='assignleave_txtToDate']");

    //Assign button

    public static final SelenideElement assign_button = $("#assignBtn");

    //Checkbox

    public static final SelenideElement checkbox_all = $x("//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']");

    //User employee name

    public static final SelenideElement anthony_nolan = $x("//a[text()=\"Anthony Nolan\"]");


}
