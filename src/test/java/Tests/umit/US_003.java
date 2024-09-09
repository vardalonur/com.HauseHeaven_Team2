package Tests.umit;

import Pages.WebsiteMain;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

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

        String expectedSearchResultText= "Found 1 - 15 Of 52 Results";
        String actualSearchResultText= websiteMain.foundResultText.getText();

        Assert.assertEquals(actualSearchResultText,expectedSearchResultText);


//       Verify that a list of selection is displayed when clicked on each box
//       Move the cursor over the list of selections on each box
//       Select any item and then clear it on each list of selection
//       Type a location name on the type box and delete it
//       Click on the search result button and go to the relevant page


    }


}
