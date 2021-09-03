package pageElements;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PageElements {

    public static final SelenideElement login_panel = $("#logInPanelHeading");
    public static final SelenideElement welcome_message = $x("//a[starts-with(text(),'Welcome')]");
    public static final SelenideElement logout_link = $x("//a[text()=\"Logout\"]");

    @Step("Logout")
    public static void logout() {

        logout_link.click();

    }
}
