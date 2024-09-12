package Tests.Serpil;

import Pages.AdminDashboard;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class US_52 {


    @Test (priority = 1)
    public void locations() throws InterruptedException {

       /* Launch browser
          Go to https://qa.hauseheaven.com/
          Login as admin by entering valid admin email and password.
          Confirm that the "Locations" heading is displayed.
     */

       //Go to https://qa.hauseheaven.com/
       Driver.getDriver().get(ConfigReader.getProperty("AdminDashUrl"));
       SoftAssert softAssert = new SoftAssert();
       AdminDashboard adminDashboard = new AdminDashboard();

       //Login as admin by entering valid admin email and password.
       adminDashboard.emailUsernameForm.sendKeys(ConfigReader.getProperty("AdminSerValidEmail"));
       adminDashboard.passwordForm.sendKeys(ConfigReader.getProperty("AdminSerValidPassword"));
       adminDashboard.signInButton.click();
       Thread.sleep(2000);

       // Confirm that the "Locations" heading is displayed.
       softAssert.assertTrue(adminDashboard.locationsButton.isDisplayed(), "Locations heading is not displayed.");

       softAssert.assertAll();
       //Close the page
       Driver.quitDriver();


    }

    @Test (priority = 2)
    public void LocationsMenu() throws InterruptedException {


       //Go to https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("AdminDashUrl"));
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();

        //Login as admin by entering valid admin email and password.
        adminDashboard.emailUsernameForm.sendKeys(utilities.ConfigReader.getProperty("AdminSerValidEmail"));
        adminDashboard.passwordForm.sendKeys(utilities.ConfigReader.getProperty("AdminSerValidPassword"));
        adminDashboard.signInButton.click();
        Thread.sleep(2000);



        // Confirm that the 'Locations' heading is displayed.
        softAssert.assertTrue(adminDashboard.locationsButton.isDisplayed(), "Locations heading is not displayed.");

        //Click on the "Locations' heading
        adminDashboard.locationsButton.click();

        //Verify that the 'Countries' option is displayed and active.
        softAssert.assertTrue(adminDashboard.countriesButton.isDisplayed(), "'Countries' option is not displayed");
        Thread.sleep(2000);
        adminDashboard.countriesButton.click();
        softAssert.assertTrue(adminDashboard.countriesButton.isEnabled(),"'Countries' option is not enabled");

        //Verify that the 'States' option is displayed and active.
        softAssert.assertTrue(adminDashboard.statesButton.isDisplayed(), "'States' option is not displayed");
        Thread.sleep(2000);
        adminDashboard.statesButton.click();
        softAssert.assertTrue(adminDashboard.statesButton.isEnabled(),"'States' option is not enabled");
        //Verify that the 'Cities' option is displayed and active.
        Thread.sleep(2000);
        softAssert.assertTrue(adminDashboard.citiesButton.isDisplayed(), "'Cities' option is not displayed");
        Thread.sleep(2000);
        adminDashboard.citiesButton.click();
        softAssert.assertTrue(adminDashboard.citiesButton.isEnabled(),"'Cities' option is not enabled");
        softAssert.assertAll();
        //Close the page
        Driver.quitDriver();



    }

}
