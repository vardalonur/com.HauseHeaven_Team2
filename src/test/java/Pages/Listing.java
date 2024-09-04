package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Listing {

    public Listing() {
        PageFactory.initElements(utilities.Driver.getDriver(), this);
    }

    //Number of Result
    @FindBy (xpath = "//h4[@class='m-0']")
    public WebElement numberOfResult;

}
