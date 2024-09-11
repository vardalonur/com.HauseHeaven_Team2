package Tests.Can;

import Pages.Listing;
import Pages.UserDashboard;
import Pages.WebsiteMain;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

public class US_07 {

    @Test
    public void TC01(){
        Actions actions = new Actions(Driver.getDriver());
        //Go to HauseHeven Home Page
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));

        //Click on "Listing"
        WebsiteMain webSiteMain = new WebsiteMain();
        webSiteMain.listingButton.click();

        //Validate Current Title
        String expectedCurrentTitle = "Properties";
        String actualCurrentTitle = driver.getTitle();

        //Create softAssert Object
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(actualCurrentTitle, expectedCurrentTitle);

        Listing listing = new Listing();

        //Click on the first property of the page with "View" Button
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        utilities.ReusableMethods.bekle(1);

        listing.viewButton.get(0).click();

        //Click on "Share" button
        utilities.ReusableMethods.bekle(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        listing.shareButton.click();
        utilities.ReusableMethods.bekle(3);
        //Choose "Facebook"
        listing.facebookButton.click();
        //Validate current URL
        String expectedURL = "https://www.facebook.com/share_channel/?link=https%3A%2F%2Fqa.hauseheaven.com%2Fproperties%2Fbaku&app_id=966242223397117&source_surface=external_reshare&display&hashtag";
        String actualURL = driver.getCurrentUrl();

        softAssert.assertTrue(expectedURL.contains(actualURL));
        Driver.quitDriver();
    }

    @Test
    public void TC02(){
        Actions actions = new Actions(Driver.getDriver());
        //Go to HauseHeven Home Page
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));

        //Click on "Listing"
        WebsiteMain webSiteMain = new WebsiteMain();
        webSiteMain.listingButton.click();

        //Validate Current Title
        String expectedCurrentTitle = "Properties";
        String actualCurrentTitle = driver.getTitle();

        //Create softAssert Object
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(actualCurrentTitle, expectedCurrentTitle);

        Listing listing = new Listing();

        //Click on the first property of the page with "View" Button
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        utilities.ReusableMethods.bekle(1);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        utilities.ReusableMethods.bekle(1);

        listing.viewButton.get(0).click();

        js.executeScript("window.scrollBy(0,300)");
        utilities.ReusableMethods.bekle(1);
        listing.wishList.click();

        utilities.ReusableMethods.bekle(3);
        Driver.quitDriver();
    }
    @Test
    public void TC03(){
        Actions actions = new Actions(Driver.getDriver());
        //Go to HauseHeven Home Page
        //Go to https://qa.hauseheaven.com/login
        Driver.getDriver().get(ConfigReader.getProperty("UserLoginPageUrl"));
        UserDashboard userDashboard = new UserDashboard();

        //Enter invalid username and password
        userDashboard.userEmailUsernameForm.sendKeys("invalidmail@gmail.com");
        userDashboard.userPasswordForm.sendKeys("invalidpassword");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        userDashboard.userLogInButton.click();

        //Enter valid username and password
        js.executeScript("window.scrollBy(0, -200)");
        userDashboard.userEmailUsernameForm.clear();
        userDashboard.userPasswordForm.clear();
        userDashboard.userEmailUsernameForm.sendKeys(ConfigReader.getProperty("WebsiteGecerliEmail"));
        userDashboard.userPasswordForm.sendKeys(ConfigReader.getProperty("WebsiteGecerliPassword"));

        js.executeScript("window.scrollBy(0,200)");
        userDashboard.userLogInButton.click();

        //Click on "Listing"
        WebsiteMain webSiteMain = new WebsiteMain();
        webSiteMain.listingButton.click();

        //Validate Current Title
        String expectedCurrentTitle = "Properties";
        String actualCurrentTitle = driver.getTitle();

        //Create softAssert Object
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(actualCurrentTitle, expectedCurrentTitle);

        Listing listing = new Listing();

        //Click on the first property of the page with "View" Button


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        listing.viewButton.get(0).click();
        //Scroll Down
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        utilities.ReusableMethods.bekle(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        utilities.ReusableMethods.bekle(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        utilities.ReusableMethods.bekle(1);
        //Comment it and Submit Review
        listing.commentTextArea.sendKeys("Comment");
        utilities.ReusableMethods.bekle(2);

        Driver.quitDriver();
    }
    @Test
    public void TC04(){
        Actions actions = new Actions(Driver.getDriver());
        //Go to HauseHeaven Home Page
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));

        //Click on "Listing"
        WebsiteMain webSiteMain = new WebsiteMain();
        webSiteMain.listingButton.click();

        //Validate Current Title
        String expectedCurrentTitle = "Properties";
        String actualCurrentTitle = driver.getTitle();

        //Create softAssert Object
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(actualCurrentTitle, expectedCurrentTitle);

        Listing listing = new Listing();

        //Click on the first property of the page with "View" Button
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        utilities.ReusableMethods.bekle(2);
        listing.viewButton.get(0).click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //Fill the form with fake data up
        listing.nameForm.sendKeys("Can");
        listing.phoneForm.sendKeys("0521 4789 7878");
        listing.emailForm.sendKeys("can@gmail.com");
        listing.contentForm.sendKeys("I am interested in this flat");
        //Send Message
        utilities.ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        listing.sendForm.click();

        Driver.quitDriver();

    }
}