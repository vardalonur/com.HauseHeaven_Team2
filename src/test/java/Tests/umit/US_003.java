package Tests.umit;

import Pages.WebsiteMain;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

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

        Select span= new Select(Driver.driver.findElement(By.id("minprice")));
        ReusableMethods.bekle(1);
        span.selectByValue("1000");
        ReusableMethods.bekle(1);
        websiteMain.minPriceClearButton.click();
        ReusableMethods.bekle(1);










//       Move the cursor over the list of selections on each box
//       Select any item and then clear it on each list of selection
//       Type a location name on the type box and delete it
//       Click on the search result button and go to the relevant page


    }


}



