package Tests.Serpil;

import Pages.Listing;
import Pages.UserDashboard;
import Pages.WebsiteMain;
import com.google.common.base.Verify;
import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

import static utilities.Driver.driver;

public class US_16 {
    @Test (priority = 1)
    public void dashboardVisibilityTestForRegisteredUser() throws InterruptedException {


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
        Thread.sleep(2000);


        //Verify that the homepage loads correctly.
        softAssert.assertTrue(websiteMain.homeButton.isDisplayed(), "Home button is not displayed.");
        Thread.sleep(2000);

        //Verify that the name link is clickable.
        websiteMain.headerNameElement.click();
        Thread.sleep(2000);
        softAssert.assertTrue(websiteMain.headerNameElement.isSelected(), "Header name element is not selected.");

        //Verify that the "Dashboard" page is displayed.
        softAssert.assertTrue(userDashboard.userDashboardButton.isDisplayed(), "Dashboard button is not displayed.");
        softAssert.assertAll();
    }
        @Test (priority = 2)
        public void propertiesButtonAccessibilityTest() throws InterruptedException {

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
            Thread.sleep(2000);

            //Verify that the homepage loads correctly.
            softAssert.assertTrue(websiteMain.homeButton.isDisplayed(), "Home button is not displayed.");
            Thread.sleep(2000);

            //Verify that the name link is clickable.
            websiteMain.headerNameElement.click();
           // Thread.sleep(2000);


            //Verify that the "Properties" option is visible on the page.
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,400);");
            Thread.sleep(3000);
            softAssert.assertTrue(userDashboard.userDashboardPropertiesButton.isDisplayed(), "Properties button is not displayed.");

            //Verify that the "Properties" option is clickable on the page.
            userDashboard.userDashboardPropertiesButton.click();
            softAssert.assertAll();


        }
    @Test (priority = 3)
    public void listingVisibilityTest() throws InterruptedException {

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
        Thread.sleep(2000);

        //Verify that the homepage loads correctly.
        softAssert.assertTrue(websiteMain.homeButton.isDisplayed(), "Home button is not displayed.");
        Thread.sleep(2000);

        //Verify that the name link is clickable.
        websiteMain.headerNameElement.click();
        // Thread.sleep(2000);


        //Verify that the "Properties" option is visible on the page.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400);");
        Thread.sleep(3000);
        softAssert.assertTrue(userDashboard.userDashboardPropertiesButton.isDisplayed(), "Properties button is not displayed.");

        //Verify that the "Properties" option is clickable on the page.
        userDashboard.userDashboardPropertiesButton.click();
        softAssert.assertAll();

        //Observe the page for the presence of property listings.
        softAssert.assertTrue(userDashboard.dashboardPropertiesIdButton.isDisplayed(), "Id button is not displayed.");

        //Verify that multiple property listings are displayed.
        List<WebElement> project = driver.findElements(By.xpath("//h4[@class='mb-0']"));
        softAssert.assertTrue(project.size() > 0, "İlanlar listelenmedi!");

        //Check that each listing includes relevant details such as property name, image, price, and description.
        softAssert.assertTrue(userDashboard.firstIdElement.isDisplayed(),"Listing is not displayed");

        //Click on the 'Create' button.
        userDashboard.createButton.click();


        //Enter required details into the form fields (e.g., property name, description, price, location, images).
        userDashboard.titleTextBox.sendKeys("01Ser");
        userDashboard.descriptionBox.sendKeys("Site içinde");
        userDashboard.contentBox.sendKeys("3+1 Bakımlı daire");
       // userDashboard.cityBox.sendKeys("Bursa");
        userDashboard.propertyLocationBox.sendKeys("Nilüfer");
       // userDashboard.latitudeBox.sendKeys("1.462260");
       // userDashboard.longitudeBox.sendKeys("103.812530");
       // userDashboard.numberBedroomsBox.sendKeys("2");
      //  userDashboard.numberBathroomsBox.sendKeys("2");
      //  userDashboard.numberFloorsBox.sendKeys("1");
      //  userDashboard.squareBox.sendKeys("150 m2");
      //  userDashboard.priceNumberBox.sendKeys("6.000.000");
       // userDashboard.currencyBox.sendKeys("TL");

        //Click on the 'Save&Exit' or 'Save' button to add the new listing.
        userDashboard.saveExitButton.click();

        //Check for a confirmation message that the listing is successfully added.


        //Verify that the new listing appears in the listings page.

       // softAssert.assertAll();
    }


















}
