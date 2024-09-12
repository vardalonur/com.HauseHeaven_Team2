package Tests.Serpil;

import Pages.Listing;
import Pages.UserDashboard;
import Pages.WebsiteMain;
import com.google.common.base.Verify;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class US_05 {

    @Test(priority = 1)
    public void footerVisibilityTest() {


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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000);");
        ReusableMethods.bekle(2);
        softAssert.assertTrue(websiteMain.navigationElement.isDisplayed(), "Navigation element is not displayed.");
        softAssert.assertTrue(websiteMain.telephoneElement.isDisplayed(),"Telephone element is not displayed");
        softAssert.assertTrue(websiteMain.emailElement.isDisplayed(),"Email element is not displayed");
        softAssert.assertAll();

        //Close the page
        Driver.quitDriver();


    }

    @Test(priority = 2)
    public void aboutHeadingTest() {

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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,8000);");
        ReusableMethods.bekle(2);
        js.executeScript("window.scrollBy(0,5000);");
        ReusableMethods.bekle(2);
        softAssert.assertTrue(websiteMain.navigationElement.isDisplayed(), "Navigation element is not displayed.");


        //Click on each option listed under the 'About' heading one by one.
        //Verify that each click redirects to the correct, relevant page.
        websiteMain.aboutUsElement.click();
        softAssert.assertTrue(userDashboard.aboutusPage.isDisplayed(), "About us page is not displayed.");
        driver.navigate().back();
        websiteMain.contactUsElement.click();
        softAssert.assertTrue(userDashboard.contactUsPage.isDisplayed(), "About us page is not displayed.");
        driver.navigate().back();
        websiteMain.termsConditionsElement.click();
        softAssert.assertTrue(userDashboard.termsConditionsPage.isDisplayed(), "About us page is not displayed.");

        softAssert.assertAll();
        //Close the page
        Driver.quitDriver();


    }

    @Test(priority = 3)
    public void moreInformationHeadingTest() {

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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,8000);");
        ReusableMethods.bekle(2);
        js.executeScript("window.scrollBy(0,2000);");
        ReusableMethods.bekle(2);
        softAssert.assertTrue(websiteMain.navigationElement.isDisplayed(), "Navigation element is not displayed.");


        //Click on each option listed under the 'More Information' heading one by one.
        //Verify that each click redirects to the correct, relevant page.

        websiteMain.allPropertiesElement.click();
        softAssert.assertTrue(userDashboard.allPropertiesPage.isDisplayed(), "All Properties page is not displayed.");
        driver.navigate().back();
        websiteMain.housesForSailElement.click();
        softAssert.assertTrue(userDashboard.housesForSailPage.isDisplayed(), "Houses for sale page is not displayed.");
        driver.navigate().back();
        websiteMain.housesforRentElement.click();
        softAssert.assertTrue(userDashboard.housesforRentPage.isDisplayed(), "Houses for rent page is not displayed.");

        softAssert.assertAll();
        //Close the page
        Driver.quitDriver();


    }
    @Test(priority = 3)
    public void newsHeadingTest() {

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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,8000);");
        ReusableMethods.bekle(2);
        js.executeScript("window.scrollBy(0,2000);");
        ReusableMethods.bekle(2);
        softAssert.assertTrue(websiteMain.navigationElement.isDisplayed(), "Navigation element is not displayed.");

        //Click on option listed under the 'News' heading
        //Verify that the content of the article matches the title and information expected.

        websiteMain.newsFirstElement.click();
        softAssert.assertTrue(userDashboard.newsFirstPage.isDisplayed(), "First News page is not displayed.");
        ReusableMethods.bekle(1);


        softAssert.assertAll();
        //Close the page
        Driver.quitDriver();

    }

    @Test(priority = 4)
    public void subscribeButtonTest() {

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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,8000);");
        ReusableMethods.bekle(2);
        js.executeScript("window.scrollBy(0,2000);");
        ReusableMethods.bekle(2);
        softAssert.assertTrue(websiteMain.navigationElement.isDisplayed(), "Navigation element is not displayed.");

        //Type valid email in the 'Subscribe' box on the page.
        websiteMain.subscribeBox.sendKeys(ConfigReader.getProperty("UserValidEmail"));

        //Click on the 'Subscribe' box and enter a valid email address.
        websiteMain.subscribeButton.click();

        //After clicking the 'Subscribe' button, verify that a message saying "Successfully subscribed to the newsletter" is displayed.

        softAssert.assertAll();
        //Close the page
        Driver.quitDriver();

    }


    @Test(priority = 5)
    public void socialMediaIconsTest() {
        //Go to https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));
        SoftAssert softAssert = new SoftAssert();
        UserDashboard userDashboard = new UserDashboard();
        Listing listing = new Listing();
        WebsiteMain websiteMain = new WebsiteMain();
        Actions actions = new Actions(driver);

        //Verify that the homepage loads correctly.

        softAssert.assertTrue(websiteMain.homeButton.isDisplayed(), "Home button is not displayed.");
        ReusableMethods.bekle(2);

        //Verify that the footer section is visible at the bottom of the homepage.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,8000);");
        ReusableMethods.bekle(2);
        js.executeScript("window.scrollBy(0,5000);");
        ReusableMethods.bekle(2);
        softAssert.assertTrue(websiteMain.navigationElement.isDisplayed(), "Navigation element is not displayed.");

        //Verify that Googleplay and AppStore buttons are present in the footer
        softAssert.assertTrue(websiteMain.googlePlayElement.isDisplayed(), "GooglePlay element is not displayed.");
        softAssert.assertTrue(websiteMain.appStoreElement.isDisplayed(), "AppStore element is not displayed.");

        //Verify that Googleplay and AppStore buttons are clicable in the footer
        websiteMain.googlePlayElement.click();
        driver.navigate().back();
        websiteMain.appStoreElement.click();
        driver.navigate().back();

       //Verify that the social media icons for Instagram, Facebook, X (formerly Twitter), and LinkedIn are present in the footer.
       JavascriptExecutor js1 = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,1000);");
       ReusableMethods.bekle(2);
        // Accept cookies
       websiteMain.cookiesButton.click();


        softAssert.assertTrue(websiteMain.facebookIcon.isDisplayed(), "Facebook icon is not displayed.");
        System.out.println("Facebook icon göründü");
        softAssert.assertTrue(websiteMain.twitterIcon.isDisplayed(), "Twitter icon is not displayed.");
        softAssert.assertTrue(websiteMain.instagramIcon.isDisplayed(), "Instagram icon is not displayed.");
        softAssert.assertTrue(websiteMain.linkedinIcon.isDisplayed(), "LinkedIn icon is not displayed.");
        softAssert.assertTrue(websiteMain.pinterestIcon.isDisplayed(), "Pinterest icon is not displayed.");

        //Click on the Instagram, Facebook, X (formerly Twitter), and LinkedIn and check if it redirects to the official pages.

        actions.keyDown(Keys.SHIFT).click(websiteMain.facebookIcon).keyUp(Keys.SHIFT).build().perform();

        actions.keyDown(Keys.SHIFT).click(websiteMain.twitterIcon).keyUp(Keys.SHIFT).build().perform();

        actions.keyDown(Keys.SHIFT).click(websiteMain.instagramIcon).keyUp(Keys.SHIFT).build().perform();

        actions.keyDown(Keys.SHIFT).click(websiteMain.linkedinIcon).keyUp(Keys.SHIFT).build().perform();

        actions.keyDown(Keys.SHIFT).click(websiteMain.pinterestIcon).keyUp(Keys.SHIFT).build().perform();

        softAssert.assertAll();
        //Close the page
        Driver.quitDriver();


    }


    }