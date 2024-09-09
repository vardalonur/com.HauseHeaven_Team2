package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class TestBaseCross {
    // Crossbrowser calisacak class'lar icin
    // .xml'den gonderilen calisacakBrowser parametresini yakalayip
    // o browser'a uygun bir driver olusturup
    // Class'in kullanmasina hazir hale getirecek

    protected WebDriver driver;

    @Parameters("calisacakBrowser")
    @BeforeMethod
    public void setUp(@Optional String calisacakBrowser){

        driver= DriverCross.getDriver(calisacakBrowser);

    }

    @AfterMethod
    public void tearDown(){


        utilities.DriverCross.quitDriver();

    }
}
