package Tests.Serpil;

import Pages.Listing;
import Pages.UserDashboard;
import Pages.WebsiteMain;
import com.google.common.base.Verify;
import org.openqa.selenium.JavascriptExecutor;
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

//Close the page

        softAssert.assertAll();
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

        //Click on each option listed under the 'News' heading one by one
        //Verify that the content of each article matches the title and information expected.

        websiteMain.newsFirstElement.click();
        softAssert.assertTrue(userDashboard.newsFirstPage.isDisplayed(), "First News page is not displayed.");
        driver.navigate().back();
        websiteMain.newsSecondElement.click();
        softAssert.assertTrue(userDashboard.newsSecondPage.isDisplayed(), "Second News page is not displayed.");
        driver.navigate().back();
      //  websiteMain.newsThirdElement.click();
       // softAssert.assertTrue(userDashboard.newsThirdPage.isDisplayed(), "Third News page is not displayed.");

        softAssert.assertAll();
        //Close the page
        Driver.quitDriver();

    }

    @Test(priority = 4)
    public void subscribeButtonTest() {

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
        websiteMain.subscribeButton.click();
        //Check that the 'Subscribe' box displays the prompt "Enter your email."
        //Click on the 'Subscribe' box and enter a valid email address.
        //After clicking the 'Subscribe' button, verify that a message saying "Successfully subscribed to the newsletter" is displayed.


    }


    @Test(priority = 5)
    public void socialMediaIconsTest() {

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

       //Verify that the social media icons for Instagram, Facebook, X (formerly Twitter), and LinkedIn are present in the footer.
        //Ensure that each icon is displayed using its current, recognizable design
        //Click on the Instagram icon and check if it redirects to the official Instagram page.
        //Click on the Facebook icon and check if it redirects to the official Facebook page.
        //Click on the X (Twitter) icon and check if it redirects to the official X (formerly Twitter) page.
        //Click on the LinkedIn icon and check if it redirects to the official LinkedIn page.


    }


    }