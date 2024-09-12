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
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.function.Function;

import static java.awt.SystemColor.window;

public class US_003 {


    @Test
    public void TC_01() {

// Go to "HauseHeaven" home page

        Driver.getDriver().get("https://qa.hauseheaven.com/");

// Click on cookies button if needed

        WebsiteMain websiteMain = new WebsiteMain();
        websiteMain.mainPageCookies.click();

// Verify that the search module is displayed
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(websiteMain.mainPageSearchModule.isEnabled());

// Click on the searchbar

        websiteMain.searchLocationBar.click();

// Type "Texas" on the search bar, press ENTER and verify that
// the search process filters properties only available in Texas locatin

        websiteMain.searchLocationBar.sendKeys("Texas" + Keys.ENTER);

        String expectedSearchResultText = "Found 1 - 6 Of 6 Results";
        String actualSearchResultText = websiteMain.foundResultText.getText();

        softAssert.assertEquals(actualSearchResultText, expectedSearchResultText, "results does not match");

//  Go back to the home page

        Driver.driver.navigate().back();
        ReusableMethods.bekle(1);

//  Clear "texas" on the search bar

        websiteMain.searchLocationBar.clear();
        ReusableMethods.bekle(1);

//  Type "abc" on the search bar, press ENTER and verify that no result is found

        websiteMain.searchLocationBar.sendKeys("abc" + Keys.ENTER);

        String unexpectedSearchResultText = "No Result Found";
        String actualSearchResultText1 = websiteMain.foundResultText.getText();
        softAssert.assertEquals(actualSearchResultText1, unexpectedSearchResultText, "results does not match");

//  Go back to the home page

        Driver.driver.navigate().back();
        ReusableMethods.bekle(1);

// Clear "abc" on the search bar

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
        websiteMain.searchResultBar.click();


//  Verify that a result is found

        String expectedResultText = "Found 1 - 9 Of 9 Results";
        String actualResultText = websiteMain.foundResultText.getText();

        softAssert.assertEquals(actualResultText, expectedResultText);
        softAssert.assertAll();


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
        actions.scrollByAmount(2300, 2300).perform();

//  Verify that the Title of "Find By Locations" is displayed on the main page

        Assert.assertTrue(websiteMain.findByLocationText.isDisplayed());

//  Click on the first location picture
//  and verify that the relevant page opens, by displaying the url

        websiteMain.denverImage.click();

        String expectedUrlTitle = "denver";
        String actualUrlTitle = Driver.driver.getCurrentUrl();

        Assert.assertTrue(actualUrlTitle.contains(expectedUrlTitle.toLowerCase()));

//  Go back to the home page

        Driver.driver.navigate().back();
        ReusableMethods.bekle(2);

//  Scroll down the page

        actions.scrollByAmount(2600, 2600).perform();

//  Verify that the fourth location provide information about property number,

        websiteMain.newYorkModule.isDisplayed();

        String expectedPropertyContent = "5 Properties";
        String actualPropertyContent = websiteMain.newYorkPropertyContent.getText();

        Assert.assertTrue(actualPropertyContent.contains(expectedPropertyContent));


//  Display the "Austin" module and click on the right arrow button

        websiteMain.austinModule.isDisplayed();
        ReusableMethods.bekle(2);
        actions.scrollToElement(websiteMain.austinRightArrow).perform();
        websiteMain.austinRightArrow.click();

//  Verify that the "Austin" page opens, by url
        ReusableMethods.bekle(2);

        String expectedAustinPageUrl = "https://qa.hauseheaven.com/city/austin";
        String actualAustinPageUrl = Driver.driver.getCurrentUrl();
        Assert.assertEquals(actualAustinPageUrl, expectedAustinPageUrl);

//  Verify that 3 results found on the "Austin" location page

        String expectedAustinResultText = "Found 1 - 3 Of 3 Results";
        String actualAustinResultText = websiteMain.austinPageFoundResultText.getText();

        Assert.assertEquals(actualAustinResultText, expectedAustinResultText);

//  Go back to the home page

        Driver.driver.navigate().back();
        ReusableMethods.bekle(2);

//  Scroll down the page until the "Browse More Properties" bar is displayed

        actions.scrollToElement(websiteMain.browseByLocationBar).perform();

//  Click on the "Browse By Locations" bar and
//  verify that the "Properties" page opens directly, by displaying url

        websiteMain.browseByLocationBar.click();

        String expectedPropertiesPageUrl = "https://qa.hauseheaven.com/properties";
        String actualPropertiesPageUrl = Driver.driver.getCurrentUrl();

        Assert.assertEquals(actualPropertiesPageUrl, expectedPropertiesPageUrl);


    }

