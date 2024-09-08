package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDashboard {

    public UserDashboard(){
        PageFactory.initElements(utilities.Driver.getDriver(), this);
    }



        //SERPİL BAŞLANGIÇ



































































































        //SERPİL BİTİŞ

        // KEVSER BAŞLANGIÇ

    ////// SETTINGS //////

    @FindBy(xpath = "//*[@title='Settings']")
    public WebElement settingsButton;

    @FindBy(id = "phone")
    public WebElement phoneBox;

    @FindBy(xpath = "(//*[@type='submit'])[1]")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@id=\"filter_search\"]/div[2]/div/div[1]/span")
    public WebElement phoneNumberText;

    ////// BUY CREDITS AREA //////

    @FindBy(xpath = "//*[@title='credits']")
    public WebElement buyCreditsButton;

    @FindBy(xpath = "(//*[text()='Purchase'])[1]")
    public WebElement freeFirstPostButton;

    @FindBy(xpath = "//*[@id=\"app-real-estate\"]/div/div/div/div[1]/div/div[2]/div[1]/p/strong")
    public WebElement creditsNumber;

    ////// WRITE A PROPERTY AREA //////

    @FindBy(xpath = "//*[@title='Write a property']")
    public WebElement writePropertyButton;

    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement titleTextBox;

    @FindBy(xpath = "//*[@class='ck-placeholder']")
    public WebElement contentTextBox;

    @FindBy(xpath = "(//*[@type='submit'])[1]")
    public WebElement saveExitButton;

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-account-property-table_info\"]/span/span[2]")
    public WebElement totalAdvertNumberText;






















































    // KEVSER BİTİŞ












}