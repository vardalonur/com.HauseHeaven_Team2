package Tests.umit;

import Pages.WebsiteMain;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.function.Function;

import static java.awt.SystemColor.window;

public class US_003 {


    @Test
    public void TC01() {

// Go to "HauseHeaven" home page

        Driver.getDriver().get("https://qa.hauseheaven.com/");

// Click on cookies button if needed

        WebsiteMain websiteMain = new WebsiteMain();
        websiteMain.mainPageCookies.click();

// Verify that the search module is displayed

        Assert.assertTrue(websiteMain.mainPageSearchModule.isDisplayed());

// Click on the searchbar

        websiteMain.searchLocationBar.click();

// Type "Texas" on the search bar, press ENTER and verify that search result is displayed

        websiteMain.searchLocationBar.sendKeys("Texas" + Keys.ENTER);

        String expectedSearchResultText = "Found 1 - 15 Of 52 Results";
        String actualSearchResultText = websiteMain.foundResultText.getText();

        Assert.assertEquals(actualSearchResultText, expectedSearchResultText);

//  Go back to the home page

        Driver.driver.navigate().back();

// Clear "Texas" on the search bar

        websiteMain.searchLocationBar.clear();
        ReusableMethods.bekle(2);

//  Click on the minPriceButton and select "1000" option

        Select span = new Select(Driver.driver.findElement(By.id("minprice")));
        ReusableMethods.bekle(1);
        span.selectByValue("1000");
        ReusableMethods.bekle(1);

//  Click on the PropertyType button and select "Apartment" option

        Select select = new Select(Driver.driver.findElement(By.id("ptypes")));
        select.selectByValue("1");

//  Click on the search result button

        Actions actions = new Actions(Driver.driver);
        actions.scrollToElement(websiteMain.searchResultBar).perform();
        websiteMain.searchResultBar.submit();


//  Verify that a result is found

        String expectedResultText = "Found 1 - 9 Of 9 Results";
        String actualResultText = websiteMain.foundResultText.getText();

        Assert.assertEquals(actualResultText, expectedResultText);
        ReusableMethods.bekle(2);


    }


    @Test
    public void TC_02() {

//  Go to "HauseHeaven" home page

        Driver.getDriver().get("https://qa.hauseheaven.com/");

//  Click on cookies button if needed

        WebsiteMain websiteMain = new WebsiteMain();
        websiteMain.mainPageCookies.click();

//  Scroll down the page until the Title of Explore Good Places is displayed

        Actions actions = new Actions(Driver.driver);
        actions.scrollByAmount(1500, 1500).perform();

//  Verify that the Title of Featured Properties is displayed on the main page

        Assert.assertTrue(websiteMain.exploreGoodPlacesText.isDisplayed());

//  Click on the first property title
//  and verify that the relevant page url contains the title of "residence"

        websiteMain.residenceTitle.click();

        String expectedUrlTitle = "residence";
        String actualUrlTitle = Driver.driver.getCurrentUrl();

        Assert.assertTrue(actualUrlTitle.contains(expectedUrlTitle.toLowerCase()));

//  Verify that the third property provide information about status,
//  picture, location, adresss, bedroom, bath, price and reviews of properties

        Assert.assertTrue(websiteMain.pineAvenueModul.isDisplayed());

        ReusableMethods.getWebelementScreenshot(websiteMain.pineAvenueModul);

//  Display the Elmwood Avenue web element and click on the wishlist button

        actions.scrollToElement(websiteMain.elmwood2Title).perform();
        websiteMain.wishListButton5.click();

//  Verify that the property added to wishlit by displaying JS Alert message

        JavascriptExecutor js = (JavascriptExecutor) Driver.driver;

        String expectedMessageText = "Added to wishlist successfully!";
        String actualMessageText = js.executeScript("//*[@id='alert-container']").toString();

        Assert.assertEquals(actualMessageText, expectedMessageText);

//  Display the Elmwood Avenue web element and click on the view button

        actions.scrollToElement(websiteMain.elmwood2Title).perform();
        websiteMain.viewButton5.click();

//  Verify that Elmwood Avenue property page opens by url

        String expectedPropertyPageUrl = "https://qa.hauseheaven.com/properties/13579-elmwood-avenue";
        String actualPropertyPageUrl = Driver.driver.getCurrentUrl();

        Assert.assertEquals(actualPropertyPageUrl, expectedPropertyPageUrl);

//  Go back to the home page

        Driver.driver.navigate().back();
        ReusableMethods.bekle(2);

//  Scroll down the page until the "Browse More Properties" bar is displayed

        actions.scrollByAmount(2000, 2000).perform();

//  Click on the search bar and verify that the "Properties" page opens directly, by displaying url

        websiteMain.browseMorePropertiesBar.submit();

        String expectedPropertiesPageUrl = "https://qa.hauseheaven.com/properties";
        String actualPropertiesPageButton = Driver.driver.getCurrentUrl();

        Assert.assertEquals(actualPropertyPageUrl, expectedPropertyPageUrl);


    }

