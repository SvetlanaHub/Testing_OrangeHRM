package pageObjectModel;

import io.qameta.allure.Step;
import static locators.RecruitmentPageLocators.*;


public class RecruitmentPage {

    @Step("Click menu recruitment")
    public static void clickMenuRecruitment() {
        recruitment_menu.click();
    }


}
