package Tests.Kevser;

import Pages.Listing;
import Pages.UserDashboard;
import Pages.WebsiteMain;
import org.apache.xmlbeans.impl.xb.xsdschema.Attribute;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_22 {

    @Test
    public void TC01(){
        //Browser aç ve https://qa.hauseheaven.com/  adersine git
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));

        //Sign In butonuna tıkla
        WebsiteMain websiteMain = new WebsiteMain();
        websiteMain.signInButton.click();

        //Email gir
        UserDashboard userDashboard = new UserDashboard();
        userDashboard.userEmailUsernameForm.sendKeys(ConfigReader.getProperty("kevsGecerliEmail"));

        //Şifre gir
        userDashboard.userPasswordForm.sendKeys(ConfigReader.getProperty("kevsGecerliPassword"));

        //Login butonuna tıkla
        userDashboard.userLogInButton.click();

        //Listing butonuna tıkla
        websiteMain.listingButton.click();

        //Sayfayı kaydır
        Listing listing = new Listing();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});",listing.ilkViewButton);
        ReusableMethods.bekle(1);

        //İlk ilanda 'View' butonuna tıkla
        listing.ilkViewButton.click();

        //'Share' butonuna tıkla
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});",listing.shareButton);
        ReusableMethods.bekle(2);
        listing.shareButton.click();
        ReusableMethods.bekle(2);

        //Facebook ikonuna tıkla
        listing.facebookButton.click();

        //Header bölümünde 'facebook' yazısının görünür olduğunu doğrula
        Assert.assertTrue(listing.facebookYazisi.isDisplayed());

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
        userDashboard.userPasswordForm.sendKeys(ConfigReader.getProperty("kevsGecerliPassword"));

        //Login butonuna tıkla
        userDashboard.userLogInButton.click();

        //Listing butonuna tıkla
        websiteMain.listingButton.click();

        //Sayfayı kaydır
        Listing listing = new Listing();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});",listing.ilkViewButton);
        ReusableMethods.bekle(1);

        //İlk ilanda 'View' butonuna tıkla
        listing.ilkViewButton.click();

        //Save' butonuna tıkla
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});",listing.saveButton);
        ReusableMethods.bekle(1);
        listing.saveButton.click();

        //Header bölümündeki Wishlist'in 0 olmadığını doğrula
        String expectedWishlistYazisi = "1";
        String actualWishlistYazisi = listing.wishlistSayisi.getText();

        Assert.assertEquals(actualWishlistYazisi,expectedWishlistYazisi);

        //Sayfayı kapat
        Driver.quitDriver();
    }

    @Test
    public void TC03(){
        //Browser aç ve https://qa.hauseheaven.com/  adersine git
        //Sign In butonuna tıkla
        //Email gir
        //Şifre gir
        //Login butonuna tıkla
        //Listing butonuna tıkla
        //Sayfayı kaydır
        //İlk ilanda 'View' butonuna tıkla
        //Sayfayı kaydır
        // 'Service' seçeneğinde 3.yıldıza tıkla
        // 'Value for Money' seçeneğinde 3.yıldıza tıkla
        // 'Location' seçeneğinde 3.yıldıza tıkla
        // 'Cleanliness' seçeneğinde 3.yıldıza tıkla
        // 'Average Rating' 3 olduğunu doğrula
        // 'Messages' kutusuna mesaj yaz
        //Submit Review butonuna tıkla
        //Sayfayı kaydır
        //Yazılan mesajın görüntülendiğini doğrula
        //Sayfayı kapat
    }
}
