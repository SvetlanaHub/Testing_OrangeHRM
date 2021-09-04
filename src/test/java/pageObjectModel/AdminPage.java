package pageObjectModel;

import static locators.AdminPageLocators.*;
import io.qameta.allure.Step;
import java.io.File;
public class AdminPage {

    //Values of fields in the add user form

    public static final String EMPLOYEE_NAME = ("Anthony Nolan");
    public static final CharSequence USERNAME = ("antonito");
    public static final CharSequence PASSWORD = ("378-admin-UX");
    public static final String CONFIRM_PASSWORD = ("378-admin-UX");

    //Values of fields in the add job titles

    public static final String JOB_TITLE_1 = ("AQA engineer");
    public static final String JOB_TITLE_2 = ("AQA Team Lead");
    public static final String JOB_TITLE_3 = ("AQA tester");
    public static final String JOB_DESCRIPTION = ("Development of automated tests to validate the functionality of web applications");
    public static final String JOB_DESCRIPTION_3 = ("Testing of web applications");
    private static final String JOB_SPECIFICATION_1 = new File("src/main/resources/AQA1.jpg").getAbsolutePath();
    private static final String JOB_SPECIFICATION_2 = new File("src/main/resources/AQA2.jpg").getAbsolutePath();
    public static final String NOTE = ("-");


    @Step("Click admin button")
    public static void clickAdminButton() {
        admin_button.click();
    }

    @Step("Click add button")
    public static void clickAddButton() {
        add_button.click();
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

    @Step("Enter the data in the fields add the first job title")
    public static void enterTheDataInTheFieldsAddTheFirstJobTitle() {

        job_title_field.sendKeys(JOB_TITLE_1);
        job_description_field.sendKeys(JOB_DESCRIPTION);
        job_specification_field.sendKeys(JOB_SPECIFICATION_1);
        note_field.sendKeys(NOTE);

    }

    @Step("Enter the data in the fields add the second job title")
    public static void enterTheDataInTheFieldsAddTheSecondJobTitle() {

        job_title_field.sendKeys(JOB_TITLE_2);
        job_description_field.sendKeys(JOB_DESCRIPTION);
        job_specification_field.sendKeys(JOB_SPECIFICATION_2);
        note_field.sendKeys(NOTE);
    }

    @Step("Enter the data in the fields add the third job title")
    public static void enterTheDataInTheFieldsAddTheThirdJobTitle() {

        job_title_field.sendKeys(JOB_TITLE_3);
        job_description_field.sendKeys(JOB_DESCRIPTION_3);

    }

    @Step("Click three checkbox")
    public static void clickThreeCheckbox() {

        checkbox_1.click();
        checkbox_2.click();
        checkbox_3.click();
    }

    @Step("Click delete button")
    public static void clickDeleteButton() {
        delete_button.click();
    }

    @Step("Click OK in the dialog")
    public static void clickOKInTheDialog() {
        dialog_delete_button.click();
    }

}