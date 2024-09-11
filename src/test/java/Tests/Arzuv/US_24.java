package Tests.Arzuv;

import Pages.Agents;
import Pages.WebsiteMain;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class US_24 {

    SoftAssert softAssert = new SoftAssert();
    WebsiteMain websiteMain =new WebsiteMain();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Test(priority = 1)
    public void TC01(){

      // Open browser
      // Enter Url https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));

      // Confirm Hauseheaven page is displayed
        WebsiteMain websiteMain = new WebsiteMain();
        Assert.assertTrue(websiteMain.homePageButton.isDisplayed());

      // Click on Agents menu on the header
        websiteMain.agentsButton.click();

      // Navigate to 'All Agents' page
        websiteMain.allAgentsPageButton.click();
        softAssert.assertTrue(websiteMain.allAgentsPageButton.isDisplayed());

      // Confirm all agents' information cards are displayed
        for (int i = 0; i < 10; i++)
        js.executeScript("window.scrollBy(0,2000)");
        utilities.ReusableMethods.bekle(2);

      // Validate the property result is displayed on each agent's card
        Assert.assertTrue(websiteMain.propertiesResultButton.isDisplayed());

        ReusableMethods.bekle(2);

    }

    @Test(priority = 2)
    public void TC02(){

      // Page down for viewing an agent you are interested in
        js.executeScript("window.scrollBy(0,2000)");
        utilities.ReusableMethods.bekle(2);

      // Agent's name on card is displayed
        Agents agents = new Agents();
        agents.ilkAgentIsimElementi.isDisplayed();

      // Agent's contact info on card is displayed
        agents.ilkAgentTelefonNo.isDisplayed();

      // Confirm message box is clickable
        websiteMain.agentsMessageBoxButton.isDisplayed();

      // Confirm 'View' tag is clickable
        websiteMain.agentsViewTagButton.isDisplayed();
        websiteMain.agentsViewTagButton.click();

      // Navigate to new page
        websiteMain.agentsDetailPageButton.isDisplayed();

    }

    @Test(priority = 3)
    public void TC03(){

      // View tag is clickable on any card
      // Navigate to Agent Detail page
      // Agent's name is displayed
      // Agent's property result is displayed
      // Determine the properties are for 'SALE' or for 'RENT'

        driver.quit();
    }
}
