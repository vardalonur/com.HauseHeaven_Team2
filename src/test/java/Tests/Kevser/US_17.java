package Tests.Kevser;

import Pages.*;
import org.apache.xmlbeans.impl.xb.xsdschema.Attribute;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

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
        Assert.assertTrue(websiteMain.findAccessibleYazisi.isDisplayed());

        //Listing butonuna tıkla
        websiteMain.listingButton.click();

        //Properties' yazısının görünür olduğunu doğrula
        Listing listing = new Listing();
        Assert.assertTrue(listing.propertiesYazisi.isDisplayed());

        //Projects butonuna tıkla
        websiteMain.projectsButton.click();

        //All projects' yazısının görünür olduğunu doğrula
        Projects projects = new Projects();
        Assert.assertTrue(projects.allProjectsYazisi.isDisplayed());

        //Agents butonuna tıkla
        websiteMain.agentsButton.click();

        //All Agents' yazısının görünür olduğunu doğrula
        Agents agents = new Agents();
        Assert.assertTrue(agents.allAgentsYazisi.isDisplayed());

        //Blog butonuna tıkla
        websiteMain.blogButton.click();

        //Blog' yazısının görünür olduğunu doğrula
        Assert.assertTrue(websiteMain.blogYazisi.isDisplayed());

        //Contact butonuna tıkla
        websiteMain.contactButton.click();

        //Contact' yazısının görünür olduğunu doğrula
        Assert.assertTrue(websiteMain.contactYazisi.isDisplayed());

        //Sign Up butonuna tıkla
        websiteMain.signUpButton.click();

        //Your Current Credits:' yazısının görünür olduğunu doğrula
        SignUp signUp = new SignUp();
        Assert.assertTrue(signUp.yourCurrentCreditYazisi.isDisplayed());

        //Add Property butonuna tıkla
        websiteMain.addPropertyButton.click();

        //Title text box'ının görünür olduğunu doğrula
        Assert.assertTrue(websiteMain.titleTextBox.isDisplayed());

        //Logout butonuna tıkla
        websiteMain.LogoutButton.click();

        //Sign In butonunun görünür olduğunu doğrula
        Assert.assertTrue(websiteMain.signInButton.isDisplayed());

        //Sayfayı kapat
        Driver.quitDriver();
    }

    @Test
    public void TC02(){

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

        //Sayfayı aşağı kaydır
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});",websiteMain.findByLocationText);
        ReusableMethods.bekle(1);

        //Header bölümünün görünür olduğunu doğrula
        Assert.assertTrue(websiteMain.headerBolumu.isDisplayed());

        //Sayfayı kapat
        Driver.quitDriver();
    }

    @Test
    public void TC03(){

        //Browser aç ve https://qa.hauseheaven.com/  adersine git
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));

        //Profil ismi butonunun görünür olmadığını doğrula
        WebsiteMain websiteMain = new WebsiteMain();
        Assert.assertFalse(websiteMain.addPropertyButton.isDisplayed());

        //Logout butonunun görünür olmadığını doğrula
        Assert.assertFalse(websiteMain.LogoutButton.isDisplayed());

        //Sayfayı kapat
        Driver.quitDriver();
    }
}
