package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrangeHRMAddUserPage {
    public OrangeHRMAddUserPage(){
        WebDriver driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "systemUser_userType")
    public WebElement userRoleButton;
    @FindBy(id = "systemUser_employeeName_empName")
    public WebElement employeeName;
    @FindBy(id = "systemUser_userName")
    public WebElement usernameButton;
    @FindBy(id = "systemUser_status")
    public WebElement statusButton;
    @FindBy(id = "systemUser_password")
    public WebElement passwordButton;
    @FindBy(id = "systemUser_confirmPassword")
    public WebElement confirmPassword;
    @FindBy(id = "btnSave")
    public WebElement saveButton;
}
