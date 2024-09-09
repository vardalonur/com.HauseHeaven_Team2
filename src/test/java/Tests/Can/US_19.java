package Tests.Can;

import Pages.Listing;
import Pages.UserDashboard;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

import static utilities.Driver.driver;

public class US_19 {

    @Test
    public void TC01(){

        Actions actions = new Actions(Driver.getDriver());
        //Launch browser
        //Go to https://qa.hauseheaven.com/login
        Driver.getDriver().get(ConfigReader.getProperty("UserLoginPageUrl"));
        UserDashboard userDashboard = new UserDashboard();
        //Enter valid username and password
        userDashboard.userEmailUsernameForm.sendKeys(ConfigReader.getProperty("WebsiteGecerliEmail"));
        userDashboard.userPasswordForm.sendKeys(ConfigReader.getProperty("WebsiteGecerliPassword"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        userDashboard.userLogInButton.click();
        //Enter test data in body section
        utilities.ReusableMethods.bekle(3);
        userDashboard.searchForALocation.click();
        utilities.ReusableMethods.bekle(1);
        userDashboard.searchForALocation.sendKeys("Konya");
        utilities.ReusableMethods.bekle(3);

        Listing listing = new Listing();

        js.executeScript("window.scrollBy(0,100)");
        //No Min: 500
        utilities.ReusableMethods.bekle(2);
        listing.searchBoxMinPriceDropDownMenu.click();
        listing.dropDownYazmaYeri.sendKeys(("500" + Keys.ENTER));

        //No Max: 1000
        listing.searchBoxMaxPriceDropDownMenu.click();
        listing.dropDownYazmaYeri.sendKeys("1000" + Keys.ENTER);

        utilities.ReusableMethods.bekle(3);
        userDashboard.category.click();
        //userDashboard.categoryInput.sendKeys("Villa" + Keys.ENTER);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        userDashboard.searchResult.click();

        //Search Result

        SoftAssert softAssert = new SoftAssert();

        String expectedTitle = "0 Results";
        String actualTitle = userDashboard.numberOfResultBodySearch.getText();

        softAssert.assertEquals(actualTitle, expectedTitle);
        //Validate number of the result

        Driver.quitDriver();

    }
}
