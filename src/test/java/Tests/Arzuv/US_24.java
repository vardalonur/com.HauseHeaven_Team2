package Tests.Arzuv;

import Pages.Agents;
import Pages.Projects;
import Pages.WebsiteMain;
import org.openqa.selenium.By;
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
import static utilities.Driver.getDriver;

public class US_24 {

    WebsiteMain websiteMain = new WebsiteMain();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Test(priority = 1)
    public void TC01(){

      // Open browser and Enter Url https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Agents agents = new Agents();
        SoftAssert softAssert = new SoftAssert();
        Projects projects = new Projects();

      // Confirm Hauseheaven page is displayed
        WebsiteMain websiteMain = new WebsiteMain();
        Assert.assertTrue(websiteMain.homePageButton.isDisplayed());

      // Click on Agents menu on the header
        websiteMain.agentsButton.click();

      // Navigate to 'All Agents' page
        websiteMain.allAgentsPageButton.click();
        softAssert.assertTrue(websiteMain.allAgentsPageButton.isDisplayed());

      // Confirm all agents' information cards are displayed
        js.executeScript("window.scrollBy(0,2000)");
        utilities.ReusableMethods.bekle(2);

      // Validate the property result is displayed on each agent's card
        Assert.assertTrue(websiteMain.propertiesResultButton.isDisplayed());

        ReusableMethods.bekle(2);

    }

    @Test(priority = 2)
    public void TC02() throws InterruptedException {

      // Page down for viewing an agent you are interested in
        Agents agents = new Agents();
        js.executeScript("window.scrollBy(0,-1670)");
        Assert.assertTrue(agents.ilkAgentIsimElementi.isDisplayed());

        Thread.sleep(2000);

      // Agent's name on card is displayed
        agents.allAgentsYazisi.isDisplayed();

      // Agent's contact info on card is displayed
        agents.ilkAgentTelefonNo.isDisplayed();

      // Confirm message box is clickable
       Assert.assertTrue(websiteMain.agentsMessageBoxButton.isDisplayed());

      // Confirm 'View' tag is clickable
        websiteMain.agentsViewTagButton.isDisplayed();
        ReusableMethods.bekle(1);
        websiteMain.agentsViewTagButton.click();

      // Navigate to new page
        websiteMain.agentsDetailPageButton.isDisplayed();

        Thread.sleep(4);

    }

    @Test(priority = 3)
    public void TC03() throws InterruptedException {

        Actions actions = new Actions(getDriver());

      // View tag is clickable on any card
        websiteMain.agentsButton.click();
        ReusableMethods.bekle(2);
       // actions.scrollToElement(websiteMain.fifthAgentsNameButton);
        js.executeScript("window.scrollBy(0,900)");

        ReusableMethods.bekle(2);
        websiteMain.fifthAgentImgButton.click();

      // Navigate to Agent Detail page
        websiteMain.agentsDetailPageButton.click();
        ReusableMethods.bekle(1);

      // Agent's name is displayed
        Assert.assertTrue(websiteMain.agentHazelPageButton.isDisplayed());

      // Agent's property result is displayed
        Assert.assertTrue(websiteMain.hazelsPropertyButton.isDisplayed());
        ReusableMethods.bekle(2);

      // Determine the properties are for 'SALE' or for 'RENT'
        js.executeScript("window.scrollBy(0,700)");

        Thread.sleep(2);
        driver.quit();
    }
}



