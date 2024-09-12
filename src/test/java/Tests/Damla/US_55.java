package Tests.Damla;

import Pages.AdminDashboard;
import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_55 {
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
        Driver.quitDriver();
    }
    @Test
    public void TC02(){
        // Launch browser and Go to https://qa.hauseheaven.com/admin/login
        Driver.getDriver().get(ConfigReader.getProperty("AdminDashUrl"));

        AdminDashboard adminDashboard=new AdminDashboard();

        // Enter the relevant data in the Email field.
        adminDashboard.emailUsernameForm.sendKeys(ConfigReader.getProperty("AdminGecerliEmail"));

        // Enter the relevant data in the password field.
        adminDashboard.passwordForm.sendKeys(ConfigReader.getProperty("AdminGecerliPassword"));

        // Click the Sign in button.
        adminDashboard.signInButton.click();

        //Click Locations from the Sidebar menu.
        adminDashboard.locations.click();

        //Click Cities from the dropdown menu.
        adminDashboard.cities.click();

        //The Cities page is displayed.
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(adminDashboard.cities.isDisplayed(),"Cities sayfası görüntülendi.");

         //The available cities on the Cities page are displayed.
        softAssert.assertTrue(adminDashboard.citiesTable.isDisplayed(),"Şehirler tablosu göntülendi.");

        Driver.quitDriver();

    }

    @Test
    public void TC03(){
        // Launch browser and Go to https://qa.hauseheaven.com/admin/login
        Driver.getDriver().get(ConfigReader.getProperty("AdminDashUrl"));

        AdminDashboard adminDashboard=new AdminDashboard();

        // Enter the relevant data in the Email field.
        adminDashboard.emailUsernameForm.sendKeys(ConfigReader.getProperty("AdminGecerliEmail"));

        // Enter the relevant data in the password field.
        adminDashboard.passwordForm.sendKeys(ConfigReader.getProperty("AdminGecerliPassword"));

        // Click the Sign in button.
        adminDashboard.signInButton.click();

        //Click Locations from the Sidebar menu.
        adminDashboard.locations.click();

        //Click Cities from the dropdown menu.
        adminDashboard.cities.click();

        //The Cities page is displayed.
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(adminDashboard.cities.isDisplayed(),"Cities sayfası görüntülendi.");

        //Click Create.
        adminDashboard.citiesCreateButton.click();

        //In the form that opens, fill in the mandatory fields “name”, “slug” and “country”.
        adminDashboard.citiesFormName.sendKeys(ConfigReader.getProperty("citiesName"));
        adminDashboard.citiesFormSlug.sendKeys(ConfigReader.getProperty("citiesName"));

        Select selectCountry=new Select(adminDashboard.countryDropdownMenu);
        selectCountry.selectByValue("11");

        //Click save&exit.
        ReusableMethods.bekle(1);
        adminDashboard.citiesSaveExit.click();

        Driver.quitDriver();

    }
    @Test
    public void TC04(){
        // Launch browser and Go to https://qa.hauseheaven.com/admin/login
        Driver.getDriver().get(ConfigReader.getProperty("AdminDashUrl"));

        AdminDashboard adminDashboard=new AdminDashboard();

        // Enter the relevant data in the Email field.
        adminDashboard.emailUsernameForm.sendKeys(ConfigReader.getProperty("AdminGecerliEmail"));

        // Enter the relevant data in the password field.
        adminDashboard.passwordForm.sendKeys(ConfigReader.getProperty("AdminGecerliPassword"));

        // Click the Sign in button.
        adminDashboard.signInButton.click();

        //Click Locations from the Sidebar menu.
        adminDashboard.locations.click();

        //Click Cities from the dropdown menu.
        adminDashboard.cities.click();

        //The Cities page is displayed.
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(adminDashboard.cities.isDisplayed(),"Cities sayfası görüntülendi.");

        //Click “edit” for the created city.
        adminDashboard.citiesEditButton.click();

        //Necessary edits are made.
        Select selectSehir=new Select(adminDashboard.countryDropdownMenu);
        selectSehir.selectByValue("13");

        //Click save&exit.
        ReusableMethods.bekle(2);
        adminDashboard.citiesSaveExit.click();

        Driver.quitDriver();

    }
    @Test
    public void TC05(){
        // Launch browser and Go to https://qa.hauseheaven.com/admin/login
        Driver.getDriver().get(ConfigReader.getProperty("AdminDashUrl"));

        AdminDashboard adminDashboard=new AdminDashboard();

        // Enter the relevant data in the Email field.
        adminDashboard.emailUsernameForm.sendKeys(ConfigReader.getProperty("AdminGecerliEmail"));

        // Enter the relevant data in the password field.
        adminDashboard.passwordForm.sendKeys(ConfigReader.getProperty("AdminGecerliPassword"));

        // Click the Sign in button.
        adminDashboard.signInButton.click();

        //Click Locations from the Sidebar menu.
        adminDashboard.locations.click();

        //Click Cities from the dropdown menu.
        adminDashboard.cities.click();

        //The Cities page is displayed.
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(adminDashboard.cities.isDisplayed(),"Cities sayfası görüntülendi.");

        //Mark the new city/province created.
        adminDashboard.citiesCheckBox.click();

        //Click on the delete icon for the new city/district created.
        adminDashboard.citiesDeleteButton.click();

        //The “Do you really want to delete this record?” information box appears and click Delete.
        ReusableMethods.bekle(3);
        adminDashboard.ConfirmDelete.click();

        Driver.quitDriver();

    }
}
