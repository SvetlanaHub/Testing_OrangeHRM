package locators;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RecruitmentPageLocators {

    //Buttons

    public static final SelenideElement recruitment_button = $x("//b[text()='Recruitment']");
    public static final SelenideElement candidates_button = $("#menu_recruitment_viewCandidates");

}
