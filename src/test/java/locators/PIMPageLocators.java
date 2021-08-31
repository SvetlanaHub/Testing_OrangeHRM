package locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class PIMPageLocators {

    //Menu

    public static final SelenideElement pim_menu = $x("//b[text()=\"PIM\"]");
    public static final SelenideElement add_employee_menu = $("#menu_pim_addEmployee");
    public static final SelenideElement employee_list_menu = $x("//a[text()=\"Employee List\"]");

    //Employee name

    public static final SelenideElement mark_ros = $x("//h1[text()=\"Mark Ros\"]");

    //Add employee form fields

    public static final SelenideElement first_name_field = $("#firstName");
    public static final SelenideElement last_name_field = $("#lastName");
    public static final SelenideElement employee_id_field = $("#employeeId");
    public static final SelenideElement photograph_field = $("#photofile");

    //Employee list form fields

    public static final SelenideElement personal_first_name_field = $("#personal_txtEmpFirstName");
    public static final SelenideElement personal_last_name_field = $("#personal_txtEmpLastName");
    public static final SelenideElement personal_employee_id_field = $("#personal_txtEmpLastName");
    public static final SelenideElement personal_gender_field = $("#personal_txtEmpLastName");

}
