package tests;

import com.codeborne.selenide.junit5.ScreenShooterExtension;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.RegisterExtension;
import pageObjectModel.*;
import static com.codeborne.selenide.Condition.visible;
import static pageObjectModel.LoginPage.openLoginPage;

import io.qameta.allure.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class TestLogin extends BeforeAfterAll {

    @RegisterExtension
    static ScreenShooterExtension screenshotEmAll = new ScreenShooterExtension(true).to("resources/screenshots");

    @Description("Login test with a valid username and password")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.BLOCKER)
    @Feature("Blocker")
    @Link("https://opensource-demo.orangehrmlive.com/")
    @Test
    @Order(1)
    @DisplayName("Login")

    public void testLogin() {

        openLoginPage();
        LoginPage.login();
        DashboardPage.welcome.shouldBe(visible);

    }
}
