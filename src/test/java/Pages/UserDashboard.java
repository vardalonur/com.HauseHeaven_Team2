package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class UserDashboard {

    public UserDashboard(){
        PageFactory.initElements(utilities.Driver.getDriver(), this);
    }

//SERPİL BAŞLANGIÇ

    //Home Page\\
    //Home Page SıgnIn Button
    @FindBy(xpath = "//li[@class='add-listing']")
    public WebElement homePageSignInButton;

    //User Login Panel\\
    //UserEmail/Username
    @FindBy (xpath = "//*[@placeholder='Email/Username']")
    public WebElement userEmailUsernameForm;
    //Password
    @FindBy (xpath = "//*[@placeholder='Password']")
    public WebElement userPasswordForm;
    //Sign in Button
    @FindBy (xpath = "//*[@class='btn btn-md full-width btn-theme-light-2 rounded']")
    public WebElement userLogInButton;


    // Header Elements\\
    //Projects element
    @FindBy (xpath = "/html/body/div[2]/div[2]/div/nav/div[2]/ul[1]/li[3]/a")
    public WebElement projectsButton;


    //Projects Page\\

    //Result Text
    @FindBy(xpath = "//div[@class='left-column'] ")
    public WebElement resultText;

    //First Project
    @FindBy(xpath = "//p[@class='listing-short-description'][1]")
    public WebElement firstProject;

    //Second Project
    @FindBy(xpath = "(//p[@class='listing-short-description'])[2]")
    public WebElement secondProject;

    //Thirth Project
    @FindBy(xpath = "//p[@class='listing-short-description'][3]")
    public WebElement thirthProject;

    //Fourth Project
    @FindBy(xpath = "(//p[@class='listing-short-description'])[4]")
    public WebElement fourthProject;

    //Fifth Project
    @FindBy(xpath = "//p[@class='listing-short-description'][5]")
    public WebElement fifthProject;

    //Sixth Project
    @FindBy(xpath = "(//p[@class='listing-short-description'])[6]")
    public WebElement sixthProject;

    //Seventh Project
    @FindBy(xpath = "//p[@class='listing-short-description'][7]")
    public WebElement seventhProject;

    //Eighth Project
    @FindBy(xpath = "(//p[@class='listing-short-description'])[8]")
    public WebElement eighthProject;

    //Ninth Project
    @FindBy(xpath = "(//p[@class='listing-short-description'])[9]")
    public WebElement ninthhProject;

}





































































































        //SERPİL BİTİŞ