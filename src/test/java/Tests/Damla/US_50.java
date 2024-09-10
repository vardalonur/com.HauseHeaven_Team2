package Tests.Damla;

import Pages.AdminDashboard;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_50 {

    WebDriver driver;

@Test
    public void TC01(){

        // Launch browser and Go to https://qa.hauseheaven.com/admin/login
        Driver.getDriver().get(ConfigReader.getProperty("AdminDashUrl"));

        AdminDashboard adminDashboard=new AdminDashboard();

        // Enter the relevant data in the Email field.
        adminDashboard.emailUsernameForm.sendKeys(ConfigReader.getProperty("AdminGecerliEmail"));

        // Enter the relevant data in the password field.
        adminDashboard.passwordForm.sendKeys(ConfigReader.getProperty("AdminGecerliPassword"));

        // Click the Sign in button.
        adminDashboard.signInButton.click();

    }
    @Test
    public void TC02(){

        //Launch browser and Go to https://qa.hauseheaven.com/admin/login
        Driver.getDriver().get(ConfigReader.getProperty("AdminDashUrl"));

        AdminDashboard adminDashboard=new AdminDashboard();

        //Enter the relevant data in the Email field.
        adminDashboard.emailUsernameForm.sendKeys(ConfigReader.getProperty("AdminGecerliEmail"));

        //Enter the relevant data in the password field.
        adminDashboard.passwordForm.sendKeys(ConfigReader.getProperty("AdminGecerliPassword"));

        //Click the Sign in button.
        adminDashboard.signInButton.click();

        //Click “Payments” from the sidebar menu.
        adminDashboard.payments.click();

        //Click "Transactions"  from the dropdown menu.
        adminDashboard.transactionsAltBaslik.click();

        //Transactions page is displayed.
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(adminDashboard.transactionsAltBaslik.isDisplayed());
    }
    @Test
    public void TC03(){
        //Launch browser and Go to https://qa.hauseheaven.com/admin/login
        Driver.getDriver().get(ConfigReader.getProperty("AdminDashUrl"));

        AdminDashboard adminDashboard=new AdminDashboard();

        //Enter the relevant data in the Email field.
        adminDashboard.emailUsernameForm.sendKeys(ConfigReader.getProperty("AdminGecerliEmail"));

        //Enter the relevant data in the password field.
        adminDashboard.passwordForm.sendKeys(ConfigReader.getProperty("AdminGecerliPassword"));

        //Click the Sign in button.
        adminDashboard.signInButton.click();

        //Click “Payments” from the sidebar menu.
        adminDashboard.payments.click();

        //Click "Transactions"  from the dropdown menu.
        adminDashboard.transactionsAltBaslik.click();

        //Transactions page is displayed.
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(adminDashboard.transactionsAltBaslik.isDisplayed());

        Actions actions=new Actions(Driver.getDriver());
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.DOWN);
        ReusableMethods.bekle(2);
        //WebElement infoBox= driver.findElement(By.xpath("//span[@class='badge bg-secondary bold badge-dt']"));

        //Assert.assertTrue(infoBox.isDisplayed());
        Driver.quitDriver();
    }
}