    @Test
    public void TC_04(){

//  Go to "HauseHeaven" home page

        Driver.getDriver().get("https://qa.hauseheaven.com/");

// Click on cookies button if needed

        WebsiteMain websiteMain = new WebsiteMain();
        websiteMain.mainPageCookies.click();

//  Scroll down the page until the Title of "See Our Packages" is displayed

        Actions actions = new Actions(Driver.driver);
        actions.scrollToElement(websiteMain.packagesText).perform();

// Verify that the "See Our Packages" title is displayed
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(websiteMain.packagesText.isDisplayed());

//  Verify that different offers of packages are displayed

        softAssert.assertTrue(websiteMain.freeFirstPostElement.isDisplayed());
        softAssert.assertTrue(websiteMain.singlePostElement.isDisplayed());
        softAssert.assertTrue(websiteMain.fivePostElement.isDisplayed());


//  Scroll down the page until the "Free First Post" Choose Plan is displayed

        actions.scrollToElement(websiteMain.freeFirstChoosePlan).perform();

//  Click on the "Free First Post" Choose Plan

        websiteMain.freeFirstChoosePlan.click();

//  Verify that the login page opens when choosing the plan

       ReusableMethods.bekle(2);

       String expectedPageUrl= "https://qa.hauseheaven.com/login";
       String actualPageUrl= Driver.driver.getCurrentUrl();

       softAssert.assertEquals(actualPageUrl, expectedPageUrl);

//  Go back to the home page
//  and scroll down until the "Single Post Choose Plan" is displayed

        Driver.driver.navigate().back();
        ReusableMethods.bekle(1);
        actions.scrollToElement(websiteMain.singlePostChoosePlan).perform();

//  Click on the "Single Post" Choose Plan

        websiteMain.singlePostChoosePlan.click();

//  Verify that the login page opens when choosing the plan

        ReusableMethods.bekle(2);

        String expectedPageUrl1= "https://qa.hauseheaven.com/login";
        String actualPageUrl1= Driver.driver.getCurrentUrl();

        softAssert.assertEquals(actualPageUrl1, expectedPageUrl1);

//  Go back to the home page
//  and scroll down until the "Five Posts Choose Plan" is displayed

        Driver.driver.navigate().back();
        ReusableMethods.bekle(1);
        actions.scrollToElement(websiteMain.fivePostChoosePlan).perform();

//  Click on the "Single Post" Choose Plan

        websiteMain.fivePostChoosePlan.click();

//  Verify that the login page opens when choosing the plan

        ReusableMethods.bekle(2);

        String expectedPageUrl2= "https://qa.hauseheaven.com/login";
        String actualPageUrl2= Driver.driver.getCurrentUrl();

        softAssert.assertEquals(actualPageUrl2, expectedPageUrl2);

        softAssert.assertAll();


    }


    @Test
    public void TC_05(){

//  Go to "HauseHeaven" home page

        Driver.getDriver().get("https://qa.hauseheaven.com/");

// Click on cookies button if needed

        WebsiteMain websiteMain = new WebsiteMain();
        websiteMain.mainPageCookies.click();

//  Scroll down the page until the Title of "Good Reviews By Customers" is displayed

        Actions actions = new Actions(Driver.driver);
        actions.scrollToElement(websiteMain.goodReviewsText).perform();

// Verify that the "Good Reviews By Customers" title is displayed

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(websiteMain.goodReviewsText.isDisplayed());

//  Scroll down the page until the "Good Reviews Slide Element" is displayed

        actions.scrollToElement(websiteMain.goodReviewsSlideElement).perform();

//  Verify that reviews are enable

        softAssert.assertTrue(websiteMain.goodReviewsSlideElement.isEnabled());

//  Keep the mouse pointer one review and verify that it is displayed

        actions.clickAndHold(websiteMain.reviewByCustomer).perform();

        softAssert.assertTrue(websiteMain.reviewByCustomer.isDisplayed());

        softAssert.assertAll();


    }

    @Test
    public void TC_06(){

//  Go to "HauseHeaven" home page

        Driver.getDriver().get("https://qa.hauseheaven.com/");

// Click on cookies button if needed

        WebsiteMain websiteMain = new WebsiteMain();
        websiteMain.mainPageCookies.click();

//  Scroll down the page to the bottom

        Actions actions = new Actions(Driver.driver);
        actions.scrollByAmount(6500,6500);

//  Scroll down the page to the bottom by clicking on the scroll bar

        actions.clickAndHold(websiteMain.scrollBarElement).moveToElement(websiteMain.packagesText).perform();




    }








}













