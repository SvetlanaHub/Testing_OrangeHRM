package pageObjectModel;

import static locators.AdminPageLocators.*;
import io.qameta.allure.Step;
import java.io.File;
public class AdminPage {

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
