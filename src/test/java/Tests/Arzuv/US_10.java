package Tests.Arzuv;

import Pages.WebsiteMain;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

import static utilities.Driver.driver;


public class US_10 {

    @Test

    public void blogPageTest01() throws InterruptedException {

        //  Open browser
        //  Enter Url https://qa.hauseheaven.com/
        //  Click on blog menu on the header
        //  Navigate to Blog page
        //  Scroll down the blog page
        //  Click on 'Blog type' or 'Continue' to get info
        //  Navigate to a new page where you can read the rest of blog
        //  Click Blog menu again to see other blog posts

        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));
        WebsiteMain webSiteMain = new WebsiteMain();
        webSiteMain.getBlogButton.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(webSiteMain.getBlogButton.isDisplayed());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
        utilities.ReusableMethods.bekle(1);

        webSiteMain.Blogatiklama.click();
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1100)");
        utilities.ReusableMethods.bekle(1);

        webSiteMain.getBlogButton.click();
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5100)");
        Thread.sleep(200);
       driver.quit();


    }
    }
