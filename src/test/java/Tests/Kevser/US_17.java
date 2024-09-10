package Tests.Kevser;

import Pages.UserDashboard;
import Pages.WebsiteMain;
import org.apache.xmlbeans.impl.xb.xsdschema.Attribute;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class US_17 {

    @Test
    public void TC04(){

        //Browser aç ve https://qa.hauseheaven.com/  adersine git
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));

        //Sign In butonuna tıkla
        WebsiteMain websiteMain = new WebsiteMain();
        websiteMain.signInButton.click();

        //Email gir
        UserDashboard userDashboard = new UserDashboard();
        userDashboard.userEmailUsernameForm.sendKeys(ConfigReader.getProperty("kevsGecerliEmail"));

        //Şifre gir
        userDashboard.userPasswordForm.sendKeys(ConfigReader.getProperty("kevseGecerliPassword"));

        //Login butonuna tıkla
        userDashboard.userLogInButton.click();

        //Home butonuna tıkla
        websiteMain.homeButton.click();

        //Find accessible homes to rent' yazısının görünür olduğunu doğrula

        //Listing butonuna tıkla
        websiteMain.listingButton.click();

        //Properties' yazısının görünür olduğunu doğrula

        //Projects butonuna tıkla
        websiteMain.projectsButton.click();

        //All projects' yazısının görünür olduğunu doğrula

        //Agents butonuna tıkla
        websiteMain.agentsButton.click();

        //All Agents' yazısının görünür olduğunu doğrula

        //Blog butonuna tıkla
        websiteMain.blogButton.click();

        //Blog' yazısının görünür olduğunu doğrula

        //Contact butonuna tıkla
        websiteMain.contactButton.click();

        //Contact' yazısının görünür olduğunu doğrula

        //Sign Up butonuna tıkla
        websiteMain.signUpButton.click();

        //Your Current Credits:' yazısının görünür olduğunu doğrula

        //Add Property butonuna tıkla
        websiteMain.addPropertyButton.click();

        //Title text box'ının görünür olduğunu doğrula

        //Logout butonuna tıkla
        websiteMain.LogoutButton.click();

        //Sign In butonunun görünür olduğunu doğrula
        Assert.assertTrue(websiteMain.signInButton.isDisplayed());

        //Sayfayı kapat
        Driver.quitDriver();
    }
}
