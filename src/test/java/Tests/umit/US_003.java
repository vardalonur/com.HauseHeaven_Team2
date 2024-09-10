package Tests.umit;

import Pages.WebsiteMain;
import org.openqa.selenium.*;
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
    public void TC_02(){

//  Go to "HauseHeaven" home page

        Driver.getDriver().get("https://qa.hauseheaven.com/");

//  Click on cookies button if needed

        WebsiteMain websiteMain = new WebsiteMain();
        websiteMain.mainPageCookies.click();

//  Scroll down the page until the Title of Explore Good Places is displayed

        Actions actions = new Actions(Driver.driver);
        actions.scrollByAmount(1500,1500).perform();

//  Verify that the Title of Featured Properties is displayed on the main page

        Assert.assertTrue(websiteMain.exploreGoodPlacesText.isDisplayed());

//  Click on the first property title
//  and verify that the relevant page url contains the title of "residence"

        websiteMain.residenceTitle.click();

        String expectedUrlTitle= "residence";
        String actualUrlTitle=Driver.driver.getCurrentUrl();

        Assert.assertTrue(actualUrlTitle.contains(expectedUrlTitle.toLowerCase()));





//        Verify that each property provide information about status, picture, location, adresss, bedroom, bath, price and reviews of properties
//        Move the mouse pointer on web elements of each property and verify that some web elements are interactive
//        Click on the inteactive web elements and verify they are functional
//        Verify that a property page opens directly  when clicked on interactive elements
//        Verify that the correct page of property opens when clicked on it
//        Verify that a user is able to search for more properties by browsing it on the main page










    }


}



