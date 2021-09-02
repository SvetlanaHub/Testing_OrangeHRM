package locators;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class RecruitmentPageLocators {

    //Menu

    public static final SelenideElement recruitment_menu = $("#menu_recruitment_viewRecruitmentModule");

    //Message

    public static final ElementsCollection required_message = $$x("//span[text()='Required']");

}
