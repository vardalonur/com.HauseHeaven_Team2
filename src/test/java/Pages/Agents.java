package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Agents {

    public Agents(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@class='fr-can-name'])[1]")
    public WebElement ilkAgentIsimElementi;

    @FindBy(xpath = "(//*[text()='Phone:'])[1]")
    public WebElement ilkAgentTelefonNo;

    @FindBy(xpath = "(//*[text()='Email:'])[1]")
    public  WebElement ilkAgentEmail;

    @FindBy(xpath = "(//*[@class='fr-position'])[1]")
    public WebElement ilkAgentIlanSayisi;


}
