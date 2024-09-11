package Tests.Serpil;

import Pages.Listing;
import Pages.UserDashboard;
import Pages.WebsiteMain;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class US_16 {
    @Test
    public void newListening() throws InterruptedException {

        /*
        Launch browser
        Go to https://qa.hauseheaven.com/
        Log in as registered user by entering user email and password
        Click on the name button
        Navigate to the properties listing page.
        Click on the 'Create' button.
        Enter required details into the form fields (e.g., property name, description, price, location, images).
        Click on the 'Save&Exit' or 'Save' button to add the new listing.
        Check for a confirmation message that the listing is successfully added.
        Verify that the new listing appears in the listings page.
        */




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


        //Click on the name button
        websiteMain.headerNameElement.click();

        //Navigate to the properties listing page.







    }


}
