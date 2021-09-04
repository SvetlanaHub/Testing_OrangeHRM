package tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.junit5.ScreenShooterExtension;
import locators.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.RegisterExtension;
import pageObjectModel.*;

import static com.codeborne.selenide.Condition.*;
import static locators.PIMPageLocators.*;
import static pageObjectModel.AdminPage.*;
import static pageObjectModel.DirectoryPage.*;
import static pageObjectModel.LeavePage.*;
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


    @Description("Form validation with employee details")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Form validation with employee details")
    @Link("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployee/empNumber/18")
    @Flaky
    @Test
    @Disabled
    @Order(3)
    @DisplayName("Employee details")

    void testEmployeeDetails() {

        PIMPage.clickMenuPIM();
                clickEmployeeListMenu();
                clickOnName();
        personal_first_name_field.shouldBe(visible);
        personal_first_name_field.shouldHave(text("Anthony"));
        personal_last_name_field.shouldBe(visible);
        personal_last_name_field.shouldHave(text("Nolan"));
        personal_employee_id_field.shouldBe(visible);
        personal_employee_id_field.shouldHave(text("0070"));
        personal_gender_field.shouldBe(visible);
        personal_gender_field.shouldBe(enabled);
        nationality_field.shouldBe(visible);
        nationality_field.shouldHave(text("Canadian"));
        marital_status_field.shouldBe(visible);
        marital_status_field.shouldHave(text("Married"));
        date_of_birth_field.shouldBe(visible);
        date_of_birth_field.shouldHave(text("1970-02-10"));

    }


    @Description("Checking leave assignment")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Assign leave")
    @Link("https://opensource-demo.orangehrmlive.com/index.php/leave/assignLeave")
    @Test
    @Order(4)
    @DisplayName("Assign leave")

    void testAssignLeave() {

        LeavePage.clickMenuLeave();
                  clickAssignLeaveMenu();
                  enterTheDataInTheAssignLeaveFormFields();
                  clickAssignButton();
                  clickOKInConfirmDialog();
                  clickLeaveListMenu();
                  clickСheckboxAll();
                  clickButtonSearch();
        LeavePageLocators.anthony_nolan.shouldHave(text("Anthony Nolan"));

    }


    @Description("Checking for adding a three job titles")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Add job title to the site")
    @Link("https://opensource-demo.orangehrmlive.com/index.php/admin/saveJobTitle")
    @Test
    @Order(5)
    @DisplayName("Add three job titles")

    void testAddJobTitle() {

        AdminPage.clickAdminButton();
                  clickMenuAdminJob();
                  clickMenuJobTitles();
                  clickAddJobTitlesButton();
                  enterTheDataInTheFieldsAddTheFirstJobTitle();
                  clickSaveButton();
                  clickAddJobTitlesButton();
                  enterTheDataInTheFieldsAddTheSecondJobTitle();
                  clickSaveButton();
                  clickAddJobTitlesButton();
                  enterTheDataInTheFieldsAddTheThirdJobTitle();
                  clickSaveButton();
        AdminPageLocators.job_titles.shouldHave(CollectionCondition.exactTexts("AQA engineer","AQA Team Lead","AQA tester"));

    }


    @Description("Checking delete of three job titles")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Delete job titles to the site")
    @Link("https://opensource-demo.orangehrmlive.com/index.php/admin/viewJobTitleList")
    @Test
    @Order(6)
    @DisplayName("Delete three job titles")

    void testDeleteJobTitle() {

        AdminPage.clickAdminButton();
                  clickMenuAdminJob();
                  clickMenuJobTitles();
                  clickThreeCheckbox();
                  clickDeleteButton();
                  clickOKInTheDialog();
        AdminPageLocators.job_titles.shouldHave(CollectionCondition.size(0));

    }


    @Description("Checking for adding a candidate without validating the form")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Add candidate to the site")
    @Link("https://opensource-demo.orangehrmlive.com/index.php/recruitment/viewCandidates")
    @Test
    @Order(7)
    @DisplayName("Add candidate")

    void testAddСandidate() {

        RecruitmentPage.clickMenuRecruitment();
        AdminPage.clickAddButton();
                  clickSaveButton();
        RecruitmentPageLocators.required_message.shouldHave(CollectionCondition.size(3));

    }


    @Description("Checking the addition of an employee")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Add employee to the site")
    @Link("https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee")
    @Test
    @Order(8)
    @DisplayName("Add employee to the site")

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
    @Order(9)
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


    @Description("Check the presence of elements in the dashboard")
    @Owner("Svetlana Petrovich")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Presence of elements in the dashboard")
    @Link("https://opensource-demo.orangehrmlive.com/index.php/dashboard")
    @Test
    @Order(10)
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
    @Order(11)
    @DisplayName("Search for personnel")

    void testSearchForPersonnel() {

        DirectoryPage.clickDirectoryMenu();
                      enterTheName();
                      clickSearchButton();
        DirectoryPageLocators.name.shouldHave(text("Cecil Bonaparte"));

    }

}
