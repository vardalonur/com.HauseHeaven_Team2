package Tests.Onur;

import Pages.AdminDashboard;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
//go to "https://qa.hauseheaven.com/admin"
//Enter a valid email and password and click login
//Expand "Real Estate" on the left menu
//"Verify the tabs are shown on the list:
//[Properties, Projects, Features, Facilities, Investors, Categories, Types, Reviews, Settings]"
//Click on each tab in the dropdown menu and verify that the buttons work.
public class US_34 {
    @Test
    public void realEstateMenuTest() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();


        //go to "https://qa.hauseheaven.com/admin"
        utilities.Driver.getDriver().get(utilities.ConfigReader.getProperty("AdminDashUrl"));

        //Enter a valid email and password and click login
        adminDashboard.emailUsernameForm.sendKeys(utilities.ConfigReader.getProperty("AdminGecerliEmail"));
        adminDashboard.passwordForm.sendKeys(utilities.ConfigReader.getProperty("AdminGecerliPassword"));
        adminDashboard.signInButton.click();

        //Expand "Real Estate" on the left menu
        adminDashboard.realEstateButton.click();

        //"Verify the tabs are shown on the list:
        //"[Properties, Projects, Features, Facilities, Investors, Categories, Types, Reviews, Settings]"
        //Click on each tab in the dropdown menu and verify that the buttons work.
        adminDashboard.propertiesButton.click();
        softAssert.assertTrue(adminDashboard.propertiesConfirm.isDisplayed());

        adminDashboard.projectsButton.click();
        softAssert.assertTrue(adminDashboard.projectsConfirm.isDisplayed());

        adminDashboard.featuresButton.click();
        softAssert.assertTrue(adminDashboard.featuresConfirm.isDisplayed());

        adminDashboard.facilitiesButton.click();
        softAssert.assertTrue(adminDashboard.facilitiesConfirm.isDisplayed());

        adminDashboard.investorsButton.click();
        softAssert.assertTrue(adminDashboard.investorsConfirm.isDisplayed());

        adminDashboard.categoriesButton.click();
        softAssert.assertTrue(adminDashboard.categoriesConfirm.isDisplayed());

        adminDashboard.typesButton.click();
        softAssert.assertTrue(adminDashboard.typesConfirm.isDisplayed());

        adminDashboard.reviewsButton.click();
        softAssert.assertTrue(adminDashboard.reviewsConfirm.isDisplayed());

        adminDashboard.settingsButton.click();
        softAssert.assertTrue(adminDashboard.settingsConfirm.isDisplayed());

        softAssert.assertAll();
        Driver.quitDriver();
    }
}
