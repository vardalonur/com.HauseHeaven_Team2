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

    @FindBy (xpath = "//span[@class='select2-selection__placeholder']")
    public List<WebElement> searchBoxDropDownMenu;
    //3. index min 4 max
    @FindBy (xpath = "//label=[@clas='checkbox-custom-label']")
    public List<WebElement> checkBoxes;
    //0. index wifi 2.index swimming pool
    @FindBy (xpath = "//*[@id=\"app\"]/section/div[2]/div[1]/div[2]/div[1]/ul/li[1]/a")
    public WebElement shareButton;



















































































    //CAN YILMAZ'a ait buraya kadar

}