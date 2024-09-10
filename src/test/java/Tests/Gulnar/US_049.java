package Tests.Gulnar;

import Pages.AdminDashboard;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;

public class US_049 {




    WebDriver driver;

    @Test
    public void TC_01() throws InterruptedException {

        utilities.Driver.getDriver().get(utilities.ConfigReader.getProperty("AdminDashUrl"));
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.emailUsernameForm.sendKeys(utilities.ConfigReader.getProperty("gulnarAdminGecerliEmail"));
        adminDashboard.passwordForm.sendKeys(utilities.ConfigReader.getProperty("gulnarAdminGecerliPassword"));
        adminDashboard.signInButton.click();
        Thread.sleep(200);
        Driver.quitDriver();

    }

    @Test
    public void TC_02() throws InterruptedException {

        utilities.Driver.getDriver().get(utilities.ConfigReader.getProperty("AdminDashUrl"));
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.emailUsernameForm.sendKeys(utilities.ConfigReader.getProperty("gulnarAdminGecerliEmail"));

        adminDashboard.passwordForm.sendKeys(utilities.ConfigReader.getProperty("gulnarAdminGecerliPassword"));

        adminDashboard.signInButton.click();
        Thread.sleep(500);

    /*
    payments  butonuna tıklanılır


Transactions butonuna tıkla
transactions gerı gıt
Payment methods butonuna tıkla
peyment methods cık
Admın sayfasından Logout yap
     */
//asagdakıların assort yapılacak unutma !!!isdisplayd

    adminDashboard.paymentsButton.click();

    Thread.sleep(300);
    adminDashboard.transactionsButton.click();

    Thread.sleep(300);

       // Thread.sleep(300);
    adminDashboard.paymentMethodsButton.click();
        softAssert.assertTrue(adminDashboard.paymentMethodsConfirm.isDisplayed());
        Thread.sleep(300);
        adminDashboard.adminProfilDropdown.click();

    adminDashboard.logoutButton.click();
    softAssert.assertAll();
    Driver.quitDriver();


    }




}