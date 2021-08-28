package pageObjectModel;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import java.io.File;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AdminPage {

    //Buttons

    public static final SelenideElement admin_button = $x("//b[text()='Admin']");
    public static final SelenideElement add_button = $("#btnAdd");
    public static final SelenideElement save_button = $("#btnSave");
    public static final SelenideElement add_job_titles_button = $("#btnAdd");


    //User add form fields

    public static final SelenideElement user_role_field = $("#systemUser_userType");
    public static final SelenideElement employee_name_field = $x("//input[@id=\"systemUser_employeeName_empName\"]");
    public static final SelenideElement username_field = $("#systemUser_userName");
    public static final SelenideElement status_field = $("#systemUser_status");
    public static final SelenideElement password_field = $("#systemUser_password");
    public static final SelenideElement confirm_password_field = $("#systemUser_confirmPassword");

    //Add job titles fields

    public static final SelenideElement job_title_field = $("#jobTitle_jobTitle");
    public static final SelenideElement job_description_field = $("#jobTitle_jobDescription");
    public static final SelenideElement job_specification_field = $("#jobTitle_jobSpec");
    public static final SelenideElement note_field = $("#jobTitle_note");

    //Values of fields in the add user form

    public static final String EMPLOYEE_NAME = ("Anthony Nolan");
    public static final CharSequence USERNAME = ("anthony");
    public static final CharSequence PASSWORD = ("378-admin-UX");
    public static final String CONFIRM_PASSWORD = ("378-admin-UX");

    //Values of fields in the add job titles

    public static final String JOB_TITLE = ("QA automation engineer");
    public static final String JOB_DESCRIPTION = ("Development of automated tests to validate the functionality of web applications");
    private static final String JOB_SPECIFICATION = new File("src/main/resources/AQA.jpg").getAbsolutePath();
    public static final String NOTE = ("-");
    //private static final ElementsCollection removeButton = $$x("//button[contains(@data-test, 'remove')]");


    //Locators for job title
    public static final SelenideElement menu_admin_Job = $("#menu_admin_Job");
    public static final SelenideElement menu_job_titles = $("#menu_admin_viewJobTitleList");



    @Step("Click admin button")
    public static void clickAdminButton() {
        admin_button.click();
    }

    @Step("Click add button")
    public static void clickAddButton() {
        add_button.click();;
    }

    @Step("Enter the data in the fields")
    public static void enterTheDataInTheFieldsAddUser() {

        employee_name_field.sendKeys(EMPLOYEE_NAME);
        username_field.sendKeys(USERNAME);
        password_field.sendKeys(PASSWORD);
        confirm_password_field.sendKeys(CONFIRM_PASSWORD);

    }

    @Step("Click save button")
    public static void clickSaveButton() {
        save_button.click();
    }

    @Step("Click menu admin job")
    public static void clickMenuAdminJob() {
        menu_admin_Job.click();
    }

    @Step("Click menu job titles")
    public static void clickMenuJobTitles() {
        menu_job_titles.click();
    }

    @Step("Click add job titles button")
    public static void clickAddJobTitlesButton() {
        add_job_titles_button.click();
    }

    @Step("Enter the data in the fields add job titles")
    public static void enterTheDataInTheFieldsAddJobTitles() {

        job_title_field.sendKeys(JOB_TITLE);
        job_description_field.sendKeys(JOB_DESCRIPTION);
        job_specification_field.sendKeys(JOB_SPECIFICATION);
        note_field.sendKeys(NOTE);

    }
}
