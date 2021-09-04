package locators;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class AdminPageLocators {

    //Buttons

    public static final SelenideElement admin_button = $x("//b[text()='Admin']");
    public static final SelenideElement add_button = $("#btnAdd");
    public static final SelenideElement save_button = $("#btnSave");
    public static final SelenideElement add_job_titles_button = $("#btnAdd");

    //User add form fields

    public static final SelenideElement employee_name_field = $x("//input[@id=\"systemUser_employeeName_empName\"]");
    public static final SelenideElement username_field = $("#systemUser_userName");
    public static final SelenideElement password_field = $("#systemUser_password");
    public static final SelenideElement confirm_password_field = $("#systemUser_confirmPassword");

    //User employee name

    public static final SelenideElement anthony_nolan = $x("//td[text()=\"Anthony Nolan\"]");

    //Add job titles fields

    public static final SelenideElement job_title_field = $("#jobTitle_jobTitle");
    public static final SelenideElement job_description_field = $("#jobTitle_jobDescription");
    public static final SelenideElement job_specification_field = $("#jobTitle_jobSpec");
    public static final SelenideElement note_field = $("#jobTitle_note");

    //Locators for job title

    public static final SelenideElement menu_admin_Job = $("#menu_admin_Job");
    public static final SelenideElement menu_job_titles = $("#menu_admin_viewJobTitleList");

    //Job titles

    public static final ElementsCollection job_titles = $$x("//a[starts-with(text(),'QA')]");


}
