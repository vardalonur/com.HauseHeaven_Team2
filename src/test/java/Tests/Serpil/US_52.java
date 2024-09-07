package Tests.Serpil;

import Pages.AdminDashboard;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class US_52 {

    @Test

    public void locations() throws InterruptedException {

       /* Launch browser
          Go to https://qa.hauseheaven.com/
          Login as admin by entering valid admin email and password.
          Confirm that the "Locations' heading is displayed.
     */

       Driver.getDriver().get(ConfigReader.getProperty("AdminSerUrl"));
       SoftAssert softAssert = new SoftAssert();
       AdminDashboard adminDashboard = new AdminDashboard();
       adminDashboard.emailUsernameFormu.sendKeys(ConfigReader.getProperty("AdminSerValidEmail"));
       adminDashboard.passwordFormu.sendKeys(ConfigReader.getProperty("AdminSerValidPassword"));
       adminDashboard.signInButonu.click();
       Thread.sleep(2000);
     //  softAssert.assertTrue(adminDashboard.locationsButton.isDisplayed(), "Locations heading is not displayed.");
       softAssert.assertAll();
       //Driver.closeDriver();

    }



    public void LocationsMenu() throws InterruptedException {

        /*Launch browser
      Go to https://qa.hauseheaven.com/
      Confirm that the "Locations' heading is displayed.
      Click on the "Locations' heading.
      Verify that the 'Countries,' 'States,' and 'Cities' options are displayed
      Click on the "Countries" option and verify that the page loads successfully.
      Click on the "States" option and verify that the page loads successfully.
      Click on the "Cities" option and verify that the page loads successfully.

     */

        Driver.getDriver().get(ConfigReader.getProperty("AdminSerUrl"));
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.emailUsernameFormu.sendKeys(utilities.ConfigReader.getProperty("AdminSerValidEmail"));
        adminDashboard.passwordFormu.sendKeys(utilities.ConfigReader.getProperty("AdminSerValidPassword"));
        adminDashboard.signInButonu.click();
        Thread.sleep(2000);
      /*  softAssert.assertTrue(adminDashboard.locationsButton.isDisplayed(), "Locations heading is not displayed.");
        adminDashboard.locationsButton.click();
        softAssert.assertTrue(adminDashboard.countriesButton.isDisplayed(), "'Countries' option is not displayed");
        Thread.sleep(2000);
        adminDashboard.countriesButton.click();
        softAssert.assertTrue(adminDashboard.statesButton.isDisplayed(), "'States' option is not displayed");
        Thread.sleep(2000);
        softAssert.assertTrue(adminDashboard.citiesButton.isDisplayed(), "'Cities' option is not displayed");
        Thread.sleep(2000);
       adminDashboard.citiesButton.click();
*/
    }
}
