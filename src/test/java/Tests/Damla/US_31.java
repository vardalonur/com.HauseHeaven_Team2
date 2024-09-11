package Tests.Damla;

import Pages.AdminDashboard;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class US_31 {

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

       // Click on the "Blog" title in Sidebar.
        adminDashboard.blogButton.click();

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

        // Click on the "Blog" title in Sidebar.
        adminDashboard.blogButton.click();

        //Click on “Categories” under Blog.
        adminDashboard.CategoriesButton.click();

        //The Categories page is displayed.

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(adminDashboard.CategoriesButton.isDisplayed());

    }

    @Test
    public void TC03(){
        Actions actions=new Actions(Driver.getDriver());

        // Launch browser and Go to https://qa.hauseheaven.com/admin/login
        Driver.getDriver().get(ConfigReader.getProperty("AdminDashUrl"));

        AdminDashboard adminDashboard=new AdminDashboard();

        // Enter the relevant data in the Email field.
        adminDashboard.emailUsernameForm.sendKeys(ConfigReader.getProperty("AdminGecerliEmail"));

        // Enter the relevant data in the password field.
        adminDashboard.passwordForm.sendKeys(ConfigReader.getProperty("AdminGecerliPassword"));

        // Click the Sign in button.
        adminDashboard.signInButton.click();

        // Click on the "Blog" title in Sidebar.
        adminDashboard.blogButton.click();

        //Click on “Categories” under Blog.
        adminDashboard.CategoriesButton.click();

        //The Categories page is displayed.

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(adminDashboard.CategoriesButton.isDisplayed());

        //House architecture, House design,Building materials categories are displayed.
        softAssert.assertTrue(adminDashboard.houseArchitecture.isDisplayed());
        softAssert.assertTrue(adminDashboard.houseDesign.isDisplayed());
        softAssert.assertTrue(adminDashboard.buildingMaterials.isDisplayed());

        //Click on the “create” button to create a new category.
        adminDashboard.categoriesCreateButton.click();

        //Fill in the mandatory fields in the form that opens.
        adminDashboard.categoriesNameForm.sendKeys(ConfigReader.getProperty("formName"));

          ReusableMethods.bekle(2);
          Select selectParent=new Select(adminDashboard.categoriesParentForm);
          ReusableMethods.bekle(2);
          selectParent.selectByIndex(2);

          actions.sendKeys(Keys.PAGE_DOWN).perform();

          adminDashboard.statusDropdownElementi.submit();

        //Click save-exit.

        ReusableMethods.bekle(1);
        adminDashboard.saveExit.click();

        Driver.quitDriver();
    }
    @Test
    public void TC04(){
        Actions actions=new Actions(Driver.getDriver());

        // Launch browser and Go to https://qa.hauseheaven.com/admin/login
        Driver.getDriver().get(ConfigReader.getProperty("AdminDashUrl"));

        AdminDashboard adminDashboard=new AdminDashboard();

        // Enter the relevant data in the Email field.
        adminDashboard.emailUsernameForm.sendKeys(ConfigReader.getProperty("AdminGecerliEmail"));

        // Enter the relevant data in the password field.
        adminDashboard.passwordForm.sendKeys(ConfigReader.getProperty("AdminGecerliPassword"));

        // Click the Sign in button.
        adminDashboard.signInButton.click();

        // Click on the "Blog" title in Sidebar.
        adminDashboard.blogButton.click();

        //Click on “Categories” under Blog.
        adminDashboard.CategoriesButton.click();

        //The Categories page is displayed.

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(adminDashboard.CategoriesButton.isDisplayed());

        //Click on the “create” button to create a new category.
        adminDashboard.categoriesCreateButton.click();

        //The category is deleted.
        adminDashboard.newCategory.click();

        adminDashboard.cetegoriesTrashButton.click();

        adminDashboard.ConfirmDelete.click();

        boolean isCategoryPresent=false;

        Assert.assertFalse(isCategoryPresent,"kategori görüntülenemedi.");


    }
}
