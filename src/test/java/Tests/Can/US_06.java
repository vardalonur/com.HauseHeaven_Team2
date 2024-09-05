package Tests.Can;

import Pages.Listing;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
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

        Integer totalResult = Integer.valueOf(totalResultinString);

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
        String expectedPreiseOfAProperty = listing.preiseOfAProperty.get(0).getText();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        listing.viewButton.get(0).click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //Validate Current Title

        String actualTitleOfAProperty = listing.titleAfterClickingOnView.getText();

        softAssert.assertEquals(actualTitleOfAProperty,expectedTitleOfAProperty);

        //Validate preise of the property with preise in listing page

        String actualPreiseOfAProperty = listing.preiseAfterClickingOnView.getText();

        softAssert.assertEquals(actualPreiseOfAProperty, expectedPreiseOfAProperty);
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

        Listing listing = new Listing();
        //Fill determined search boxes then click on "Find New Home"
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //  Select selectHouse = new Select(listing.typeDropDown);
        //  selectHouse.selectByVisibleText("For Sale");
        listing.searchBoxDropDownMenu.get(3).click();



        //Validate the Result


        Driver.quitDriver();
    }

    @Test
    public void TC04(){
        //Go to HauseHeven Home Page
        Driver.getDriver().get("https://qa.hauseheaven.com/");

        //Click on "Listing"
        WebsiteMain webSiteMain = new WebsiteMain();
        webSiteMain.listingButton.click();

        //Click on "Sorty By"
        //Choose "Price: High to low"

    }
}