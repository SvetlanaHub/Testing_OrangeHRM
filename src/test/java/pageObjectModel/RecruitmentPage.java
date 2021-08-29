package pageObjectModel;

import io.qameta.allure.Step;
import static locators.RecruitmentPageLocators.*;
import static locators.AdminPageLocators.*;

public class RecruitmentPage {

    @Step("Add candidate")

    public static void addCandidate() {

        recruitment_menu.click();
        candidates_menu.click();
        add_button.click();

    }

}
