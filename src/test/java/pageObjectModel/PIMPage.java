package pageObjectModel;

import io.qameta.allure.Step;
import java.io.File;
import static locators.PIMPageLocators.*;

public class PIMPage {

    //Values of fields in the add employee form

    public static final CharSequence FIRST_NAME = ("Mark");
    public static final CharSequence LAST_NAME = ("Ros");
    public static final CharSequence EMPLOYEE_ID = ("0277");
    private static final String PHOTOGRAPH = new File("src/main/resources/Sales Representative.png").getAbsolutePath();

    @Step("Click menu PIM")
    public static void clickMenuPIM() {
        pim_menu.click();
    }

    @Step("Click add employee menu")
    public static void clickAddEmployeeMenu() {
        add_employee_menu.click();
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

