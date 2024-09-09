package Tests.Can;

import Pages.UserDashboard;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

public class US_19 {

    @Test
    public void TC01(){

        Actions actions = new Actions(Driver.getDriver());
        //Launch browser
        //Go to https://qa.hauseheaven.com/login
        Driver.getDriver().get(ConfigReader.getProperty("LoginPageUrl"));
        UserDashboard userDashboard = new UserDashboard();
        //Enter valid username and password
       // userDashboard.emailUsername.sendKeys(ConfigReader.getProperty("WebsiteGecerliEmail"));
       // userDashboard.emailPassword.sendKeys(ConfigReader.getProperty("WebsiteGecerliPassword"));

        actions.sendKeys(Keys.PAGE_DOWN).perform();
       // userDashboard.emailLogin.click();
        //Enter test data in body section
        //Search Result
        //Validate number of the result


        Driver.quitDriver();

    }
}
