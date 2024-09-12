package Tests.Serpil;

import Pages.Listing;
import Pages.UserDashboard;
import Pages.WebsiteMain;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_05 {

    @Test(priority = 1)
    public void footerVisibilityTest(){


//Go to https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));
        SoftAssert softAssert = new SoftAssert();
        UserDashboard userDashboard = new UserDashboard();
        Listing listing = new Listing();
        WebsiteMain websiteMain = new WebsiteMain();

//Verify that the homepage loads correctly.

        softAssert.assertTrue(websiteMain.homeButton.isDisplayed(), "Home button is not displayed.");
        ReusableMethods.bekle(2);

//Verify that the footer section is visible at the bottom of the homepage.
//Close the page





    }
}
