package locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DirectoryPageLocators {

    //Menu

    public static final SelenideElement directory_menu = $x("//b[text()='Directory']");

    //Search directory form fields

    public static final SelenideElement name_field = $x("//input[@id='searchDirectory_emp_name_empName']");

    //Search button

    public static final SelenideElement search_button = $("#searchBtn");

    //Name

    public static final SelenideElement name = $x("//b[text()='Lisa Andrews']");
}
