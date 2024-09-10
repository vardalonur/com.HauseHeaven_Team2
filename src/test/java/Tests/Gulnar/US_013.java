package Tests.Gulnar;

import Pages.Listing;
import Pages.UserDashboard;
import Pages.WebsiteMain;
import com.google.j2objc.annotations.Property;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class US_013 {

    WebDriver driver;

    @Test
    public void TC01() throws InterruptedException {



     //   browers açılır url gırılır
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));

    //  //Sign Up butonuna tıkla
        WebsiteMain websiteMain=new WebsiteMain();
        websiteMain .signUpButton.click();


        SoftAssert softAssert = new SoftAssert();
        UserDashboard userDashboard = new UserDashboard();

        userDashboard.homePageSignInButton.click();


        //Email/Username yaz

        userDashboard.userEmailUsernameForm.sendKeys(ConfigReader.getProperty("gulnarGecerliEmail"));
     //   Password yaz
        userDashboard.userPasswordForm.sendKeys(ConfigReader.getProperty("gulnarGecerliPassword"));
        Thread.sleep(2000);
        userDashboard.userLogInButton.click();
      //  LOGOUT tıklanır
        Thread.sleep(3000);

        Driver.quitDriver();



        }





     }














