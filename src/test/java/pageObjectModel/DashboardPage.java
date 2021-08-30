package pageObjectModel;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class DashboardPage {

    public static final SelenideElement welcome_message = $("#welcome");
    public static final ElementsCollection quick_launge = $$(".quickLaunge");

}
