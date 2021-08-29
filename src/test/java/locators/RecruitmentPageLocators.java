package locators;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RecruitmentPageLocators {

    //Menu

    public static final SelenideElement recruitment_menu = $x("//b[text()='Recruitment']");
    public static final SelenideElement candidates_menu = $("#menu_recruitment_viewCandidates");

}
