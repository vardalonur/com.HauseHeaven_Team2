package Tests.Can;

import Pages.Listing;
import Pages.WebsiteMain;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

public class US_06 {

    @Test
    public void TC01(){

        //Go to HauseHeven Home Page
        Driver.getDriver().get("https://qa.hauseheaven.com/");

        //Click on "Listing"
        WebsiteMain webSiteMain = new WebsiteMain();
        webSiteMain.listingButton.click();

        //Validate Current Title
        String expectedCurrentTitle = "Properties";
        String actualCurrentTitle = driver.getTitle();

        //Create softAssert Object
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(actualCurrentTitle, expectedCurrentTitle);

        Listing listing = new Listing();
        // Validate number of Found result at least 1
        String expectedMinResult = "1";
        String actualResultinString = Listing.numberOfResult.getText().substring(6,7);

        softAssert.assertEquals(actualResultinString, expectedMinResult);

        String totalResultinString = Listing.numberOfResult.getText().substring(16,18);

        int totalResult = Integer.parseInt(totalResultinString);

        System.out.println("Total number of Result: " + totalResult);

        softAssert.assertAll();

        Driver.quitDriver();

    }

    @Test
    public void TC02(){
        Actions actions = new Actions(Driver.getDriver());
        //Go to HauseHeven Home Page
        Driver.getDriver().get("https://qa.hauseheaven.com/");

        //Click on "Listing"
        WebsiteMain webSiteMain = new WebsiteMain();
        webSiteMain.listingButton.click();

        //Validate Current Title
        String expectedCurrentTitle = "Properties";
        String actualCurrentTitle = driver.getTitle();

        //Create softAssert Object
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(actualCurrentTitle, expectedCurrentTitle);

        Listing listing = new Listing();

        //Click on the first property of the page with "View" Button
        String expectedTitleOfAProperty = listing.titleOfAProperty.get(0).getText();
        String expectedPreciseOfAProperty = listing.preiseOfAProperty.get(0).getText();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        listing.viewButton.get(0).click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //Validate Current Title

        String actualTitleOfAProperty = listing.titleAfterClickingOnView.getText();

        softAssert.assertEquals(actualTitleOfAProperty,expectedTitleOfAProperty);

        //Validate preise of the property with preise in listing page

        String actualPreiseOfAProperty = listing.preiseAfterClickingOnView.getText();

        softAssert.assertEquals(actualPreiseOfAProperty, expectedPreciseOfAProperty);
        Driver.quitDriver();
    }

    @Test
    public void TC03(){
        Actions actions = new Actions(Driver.getDriver());
        //Go to HauseHeven Home Page
        Driver.getDriver().get("https://qa.hauseheaven.com/");

        //Click on "Listing"
        WebsiteMain webSiteMain = new WebsiteMain();
        webSiteMain.listingButton.click();

        //Validate Current Title
        String expectedCurrentTitle = "Properties";
        String actualCurrentTitle = driver.getTitle();

        //Create softAssert Object
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(actualCurrentTitle, expectedCurrentTitle);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Listing listing = new Listing();
        //Fill determined search boxes then click on "Find New Home"
        //actions.sendKeys(Keys.PAGE_DOWN).perform();

        utilities.ReusableMethods.bekle(1);
        //Type: For Sale
        listing.typeDropDown.click();
        utilities.ReusableMethods.bekle(1);
        listing.dropDownYazmaYeri.sendKeys("For Sale");
        utilities.ReusableMethods.bekle(1);
        listing.dropDownYazmaYeri.sendKeys(Keys.ENTER);

        utilities.ReusableMethods.bekle(1);
        //No Min: 500
        listing.searchBoxMinPriceDropDownMenu.click();
        listing.dropDownYazmaYeri.sendKeys(("500" + Keys.ENTER));

        //No Max: 1000
        listing.searchBoxMaxPriceDropDownMenu.click();
        listing.dropDownYazmaYeri.sendKeys("1000" + Keys.ENTER);

        //Checkbox: Wifi and Swimming Pool
        utilities.ReusableMethods.bekle(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
        utilities.ReusableMethods.bekle(1);
        listing.wifi.click();
        listing.swimmingpool.click();
        utilities.ReusableMethods.bekle(1);
        //Searching by clicking on button

        js.executeScript("arguments[0].scrollIntoView(true);", listing.findNewHomeButton);
        listing.findNewHomeButton.submit();
       actions.sendKeys(Keys.PAGE_DOWN).perform();

       utilities.ReusableMethods.bekle(2);
       actions.sendKeys(Keys.PAGE_DOWN).perform();
       utilities.ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //Validate the Result

        String expectedResult = "0";
        String actualResult = listing.numberOfResultHome.getText();

        softAssert.assertEquals(actualResult, expectedResult);

        Driver.quitDriver();
    }

    @Test
    public void TC04(){
        Actions actions = new Actions(Driver.getDriver());
        //Go to HauseHeven Home Page
        Driver.getDriver().get("https://qa.hauseheaven.com/");

        //Click on "Listing"
        WebsiteMain webSiteMain = new WebsiteMain();
        webSiteMain.listingButton.click();

        //Click on "Sorty By"
        Listing listing = new Listing();

        listing.sortByButton.click();
        utilities.ReusableMethods.bekle(3);
        //Choose "Name: A-Z"
        listing.sortByButtonInput.sendKeys("Name: A-Z");
        utilities.ReusableMethods.bekle(1);
        listing.sortByButtonInput.sendKeys(Keys.ENTER);
        //Create softAssert Object
        SoftAssert softAssert = new SoftAssert();

        utilities.ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        String expectedTitle = "001";

        String actualTitle = listing.headOfFirstProperty.getText();

        softAssert.assertEquals(actualTitle, expectedTitle);

        Driver.quitDriver();
    }
}