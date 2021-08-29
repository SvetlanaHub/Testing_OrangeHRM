package tests;

import com.codeborne.selenide.junit5.ScreenShooterExtension;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.RegisterExtension;
import pageObjectModel.*;
import static com.codeborne.selenide.Condition.visible;
import static pageObjectModel.AdminPage.*;
import static pageObjectModel.LoginPage.*;
import io.qameta.allure.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class TestLogin extends BeforeAfterAll {

    @RegisterExtension
    static ScreenShooterExtension screenshotEmAll = new ScreenShooterExtension(true).to("resources/screenshots");

    @Description("Login test with a valid username and password")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.BLOCKER)
    @Feature("Login to the site")
    @Link("https://opensource-demo.orangehrmlive.com/")
    @Test
    @Order(1)
    @DisplayName("Login")

    void testLogin() {

        openLoginPage();
        login();
        DashboardPage.welcome.shouldBe(visible);

    }

    @Description("Checking for added user")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Add user to the site")
    @Link("https://opensource-demo.orangehrmlive.com/index.php/admin/saveSystemUser")
    @Test
    @Order(2)
    @DisplayName("Add user")

    void testAddUser() {

        openLoginPage();
        login();
        clickAdminButton();
        clickAddButton();
        enterTheDataInTheFieldsAddUser();
        clickSaveButton();

    }

    @Description("Checking for adding a job title")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Add job title to the site")
    @Link("https://opensource-demo.orangehrmlive.com/index.php/admin/saveJobTitle")
    @Test
    @Order(3)
    @DisplayName("Add job title")

    void testAddJobTitle() {

        openLoginPage();
        login();
        clickAdminButton();
        clickMenuAdminJob();
        clickMenuJobTitles();
        clickAddJobTitlesButton();
        enterTheDataInTheFieldsAddJobTitles();
        clickSaveButton();

    }

    @Description("Checking for adding a candidate")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Add candidate to the site")
    @Link("https://opensource-demo.orangehrmlive.com/index.php/recruitment/viewCandidates")
    @Test
    @Order(4)
    @DisplayName("Add candidate")

    void testAddСandidate() {

        openLoginPage();
        login();


    }



}
