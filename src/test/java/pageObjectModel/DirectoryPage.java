package pageObjectModel;

import io.qameta.allure.Step;
import static locators.DirectoryPageLocators.*;

public class DirectoryPage {

    //Value of field in the directory form field

    public static final CharSequence NAME = ("Cecil Bonaparte");

    @Step("Click directory menu")
    public static void clickDirectoryMenu() {
        directory_menu.click();
    }


    @Step("Enter the name")
    public static void enterTheName() {
        name_field.sendKeys(NAME);
    }

    @Step("Click search button")
    public static void clickSearchButton() {
        search_button.click();
    }
}
