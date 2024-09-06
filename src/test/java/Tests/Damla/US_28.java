package Tests.Damla;

import Pages.AdminDashboard;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class US_28 {
    WebDriver driver;

    @Test
    public void TC01(){

        //The opened page is tested.

        //Go to https://qa.hauseheaven.com/admin/login
        Driver.getDriver().get(ConfigReader.getProperty("AdminDashUrl"));

        AdminDashboard adminDashboard=new AdminDashboard();

        //Enter the relevant data in the Email field.
        adminDashboard.emailUsernameForm.sendKeys(ConfigReader.getProperty("AdminGecerliEmail"));

        //Enter the relevant data in the password field.
        adminDashboard.passwordForm.sendKeys(ConfigReader.getProperty("AdminGecerliPassword"));

        //Click the Sign in button.
        adminDashboard.signInButton.click();



    }




}
