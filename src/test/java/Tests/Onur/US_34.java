package Tests.Onur;

import Pages.AdminDashboard;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.TestBaseRapor;

//go to "https://qa.hauseheaven.com/admin"
//Enter a valid email and password and click login
//Expand "Real Estate" on the left menu
//"Verify the tabs are shown on the list:
//[Properties, Projects, Features, Facilities, Investors, Categories, Types, Reviews, Settings]"
//Click on each tab in the dropdown menu and verify that the buttons work.
public class US_34 extends TestBaseRapor {
    @Test
    public void realEstateMenuTest() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();

        extentTest = extentReports.createTest("realEstateMenuTest",
                "Checking the Real Estate Dropdown Menu");

        //go to "https://qa.hauseheaven.com/admin"
        utilities.Driver.getDriver().get(utilities.ConfigReader.getProperty("AdminDashUrl"));
        extentTest.info("go to \"https://qa.hauseheaven.com/admin\"");

        //Enter a valid email and password and click login
        adminDashboard.emailUsernameForm.sendKeys(utilities.ConfigReader.getProperty("AdminGecerliEmail"));
        adminDashboard.passwordForm.sendKeys(utilities.ConfigReader.getProperty("AdminGecerliPassword"));
        adminDashboard.signInButton.click();
        extentTest.info("Enter a valid email and password and click login");

        //Expand "Real Estate" on the left menu
        adminDashboard.realEstateButton.click();
        extentTest.info("Expand \"Real Estate\" on the left menu");

        //"Verify that the tabs that appear in the list are opened and displayed:
        //"[Properties, Projects, Features, Facilities, Investors, Categories, Types, Reviews, Settings]"
        //Click on each tab in the dropdown menu and verify that the buttons work.
        adminDashboard.propertiesButton.click();
        softAssert.assertTrue(adminDashboard.propertiesConfirm.isDisplayed());
        extentTest.pass("Verify the Properties tab is displayed");


        adminDashboard.projectsButton.click();
        softAssert.assertTrue(adminDashboard.projectsConfirm.isDisplayed());
        extentTest.pass("Verify the Projects tab is displayed");

        adminDashboard.featuresButton.click();
        softAssert.assertTrue(adminDashboard.featuresConfirm.isDisplayed());
        extentTest.pass("Verify the Features tab is displayed");

        adminDashboard.facilitiesButton.click();
        softAssert.assertTrue(adminDashboard.facilitiesConfirm.isDisplayed());
        extentTest.pass("Verify the Facilities tab is displayed");

        adminDashboard.investorsButton.click();
        softAssert.assertTrue(adminDashboard.investorsConfirm.isDisplayed());
        extentTest.pass("Verify the Investors tab is displayed");

        adminDashboard.categoriesButton.click();
        softAssert.assertTrue(adminDashboard.categoriesConfirm.isDisplayed());
        extentTest.pass("Verify the Categories tab is displayed");

        adminDashboard.typesButton.click();
        softAssert.assertTrue(adminDashboard.typesConfirm.isDisplayed());
        extentTest.pass("Verify the Types tab is displayed");

        adminDashboard.reviewsButton.click();
        softAssert.assertTrue(adminDashboard.reviewsConfirm.isDisplayed());
        extentTest.pass("Verify the Reviews tab is displayed");

        adminDashboard.settingsButton.click();
        softAssert.assertTrue(adminDashboard.settingsConfirm.isDisplayed());
        extentTest.pass("Verify the Settings tab is displayed");

        softAssert.assertAll();

    }
}
