package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class WebsiteMain {
    public WebsiteMain() {
        PageFactory.initElements(utilities.Driver.getDriver(), this);
    }

    // CAN BAŞLANGIÇ
// Listing Butonu
    @FindBy(linkText = "Listing")
    public WebElement listingButton;


    // CAN BİTİŞ

    //KEVSER BAŞLANGIÇ
////////////////////////==================\\\\\\\\\\\\\\\\\\\\\\\\

//Header Bölümü Ortak Elementler\\

////////////////////////==================\\\\\\\\\\\\\\\\\\\\\\\\

    @FindBy(xpath = "//*[@id=\"navigation\"]/div[2]/ul[1]/li[4]/a")
    public WebElement agentsButonu;


    //KEVSER BİTİŞ
    //ÜMİT BAŞLANGIC
    // Main Page Web Elements


}