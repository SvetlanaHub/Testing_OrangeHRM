package pageElement;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class LogoutPageElement {

    //Log out link

    public static final SelenideElement logout_link = $x("//a[text()=\"Logout\"]");

    @Step("Logout")
    public static void logout() {

        logout_link.click();

    }
}
