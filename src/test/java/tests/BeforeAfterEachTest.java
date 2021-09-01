package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import pageElement.LogoutPageElement;
import pageObjectModel.DashboardPage;
import pageObjectModel.LoginPage;
import utils.WebEventListener;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.WebDriverRunner.addListener;
import static pageObjectModel.LoginPage.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BeforeAfterEachTest {

    @Description("Login test with a valid username and password")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.BLOCKER)
    @Feature("Login to the site")
    @Link("https://opensource-demo.orangehrmlive.com/")
    @BeforeEach
    @Test
    @Order(1)
    @DisplayName("Login")

    public void testSetuplogin() {

        Configuration.startMaximized = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        addListener(new WebEventListener());
        LoginPage.openLoginPage();
                  login();
        DashboardPage.welcome_message.shouldBe(visible);

    }

    @Description("Log out test")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Log out of the site")
    @Link("https://opensource-demo.orangehrmlive.com/index.php/dashboard")
    @AfterEach
    @Test
    @Order(11)
    @DisplayName("Log out")

    public void testTearDownLogout ()  {

        DashboardPage.welcome_message.click();
        LogoutPageElement.logout();
        closeWebDriver();

    }
}
