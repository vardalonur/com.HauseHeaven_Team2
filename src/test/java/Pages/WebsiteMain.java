package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class WebsiteMain {
   public WebsiteMain () {     PageFactory.initElements(utilities.Driver.getDriver(), this);
}
// CAN BAŞLANGIÇ
// Listing Butonu
@FindBy (linkText ="Listing")
public WebElement listingButton;






































































































      // CAN BİTİŞ

      //KEVSER BAŞLANGIÇ
////////////////////////==================\\\\\\\\\\\\\\\\\\\\\\\\

//Header Bölümü Ortak Elementler\\

////////////////////////==================\\\\\\\\\\\\\\\\\\\\\\\\

@FindBy(xpath = "//*[@id=\"navigation\"]/div[2]/ul[1]/li[4]/a")
public WebElement agentsButton;

@FindBy(xpath = "//*[@id=\"navigation\"]/div[2]/ul[1]/li[7]/a")
public WebElement signUpButton;

@FindBy(xpath = "//*[@href=\"https://qa.hauseheaven.com/login\"]")
public WebElement signInButton;
/*
@FindBy(xpath = "(//*[@href=\"https://qa.hauseheaven.com/\"])[3]")
public WebElement homeButton;

@FindBy(xpath = "//*[@href=\"https://qa.hauseheaven.com/projects\"]")
public WebElement projectsButton;

@FindBy(xpath = "//*[@href=\"https://qa.hauseheaven.com/blog\"]")
public WebElement blogButton;

@FindBy(xpath = "(//*[@href=\"https://qa.hauseheaven.com/contact\"])[1]")
public WebElement contactButton;

@FindBy(xpath = "//*[@class='text-success']")
public WebElement addPropertyButton;

// kullanıcı adı-soyadı yazan kısım
@FindBy(xpath = "(//*[@class='login-item'])[1]")
public WebElement userDashboardButton;

@FindBy(xpath = "(//*[@class='login-item'])[2]")
public WebElement LogoutButton;

*/























































































      //KEVSER BİTİŞ
      //ÜMİT BAŞLANGIÇ


































































































      //ÜMİT BİTİŞ

}