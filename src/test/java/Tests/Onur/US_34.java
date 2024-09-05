package Tests.Onur;

import Pages.AdminDashboard;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;

public class US_34 {
    @Test
    public void realEstateMenuTest() throws InterruptedException {
        utilities.Driver.getDriver().get(utilities.ConfigReader.getProperty("AdminDashUrl"));
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.emailUsernameForm.sendKeys(utilities.ConfigReader.getProperty("AdminGecerliEmail"));
        adminDashboard.passwordForm.sendKeys(utilities.ConfigReader.getProperty("AdminGecerliPassword"));
        adminDashboard.signInButton.click();
        adminDashboard.realEstateButton.click();
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
