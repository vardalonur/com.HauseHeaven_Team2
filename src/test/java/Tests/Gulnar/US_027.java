package Tests.Gulnar;

import Pages.AdminDashboard;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;

public class US_027 {


   /*
   Url gırılmelı
  Admın, giriş ekranında kullanıcı adı ve şifresini girerek  sisteme giriş yapabilmelidir.

  Admın sayfasını dashboard erişdigini onaylanmalı
  Kullanıcı oturumu belirli bir süre boyunca aktif kalmalı
  belirli bir süre işlem yapılmadığında otomatik olarak sonlandırılmalıdır.
    */

WebDriver driver;
@Test
public   void TC_01() throws InterruptedException {

    utilities.Driver.getDriver().get(utilities.ConfigReader.getProperty("AdminDashUrl"));
    SoftAssert softAssert = new SoftAssert();
    AdminDashboard adminDashboard = new AdminDashboard();
    adminDashboard.emailUsernameForm.sendKeys(utilities.ConfigReader.getProperty("gulnarAdminGecerliEmail"));
    adminDashboard.passwordForm.sendKeys(utilities.ConfigReader.getProperty("gulnarAdminGecerliPassword"));
    adminDashboard.signInButton.click();
    Thread.sleep(200);
    Driver.quitDriver();










}










}
