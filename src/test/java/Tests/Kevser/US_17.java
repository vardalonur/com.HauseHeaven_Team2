package Tests.Kevser;

import Pages.UserDashboard;
import Pages.WebsiteMain;
import org.apache.xmlbeans.impl.xb.xsdschema.Attribute;
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
        //Login butonuna tıkla
        //Home butonuna tıkla
        //Find accessible homes to rent' yazısının görünür olduğunu doğrula
        //Listing butonuna tıkla
        //Properties' yazısının görünür olduğunu doğrula
        //Projects butonuna tıkla
        //All projects' yazısının görünür olduğunu doğrula
        //Agents butonuna tıkla
        //All Agents' yazısının görünür olduğunu doğrula
        //Blog butonuna tıkla
        //Blog' yazısının görünür olduğunu doğrula
        //Contact butonuna tıkla
        //Contact' yazısının görünür olduğunu doğrula
        //Sign Up butonuna tıkla
        //Your Current Credits:' yazısının görünür olduğunu doğrula
        //Add Property butonuna tıkla
        //Title text box'ının görünür olduğunu doğrula
        //Logout butonuna tıkla
        //Sign In butonunun görünür olduğunu doğrula
        //Sayfayı kapat
    }
}
