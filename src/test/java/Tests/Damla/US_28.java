package Tests.Damla;

import Pages.AdminDashboard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

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

    @Test
    public void TC02(){

        //Go to https://qa.hauseheaven.com/admin/login
        Driver.getDriver().get(ConfigReader.getProperty("AdminDashUrl"));

        AdminDashboard adminDashboard=new AdminDashboard();

       // Enter the relevant data in the Email field.
        adminDashboard.emailUsernameForm.sendKeys(ConfigReader.getProperty("AdminGecerliEmail"));

       // Enter the relevant data in the password field.
        adminDashboard.passwordForm.sendKeys(ConfigReader.getProperty("AdminGecerliPassword"));

       // Click the Sign in button.
        adminDashboard.signInButton.click();

       // The top navigation bar is displayed.
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(adminDashboard.topNavBar.isDisplayed());

       // The buttons on the top navigation bar are active.
        softAssert.assertTrue(adminDashboard.topNavBarButton.isEnabled());

        //The Sidebar is displayed.
        softAssert.assertTrue(adminDashboard.sideBar.isDisplayed());


        Driver.quitDriver();



    }




}