    @Test
    public void TC_03() {

//  Go to "HauseHeaven" home page

        Driver.getDriver().get("https://qa.hauseheaven.com/");

//  Click on the "Accept Cookies" button if needed

        WebsiteMain websiteMain = new WebsiteMain();
        websiteMain.mainPageCookies.click();

//  Scroll down the page until the Title of "Find By Locations" is displayed

        Actions actions = new Actions(Driver.driver);
        actions.scrollByAmount(3200, 3200).perform();

//  Verify that the Title of "Find By Locations" is displayed on the main page

        Assert.assertTrue(websiteMain.findByLocationText.isDisplayed());

//  Click on the first location picture
//  and verify that the relevant page opens, by displaying the url

        websiteMain.denverImage.click();

        String expectedUrlTitle = "denver";
        String actualUrlTitle = Driver.driver.getCurrentUrl();

        Assert.assertTrue(actualUrlTitle.contains(expectedUrlTitle.toLowerCase()));

//  Scroll down the page

       actions.scrollByAmount(300, 300).perform();

//  Verify that the fourth location provide information about property number,

        websiteMain.newYorkModule.isDisplayed();

       String expectedPropertyContent= "5 Properties";
       String actualPropertyContent= websiteMain.newYorkPropertyContent.getText();

       Assert.assertTrue(actualPropertyContent.contains(expectedPropertyContent));


//  Display the "Austin" module and click on the right arrow button

        actions.scrollToElement(websiteMain.elmwood2Title).perform();
        websiteMain.wishListButton5.click();


//  Verify that the "Austin" page opens, by url

        String expectedAustinPageUrl="https://qa.hauseheaven.com/city/austin";
        String actualAustinPageUrl= Driver.driver.getCurrentUrl();
        Assert.assertEquals(actualAustinPageUrl,expectedAustinPageUrl);

//  Verify that 3 results found on the "Austin" location page

        String expectedAustinResultText= "Found 1 - 3 Of 3 Results";
        String actualAustinResultText= websiteMain.austinPageFoundResultText.getText();

        Assert.assertEquals(actualAustinResultText,expectedAustinResultText);

//  Go back to the home page

        Driver.driver.navigate().back();
        ReusableMethods.bekle(2);

//  Scroll down the page until the "Browse More Properties" bar is displayed

        //actions.scrollByAmount(2000, 2000).perform();

//  Click on the "Browse By Locations" bar and
//  verify that the "Properties" page opens directly, by displaying url

        websiteMain.browseByLocationBar.submit();

        String expectedPropertiesPageUrl = "https://qa.hauseheaven.com/properties";
        String actualPropertiesPageUrl = Driver.driver.getCurrentUrl();

        Assert.assertEquals(actualPropertiesPageUrl, expectedPropertiesPageUrl);


    }

}

