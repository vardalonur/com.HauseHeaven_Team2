package Tests.Gulnar;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class US_01 {

     //US01
    WebDriver driver;
    @Test
   public void TC01() throws InterruptedException {
     //   1.Browers açılır,Url gırılır,anasayfa açılır
       Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));

    //2 bıraz bekle
      Thread.sleep(3);

    // siteyi kapat
        Driver.quitDriver();

   }


    }







