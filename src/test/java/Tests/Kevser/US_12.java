package Tests.Kevser;

import Pages.UserDashboard;
import Pages.SignUp;
import Pages.UserDashboard;
import Pages.WebsiteMain;
import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_12 {

    @Test
    public void TC01_02_03_04(){

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

        //Account dashboard sayfasının görüntülendiğini doğrula
        String expectedUrl = "https://qa.hauseheaven.com/account/dashboard";
        String actualUrl = Driver.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

        //Settings butonuna tıkla
        UserDashboard userDashboard = new UserDashboard();
        userDashboard.settingsButton.click();

        //Phone text box'ına telefon numarası gir
        userDashboard.phoneBox.sendKeys("05000000000");

        //Save butonuna tıkla
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});",userDashboard.saveButton);
        ReusableMethods.bekle(1);
        userDashboard.saveButton.click();
        ReusableMethods.bekle(1);

        //İsmin altında telefon numarası görüntülendiğini doğrula
        Assert.assertTrue(userDashboard.phoneNumberText.isDisplayed());

        //Buy Credits butonuna tıkla
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});",userDashboard.buyCreditsButton);
        ReusableMethods.bekle(1);
        userDashboard.buyCreditsButton.click();

        //Free First Post butonuna tıkla
        userDashboard.freeFirstPostButton.click();

        //"Your Credits: 1 credits" yazısının görünür olduğunu doğrula
        Assert.assertTrue(userDashboard.creditsNumber.isDisplayed());

        Driver.getDriver().navigate().refresh();

        //Write a Property butonuna tıkla
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});",userDashboard.writePropertyButton);
        ReusableMethods.bekle(1);
        userDashboard.writePropertyButton.click();

        //Title' text box'ına başlık gir
        userDashboard.titleTextBox.sendKeys("test");

        //Content' text box'ına açıklama gir
        userDashboard.contentTextBox.sendKeys("test");

        //Save&Exit butonuna tıkla
        userDashboard.saveExitButton.click();
        ReusableMethods.bekle(1);

        //Ekelenen ilanın listede görüntülendiğini doğrula
        String expectedText = "1";
        String actualText = userDashboard.totalAdvertNumberText.getText();
        Assert.assertEquals(actualText,expectedText);

        //Sayfayı kapat
        ReusableMethods.bekle(1);
        Driver.quitDriver();
    }
}
