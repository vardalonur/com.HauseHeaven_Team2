package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class WebsiteMain {

































































































    public WebsiteMain(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    ////////////////////////==================\\\\\\\\\\\\\\\\\\\\\\\\

                //Header Bölümü Ortak Elementler\\

    ////////////////////////==================\\\\\\\\\\\\\\\\\\\\\\\\

    @FindBy(xpath = "//*[@id=\"navigation\"]/div[2]/ul[1]/li[4]/a")
    public WebElement agentsButonu;


}

























































































    // CAN YILMAZ'A AYRILMISTIR 101'den baslayiniz.
}
>>>>>>> main
