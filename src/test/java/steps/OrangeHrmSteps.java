package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.OrangeHRMAddUserPage;
import pages.OrangeHRMHomePage;
import pages.OrangeHRMLoginPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class OrangeHrmSteps {
    WebDriver driver= Driver.getDriver();
   OrangeHRMLoginPage orangeHRMLoginPage=new OrangeHRMLoginPage();
   OrangeHRMHomePage orangeHRMHomePage=new OrangeHRMHomePage();
   OrangeHRMAddUserPage orangeHRMAddUserPage=new OrangeHRMAddUserPage();




    @Given("user navigates to the opensource-demo application")
    public void user_navigates_to_the_opensource_demo_application() {
       driver.get(ConfigReader.getProperty("OrangeHrmURL"));
    }
    @When("user login  in with username {string} password {string}")
    public void userLoginInWithUsernamePassword(String username, String password) {
        orangeHRMLoginPage.username.sendKeys(username);
        orangeHRMLoginPage.password.sendKeys(password);
        orangeHRMLoginPage.loginButton.click();
    }


    @When("user clicks on Admin tab")
    public void user_clicks_on_Admin_tab() {
       orangeHRMHomePage.adminButton.click();

    }

    @When("user clicks on Add button")
    public void user_clicks_on_Add_button() {
       orangeHRMHomePage.addButton.click();
    }

    @When("user provide user data")
    public void user_provide_user_data(DataTable dataTable)  {
        Map<String, Object> data = dataTable.asMap(String.class, Object.class);
        BrowserUtils.selectByText(orangeHRMAddUserPage.userRoleButton,data.get("User Role").toString());
        orangeHRMAddUserPage.employeeName.sendKeys(data.get("Employee Name").toString());
        orangeHRMAddUserPage.usernameButton.sendKeys(data.get("Username").toString());
        BrowserUtils.selectByText(orangeHRMAddUserPage.statusButton,data.get("Status").toString());
        orangeHRMAddUserPage.passwordButton.sendKeys(data.get("Password").toString());
        orangeHRMAddUserPage.confirmPassword.sendKeys(data.get("Confirm Password").toString());
    }

    @When("user clicks save button")
    public void user_clicks_save_button() {
       orangeHRMAddUserPage.saveButton.click();
    }


    @Then("validates that new user name is created with success message {string}")
    public void validatesThatNewUserNameIsCreatedWithSuccessMessage(String expectedSuccessMessage) {
        String actualSuccessMessage="Successfully saved";
        Assert.assertEquals(expectedSuccessMessage,actualSuccessMessage);
    }
}
