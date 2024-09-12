package Tests.Serpil;

import Pages.Listing;
import Pages.UserDashboard;
import Pages.WebsiteMain;
import com.google.common.base.Verify;
import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static utilities.Driver.driver;

public class US_16 {
    @Test (priority = 1)
    public void dashboardVisibilityTestForRegisteredUser() {


        //Go to https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));
        SoftAssert softAssert = new SoftAssert();
        UserDashboard userDashboard = new UserDashboard();
        Listing listing = new Listing();
        WebsiteMain websiteMain = new WebsiteMain();

        //Log in as registered user by entering user email and password
        userDashboard.homePageSignInButton.click();
        userDashboard.userEmailUsernameForm.sendKeys(ConfigReader.getProperty("UserValidEmail"));
        userDashboard.userPasswordForm.sendKeys(ConfigReader.getProperty("UserValidPassword"));
        userDashboard.userLogInButton.click();
        ReusableMethods.bekle(2);


        //Verify that the homepage loads correctly.
        softAssert.assertTrue(websiteMain.homeButton.isDisplayed(), "Home button is not displayed.");
        ReusableMethods.bekle(2);

        //Verify that the name link is clickable.
        websiteMain.headerNameElement.click();
        ReusableMethods.bekle(1);


        //Verify that the "Dashboard" page is displayed.
        softAssert.assertTrue(userDashboard.userDashboardButton.isDisplayed(), "Dashboard button is not displayed.");
        softAssert.assertAll();
        //Close the page
        Driver.quitDriver();

    }
        @Test (priority = 2)
        public void propertiesButtonAccessibilityTest() {

            //Go to https://qa.hauseheaven.com/
            Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));
            SoftAssert softAssert = new SoftAssert();
            UserDashboard userDashboard = new UserDashboard();
            Listing listing = new Listing();
            WebsiteMain websiteMain = new WebsiteMain();

            //Log in as registered user by entering user email and password
            userDashboard.homePageSignInButton.click();
            userDashboard.userEmailUsernameForm.sendKeys(ConfigReader.getProperty("UserValidEmail"));
            userDashboard.userPasswordForm.sendKeys(ConfigReader.getProperty("UserValidPassword"));
            userDashboard.userLogInButton.click();
            ReusableMethods.bekle(2);

            //Verify that the homepage loads correctly.
            softAssert.assertTrue(websiteMain.homeButton.isDisplayed(), "Home button is not displayed.");
            ReusableMethods.bekle(2);

            //Verify that the name link is clickable.
            websiteMain.headerNameElement.click();

            //Verify that the "Properties" option is visible on the page.
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,400);");
            ReusableMethods.bekle(2);
            softAssert.assertTrue(userDashboard.userDashboardPropertiesButton.isDisplayed(), "Properties button is not displayed.");

            //Verify that the "Properties" option is clickable on the page.
            userDashboard.userDashboardPropertiesButton.click();
            softAssert.assertAll();
            //Close the page
            Driver.quitDriver();


        }
    @Test (priority = 3)
    public void propertyVisibilityTest() {

        //Go to https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));
        SoftAssert softAssert = new SoftAssert();
        UserDashboard userDashboard = new UserDashboard();
        Listing listing = new Listing();
        WebsiteMain websiteMain = new WebsiteMain();

        //Log in as registered user by entering user email and password
        userDashboard.homePageSignInButton.click();
        userDashboard.userEmailUsernameForm.sendKeys(ConfigReader.getProperty("UserValidEmail"));
        userDashboard.userPasswordForm.sendKeys(ConfigReader.getProperty("UserValidPassword"));
        userDashboard.userLogInButton.click();
        ReusableMethods.bekle(2);

        //Verify that the homepage loads correctly.
        softAssert.assertTrue(websiteMain.homeButton.isDisplayed(), "Home button is not displayed.");
        ReusableMethods.bekle(2);

        //Verify that the name link is clickable.
        websiteMain.headerNameElement.click();

        //Verify that the "Properties" option is visible on the page.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400);");
        ReusableMethods.bekle(2);
        softAssert.assertTrue(userDashboard.userDashboardPropertiesButton.isDisplayed(), "Properties button is not displayed.");

        //Verify that the "Properties" option is clickable on the page.
        userDashboard.userDashboardPropertiesButton.click();


        //Observe the page for the presence of property listings.
        softAssert.assertTrue(userDashboard.dashboardPropertiesIdButton.isDisplayed(), "Id button is not displayed.");

        //Verify that multiple property listings are displayed.

        List<WebElement> propertyList = driver.findElements(By.xpath("//tr[@role='row']"));
        int propertyCount = propertyList.size();
        Assert.assertTrue(propertyCount > 0, "Property count is not greater than 0");

        softAssert.assertAll();
        //Close the page
        Driver.quitDriver();

    }
        @Test (priority = 4)
        public void addingNewListeningTest() {

            //Go to https://qa.hauseheaven.com/
            Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));
            SoftAssert softAssert = new SoftAssert();
            UserDashboard userDashboard = new UserDashboard();
            Listing listing = new Listing();
            WebsiteMain websiteMain = new WebsiteMain();

            //Log in as registered user by entering user email and password
            userDashboard.homePageSignInButton.click();
            userDashboard.userEmailUsernameForm.sendKeys(ConfigReader.getProperty("UserValidEmail"));
            userDashboard.userPasswordForm.sendKeys(ConfigReader.getProperty("UserValidPassword"));
            userDashboard.userLogInButton.click();
            ReusableMethods.bekle(2);

            //Verify that the homepage loads correctly.
            softAssert.assertTrue(websiteMain.homeButton.isDisplayed(), "Home button is not displayed.");
            ReusableMethods.bekle(2);

            //Verify that the name link is clickable.
            websiteMain.headerNameElement.click();

            //Verify that the "Properties" option is visible on the page.
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,400);");
            ReusableMethods.bekle(2);
            softAssert.assertTrue(userDashboard.userDashboardPropertiesButton.isDisplayed(), "Properties button is not displayed.");

            //Verify that the "Properties" option is clickable on the page.
            userDashboard.userDashboardPropertiesButton.click();
            softAssert.assertAll();


            //Click on the 'Create' button.
            userDashboard.createButton.click();

        //Enter required details into the form fields (e.g., property name, description, price, location, images).
        userDashboard.titleTextBox.sendKeys("01Serpil");
        userDashboard.descriptionBox.sendKeys("Site içinde");
        userDashboard.contentBox.sendKeys("3+1 Bakımlı daire");
        userDashboard.propertyLocationBox.sendKeys("Nilüfer");
        userDashboard.latitudeBox.sendKeys("1.462260");
        userDashboard.longitudeBox.sendKeys("103.812530");
        userDashboard.numberBedroomsBox.sendKeys("2");
        userDashboard.numberBathroomsBox.sendKeys("2");
        userDashboard.numberFloorsBox.sendKeys("1");
        userDashboard.squareBox.sendKeys("150");
        userDashboard.priceNumberBox.sendKeys("6.000");
        userDashboard.featuresWifi.sendKeys("x");
        userDashboard.featuresParking.sendKeys("x");

        //Click on the 'Save&Exit' or 'Save' button to add the new listing.
        //verify that "save&exit" button is displayed
        softAssert.assertTrue(userDashboard.saveexitButton.isDisplayed());

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,0);");
        ReusableMethods.bekle(2);

        //verify that "save&exit" button is clicked
        userDashboard.saveexitButton.click();
        //userDashboard.saveexitButton.click();
        ReusableMethods.bekle(2);

        //Verify that the new listing appears in the listings page.
        softAssert.assertTrue(userDashboard.listingIdNo.isDisplayed(),"Listing ID No is not displayed");
        softAssert.assertAll();

        //Close the page
        Driver.quitDriver();




    }

    @Test (priority = 5)
    public void EditTest(){
        //Go to https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));
        SoftAssert softAssert = new SoftAssert();
        UserDashboard userDashboard = new UserDashboard();
        Listing listing=new Listing();
        WebsiteMain websiteMain= new WebsiteMain();

       //Log in as registered user by entering user email and password
        userDashboard.homePageSignInButton.click();
        userDashboard.userEmailUsernameForm.sendKeys(ConfigReader.getProperty("UserValidEmail"));
        userDashboard.userPasswordForm.sendKeys(ConfigReader.getProperty("UserValidPassword"));
        userDashboard.userLogInButton.click();
        ReusableMethods.bekle(2);

        //Verify that the homepage loads correctly.
        softAssert.assertTrue(websiteMain.homeButton.isDisplayed(), "Home button is not displayed.");
        ReusableMethods.bekle(2);

        //Verify that the name link is clickable.
        websiteMain.headerNameElement.click();

        //Verify that the "Properties" option is visible on the page.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400);");
        ReusableMethods.bekle(2);
        softAssert.assertTrue(userDashboard.userDashboardPropertiesButton.isDisplayed(), "Properties button is not displayed.");

        //Verify that the "Properties" option is clickable on the page.
        userDashboard.userDashboardPropertiesButton.click();

        //Click the 'Edit' button on the opened page.
        userDashboard.editButton.click();

        //verify that the page can be editted.
        softAssert.assertTrue(userDashboard.edittingPage.isDisplayed(), "Editting page is not displayed.");

        //verify that "save&exit" button is displayed
        softAssert.assertTrue(userDashboard.saveexitButton.isDisplayed());

        //verify that "save&exit" button is clicked
        userDashboard.saveexitButton.click();

        softAssert.assertAll();
        //Close the page
        Driver.quitDriver();
    }

    @Test (priority = 6)
    public void deleteTest() {
        //Go to https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));
        SoftAssert softAssert = new SoftAssert();
        UserDashboard userDashboard = new UserDashboard();
        Listing listing = new Listing();
        WebsiteMain websiteMain = new WebsiteMain();

        //Log in as registered user by entering user email and password
        userDashboard.homePageSignInButton.click();
        userDashboard.userEmailUsernameForm.sendKeys(ConfigReader.getProperty("UserValidEmail"));
        userDashboard.userPasswordForm.sendKeys(ConfigReader.getProperty("UserValidPassword"));
        userDashboard.userLogInButton.click();
        ReusableMethods.bekle(2);

        //Verify that the homepage loads correctly.
        softAssert.assertTrue(websiteMain.homeButton.isDisplayed(), "Home button is not displayed.");
        ReusableMethods.bekle(2);

        //Verify that the name link is clickable.
        websiteMain.headerNameElement.click();

        //Verify that the "Properties" option is visible on the page.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400);");
        ReusableMethods.bekle(2);
        softAssert.assertTrue(userDashboard.userDashboardPropertiesButton.isDisplayed(), "Properties button is not displayed.");

        //Verify that the "Properties" option is clickable on the page.
        userDashboard.userDashboardPropertiesButton.click();

        //Click the 'Delete' button on the opened page.
        userDashboard.deleteButton.click();

        //verify that "Confirmation Delete" text is displayed.
        ReusableMethods.bekle(2);
        softAssert.assertTrue(userDashboard.confirmationText.isDisplayed(), "Confirmation Delete text is not displayed.");


        // Verify that Delete button is clickable.
        userDashboard.confirmationdeleteButton.click();
        ReusableMethods.bekle(2);

        softAssert.assertAll();
        //Close the page
        Driver.quitDriver();



    }





    }
