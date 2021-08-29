package pageObjectModel;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LeavePage {

    //Data
    public static final SelenideElement LEAVE_TYPE = $x("//select[@id='assignleave_txtLeaveType']//child::option [6]");
}
