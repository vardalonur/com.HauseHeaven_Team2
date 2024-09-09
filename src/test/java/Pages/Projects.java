package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Projects {

    public Projects() {
        PageFactory.initElements(utilities.Driver.getDriver(), this);}

// SERPİL.........\\

    //Result Text
    @FindBy(xpath = "//div[@class='left-column'] ")
    public WebElement resultText;

    //First Project
    @FindBy(xpath = "(//a[@class='prt-link-detail text-uppercase'])[1]")
    public WebElement firstProject;

    //Second Project
    @FindBy(xpath = "(//a[@class='prt-link-detail text-uppercase'])[2]")
    public WebElement secondProject;

    //Thirth Project
    @FindBy(xpath = "(//a[@class='prt-link-detail text-uppercase'])[3]")
    public WebElement thirthProject;

    //Fourth Project
    @FindBy(xpath = "(//a[@class='prt-link-detail text-uppercase'])[4]")
    public WebElement fourthProject;

    //Fifth Project
    @FindBy(xpath = "(//a[@class='prt-link-detail text-uppercase'])[5]")
    public WebElement fifthProject;

    //Sixth Project
    @FindBy(xpath = "(//a[@class='prt-link-detail text-uppercase'])[6]")
    public WebElement sixthProject;

    //Seventh Project
    @FindBy(xpath = "(//a[@class='prt-link-detail text-uppercase'])[7]")
    public WebElement seventhProject;

    //Eighth Project
    @FindBy(xpath = "(//a[@class='prt-link-detail text-uppercase'])[8]")
    public WebElement eighthProject;

    //Ninth Project
    @FindBy(xpath = "((//a[@class='prt-link-detail text-uppercase'])[9]")
    public WebElement ninthProject;


    //Project Detail Page\\

    //First Project
    @FindBy(xpath = "(//h4[@class='property_block_title'])[1]")
    public WebElement firstProjectDetails;

    //Second Project
    @FindBy(xpath = "(//h4[@class='property_block_title'])[2]")
    public WebElement secondProjectDetails;

    //Fifth Project
    @FindBy(xpath = "(//h4[@class='property_block_title'])[5]")
    public WebElement fifthProjectDetails;




}
