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
    public static final SelenideElement mark_ferson_ros = $x("//h1[text()=\"Mark Ferson Ros\"]");

    //Employee name link

    public static final SelenideElement name_link = $x("//a[text()=\"Mark\"]");

    //Add employee form fields

    public static final SelenideElement first_name_field = $("#firstName");
    public static final SelenideElement last_name_field = $("#lastName");
    public static final SelenideElement employee_id_field = $("#employeeId");
    public static final SelenideElement photograph_field = $("#photofile");

    //Employee list form fields

    public static final SelenideElement employee_name_field = $x("//input[@id='empsearch_employee_name_empName']");

    public static final SelenideElement personal_first_name_field = $("#personal_txtEmpFirstName");
    public static final SelenideElement personal_middle_name_field = $("#personal_txtEmpMiddleName");
    public static final SelenideElement personal_last_name_field = $("#personal_txtEmpLastName");
    public static final SelenideElement personal_employee_id_field = $("#personal_txtEmpLastName");
    public static final SelenideElement personal_gender_field = $("#personal_txtEmpLastName");

    //Button

    public static final SelenideElement search_list_button = $x("//input[@id='searchBtn']");
    public static final SelenideElement edit_button = $x("//input[@id='btnSave']");
    public static final SelenideElement save_List_button = $x("//input[@id='btnSave']");


}
