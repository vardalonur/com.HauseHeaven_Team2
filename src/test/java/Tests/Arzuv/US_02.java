package Tests.Arzuv;

import Pages.Listing;
import Pages.WebsiteMain;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_02 {

WebDriver driver;

    @Test
    public void TC01() throws InterruptedException{

         // Open the browser and Enter url https://qa.hauseheaven.com/
         Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));


         // Confirm that menus on the header can be clicked and navigated to new page
        // Home button
        WebsiteMain websiteMain = new WebsiteMain();
        websiteMain.homeButton.click();
        Assert.assertTrue(websiteMain.homePageButton.isDisplayed());

        // Click Listing button and Properties page opens
        websiteMain.listingButton.click();
        Assert.assertTrue(websiteMain.propertiesPageButton.isDisplayed());
        ReusableMethods.bekle(1);

        // Click Projects button and AllProjects page opens
        websiteMain.projectsButton.click();
        Assert.assertTrue(websiteMain.allProjectsPageButton.isDisplayed());
        ReusableMethods.bekle(1);

        // Click Agents button and AllAgents page opens
        websiteMain.agentsButton.click();
        Assert.assertTrue(websiteMain.allAgentsPageButton.isDisplayed());
        ReusableMethods.bekle(1);

        // Click Blog button and Blogs page opens
        websiteMain.blogButton.click();
        Assert.assertTrue(websiteMain.blogPageButton.isDisplayed());
        ReusableMethods.bekle(1);

        // Click Contact button and Contact info page opens
        websiteMain.contactButton.click();
        Assert.assertTrue(websiteMain.contactPageButton.isDisplayed());
        ReusableMethods.bekle(1);

        // Click Signup button and Register page opens
        websiteMain.signUpButton.click();
        Assert.assertTrue(websiteMain.signUpPageButton.isDisplayed());

        ReusableMethods.bekle(2);
        Driver.quitDriver();

}
}
