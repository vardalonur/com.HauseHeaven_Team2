package Tests.Can;

import Pages.Listing;
import Pages.WebsiteMain;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;

import static utilities.Driver.driver;

public class US_07 {

    @Test
    public void TC01(){
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

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        listing.viewButton.get(0).click();

        utilities.ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        listing.shareButton.click();
        utilities.ReusableMethods.bekle(2);

        Driver.getDriver().quit();

    }

    @Test
    public void TC02(){}
    @Test
    public void TC03(){}
    @Test
    public void TC04(){}
}
