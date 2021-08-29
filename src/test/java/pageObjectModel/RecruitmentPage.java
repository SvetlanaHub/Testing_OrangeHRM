package pageObjectModel;

import io.qameta.allure.Step;
import static locators.RecruitmentPageLocators.*;
import static locators.AdminPageLocators.*;

public class RecruitmentPage {

    @Step("Add candidate")

    public static void addCandidate() {

        recruitment_button.click();
        candidates_button.click();
        add_button.click();

    }

}
