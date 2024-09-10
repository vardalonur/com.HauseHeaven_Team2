package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Listing {

    public Listing() {
        PageFactory.initElements(utilities.Driver.getDriver(), this);
    }
    // CAN YILMAZ'a ait
    //Number of Result
    @FindBy (className = "m-0")
    public static WebElement numberOfResult;

    @FindBy (xpath = "//a[@class='prt-view']")
    public List<WebElement> viewButton;

    @FindBy (xpath = "//a[@class='prt-link-detail']")
    public List<WebElement> titleOfAProperty;

    @FindBy (xpath = "(//h3)[1]")
    public WebElement titleAfterClickingOnView;

    @FindBy (xpath = "//h6[@class='listing-card-info-price']")
    public List<WebElement> preiseOfAProperty;

    @FindBy (className = "prt-price-fix" )
    public WebElement preiseAfterClickingOnView;

    @FindBy (id= "select2-select-type-container")
    public WebElement typeDropDown;

    @FindBy (xpath = "//input[@class='select2-search__field']")
    public WebElement dropDownYazmaYeri;

    @FindBy (xpath = "//span[@id='select2-minprice-container']")
    public WebElement searchBoxMinPriceDropDownMenu;

    @FindBy (xpath = "//span[@id='select2-maxprice-container']")
    public WebElement searchBoxMaxPriceDropDownMenu;

    @FindBy (xpath = "/html/body/div[2]/div[4]/section/div/div[2]/div[1]/div/div[2]/div/form/div[9]/div[2]/ul/li[1]/label")
    public WebElement wifi;

    @FindBy (xpath = "/html/body/div[2]/div[4]/section/div/div[2]/div[1]/div/div[2]/div/form/div[9]/div[2]/ul/li[3]/label")
    public WebElement swimmingpool;

    @FindBy (xpath = "/html/body/div[2]/div[4]/section/div/div[2]/div[1]/div/div[2]/div/form/button")
    public WebElement findNewHomeButton;

    @FindBy (className = "m-0")
    public  WebElement numberOfResultHome;

   @FindBy (xpath = "//*[@id='app']/section/div[2]/div[1]/div[2]/div[1]/ul/li[1]/a")
   public WebElement shareButton;























































































    //CAN YILMAZ'a ait buraya kadar
//SERPİL ................\\

//Projects Page\\


































































































    // Arzuv is writing here


}