package StepDefinitons;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps  {
    DialogContent dc=new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        GWD.getDriver().get("https://test.mersys.io/");


    }

    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {

       dc.sendKeysFunction(dc.username,dc.findFromExcel("UserName"));
       dc.sendKeysFunction(dc.password,dc.findFromExcel("Password"));
       dc.clickFunction(dc.loginButton);
    }

    @Then("User should login succesfully")
    public void user_should_login_succesfully() {
        dc.verifyCotainsTextFunction(dc.txtTechnoStudy,"Techno Study Intern School");


    }

}
