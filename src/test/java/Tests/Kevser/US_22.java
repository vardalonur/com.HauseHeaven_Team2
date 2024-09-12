package Tests.Kevser;

import Pages.Listing;
import Pages.SignUp;
import Pages.UserDashboard;
import Pages.WebsiteMain;
import com.github.javafaker.Faker;
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
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));

        //Sign Up butonuna tıkla
        WebsiteMain websiteMain = new WebsiteMain();
        websiteMain.signUpButton.click();

        //Firs name text box'ına isim gir
        SignUp signUp = new SignUp();
        signUp.firsNameBox.sendKeys("Kevser");

        //Last name text box'ına soyisim gir
        signUp.lastNameBox.sendKeys("Test");

        //Email text box'ına mail adresi gir
        Faker faker = new Faker();
        signUp.emailBox.sendKeys(faker.internet().emailAddress());

        //Username text box'ına kullanıcı adı gir
        signUp.usernameBox.sendKeys(faker.funnyName().name());

        //Password text box'ına şifre gir
        signUp.passwordBox.sendKeys("Kevser1.");

        //Confirm Pasword text box'ına aynı şifreyi tekrar gir
        signUp.confirmPasswordBox.sendKeys("Kevser1.");

        ReusableMethods.bekle(1);

        //Register butonuna tıkla
        signUp.registerButton.click();

        //Listing butonuna tıkla
        websiteMain.listingButton.click();

        //Sayfayı kaydır
        Listing listing = new Listing();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});",listing.ilkViewButton);
        ReusableMethods.bekle(1);

        //İlk ilanda 'View' butonuna tıkla
        listing.ilkViewButton.click();

        //'Write a Review' bölümü görünene kadar sayfayı kaydır
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});",listing.writeAReviewYazisi);
        ReusableMethods.bekle(1);

        // 'Service' seçeneğinde 3.yıldıza tıkla
        listing.serviceYildiz3.click();

        // 'Value for Money' seçeneğinde 3.yıldıza tıkla
        listing.valueForMoneyYildiz3.click();

        // 'Location' seçeneğinde 3.yıldıza tıkla
        listing.locationYildiz3.click();

        // 'Cleanliness' seçeneğinde 3.yıldıza tıkla
        listing.cleanlinessYildiz3.click();

        // 'Average Rating' 3 olduğunu doğrula
        String expectedAverageRating = "3.00";
        String actualAverageRating = listing.averageRatingYazisi.getText();

        Assert.assertEquals(actualAverageRating,expectedAverageRating);

        // 'Messages' kutusuna mesaj yaz
        listing.messagesBox.sendKeys("hi!");

        //Submit Review butonuna tıkla
        listing.submitReview.click();

        //Sayfayı kaydır
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});",listing.sonYorum);
        ReusableMethods.bekle(1);

        //Yazılan mesajın görüntülendiğini doğrula
        String expectedSonYorum = "hi!";
        String actualSonYorum = listing.sonYorum.getText();
        Assert.assertEquals(actualSonYorum,expectedSonYorum);

        //Sayfayı kapat
        Driver.quitDriver();
    }
}
