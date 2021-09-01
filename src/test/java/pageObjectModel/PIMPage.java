package pageObjectModel;

import io.qameta.allure.Step;
import java.io.File;

import static locators.DirectoryPageLocators.name_field;
import static locators.DirectoryPageLocators.search_button;
import static locators.PIMPageLocators.*;

public class PIMPage {

    //Values of fields in the add employee form

    public static final CharSequence FIRST_NAME = ("Mark");
    public static final CharSequence LAST_NAME = ("Ros");
    public static final CharSequence EMPLOYEE_ID = ("0277");
    private static final String PHOTOGRAPH = new File("src/main/resources/Sales Representative.png").getAbsolutePath();

    public static final CharSequence EMPLOYEE_NAME = ("Mark Ros");
    public static final CharSequence EMPLOYEE_MIDDLE_NAME = ("Ferson");

    @Step("Click menu PIM")
    public static void clickMenuPIM() {
        pim_menu.click();
    }

    @Step("Click add employee menu")
    public static void clickAddEmployeeMenu() {
        add_employee_menu.click();
    }

    @Step("Click employee list menu")
    public static void clickEmployeeListMenu() {
        employee_list_menu.click();
    }

    @Step("Enter the name")
    public static void enterTheEmployeeName() {
        employee_name_field.sendKeys(EMPLOYEE_NAME);
    }

    @Step("Click search link button")
    public static void clickSearchListButton() {
        search_list_button.click();
    }

    @Step("Click on name link")
    public static void clickOnNameLink() {
        name_link.click();
    }

    @Step("Click edit button")
    public static void clickEditButton() {
        edit_button.click();
    }

    @Step("Enter the middle name")
    public static void enterTheMiddleName() {
        personal_middle_name_field.sendKeys(EMPLOYEE_MIDDLE_NAME);
    }

    @Step("Click save list button")
    public static void clickSaveListButton() {
        save_List_button.click();
    }


    @Step("Enter the data in the form fields")
        public static void enterTheDataInTheFormFields() {
            first_name_field.sendKeys(FIRST_NAME);
            last_name_field.sendKeys(LAST_NAME);
            employee_id_field.clear();
            employee_id_field.sendKeys(EMPLOYEE_ID);
            photograph_field.sendKeys(PHOTOGRAPH);
        }
    }


