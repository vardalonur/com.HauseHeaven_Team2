package Tests.Can;

import org.testng.annotations.Test;
import utilities.Driver;

public class US_19 {

    @Test
    public void TC01(){

        Driver.getDriver().get("https://qa.hauseheaven.com/login");

        Driver.quitDriver();

    }
}