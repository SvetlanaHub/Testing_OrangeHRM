package pageObjectModel;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static pageObjectModel.AdminPage.add_button;

public class RecruitmentPage {

    //Buttons

    public static final SelenideElement recruitment_button = $x("//b[text()='Recruitment']");
    public static final SelenideElement candidates_button = $("#menu_recruitment_viewCandidates");

    @Step("Add candidate")
    public static void addCandidate() {

        recruitment_button.click();
        candidates_button.click();
        add_button.click();

    }

}
