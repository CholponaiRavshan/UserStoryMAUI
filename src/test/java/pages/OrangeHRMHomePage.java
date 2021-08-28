package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class OrangeHRMHomePage {
   public OrangeHRMHomePage(){
       WebDriver driver= Driver.getDriver();
       PageFactory.initElements(driver,this);
   }
   @FindBy(id = "menu_admin_viewAdminModule")
    public WebElement adminButton;
   @FindBy(id = "btnAdd")
    public WebElement addButton;


}
