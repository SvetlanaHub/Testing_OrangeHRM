package tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.junit5.ScreenShooterExtension;
import locators.AdminPageLocators;
import locators.DirectoryPageLocators;
import locators.PIMPageLocators;
import locators.RecruitmentPageLocators;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.RegisterExtension;
import pageObjectModel.*;

import static com.codeborne.selenide.Condition.text;
import static pageObjectModel.AdminPage.*;
import static pageObjectModel.DirectoryPage.*;
import static pageObjectModel.PIMPage.*;

import io.qameta.allure.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class Tests extends BeforeAfterEachTest {

    @RegisterExtension
    static ScreenShooterExtension screenshotEmAll = new ScreenShooterExtension(true).to("resources/screenshots");


    @Description("Checking for added user with form validation")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Add user to the site")
    @Link("https://opensource-demo.orangehrmlive.com/index.php/admin/saveSystemUser")
    @Test
    @Order(2)
    @DisplayName("Add user")

    void testAddUser() {

        AdminPage.clickAdminButton();
                  clickAddButton();
                  enterTheDataInTheFieldsAddUser();
                  clickSaveButton();
        AdminPageLocators.anthony_nolan.shouldHave(text("Anthony Nolan"));

    }

    @Description("Checking for adding a three job title")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Add job title to the site")
    @Link("https://opensource-demo.orangehrmlive.com/index.php/admin/saveJobTitle")
    @Test
    @Order(3)
    @DisplayName("Add job title")

    void testAddJobTitle() {

        AdminPage.clickAdminButton();
                  clickMenuAdminJob();
                  clickMenuJobTitles();
                  clickAddJobTitlesButton();
                  enterTheDataInTheFieldsAddJobTitles();
                  clickSaveButton();

    }

    @Description("Checking delete of three job titles")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Delete job titles to the site")
    //@Link("https://opensource-demo.orangehrmlive.com/index.php/admin/saveJobTitle")
    @Test
    @Order(4)
    @DisplayName("Delete job titles")

    void testDeleteJobTitle() {

        //AdminPage.clickAdminButton();
        //clickMenuAdminJob();
        //clickMenuJobTitles();
        //clickAddJobTitlesButton();
        //enterTheDataInTheFieldsAddJobTitles();
        //clickSaveButton();

    }

    @Description("Checking for adding a candidate without validating the form")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Add candidate to the site")
    @Link("https://opensource-demo.orangehrmlive.com/index.php/recruitment/viewCandidates")
    @Test
    @Order(5)
    @DisplayName("Add candidate")

    void testAddСandidate() {

        AdminPage.clickAddButton();
                  clickSaveButton();
        RecruitmentPageLocators.required_message.shouldHave(CollectionCondition.exactTexts("Required"));

    }

    @Description("Checking leave assignment")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Assign leave")
    @Link("https://opensource-demo.orangehrmlive.com/index.php/leave/assignLeave")
    @Test
    @Order(8)
    @DisplayName("Assign leave")

    void testAssignLeave() {

        AdminPage.clickAddButton();
        clickSaveButton();
        RecruitmentPageLocators.required_message.shouldHave(CollectionCondition.exactTexts("Required"));

    }

    @Description("Check the presence of elements in the dashboard")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Presence of elements in the dashboard")
    @Link("https://opensource-demo.orangehrmlive.com/index.php/dashboard")
    @Test
    @Order(9)
    @DisplayName("Check the presence of elements")

    void testPresenceOfElements() {

        DashboardPage.quick_launge.shouldHave(CollectionCondition.size(6));

    }

    @Description("Checking the search for personnel by category (name)")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Search for personnel")
    @Link("https://opensource-demo.orangehrmlive.com/index.php/directory/viewDirectory/reset/1")
    @Test
    @Order(10)
    @DisplayName("Search for personnel")

    void testSearchForPersonnel() {

        DirectoryPage.clickDirectoryMenu();
                      enterTheName();
                      clickSearchButton();
        DirectoryPageLocators.name.shouldHave(text("Cecil Bonaparte"));

    }

    @Description("Checking the addition of an employee")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Add employee to the site")
    @Link("https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee")
    @Test
    @Order(6)
    @DisplayName("Add employee")

    void testAddEmployee() {

        PIMPage.clickMenuPIM();
                clickAddEmployeeMenu();
                enterTheDataInTheFormFields();
        AdminPage.clickSaveButton();
        PIMPageLocators.mark_ros.shouldHave(text("Mark Ros"));

    }

    @Description("Checking employee edits")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Employee editing")
    @Link("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployee/empNumber/54")
    @Test
    @Order(7)
    @DisplayName("Employee editing")

    void testEditEmployee() {

        PIMPage.clickMenuPIM();
                clickEmployeeListMenu();
                enterTheEmployeeName();
                clickSearchListButton();
                clickOnNameLink();
                clickEditButton();
                enterTheMiddleName();
                clickSaveListButton();
        PIMPageLocators.mark_ferson_ros.shouldHave(text("Mark Ferson Ros"));

    }

}
