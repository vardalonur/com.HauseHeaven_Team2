package Pages;

import org.openqa.selenium.support.PageFactory;

public class UserDashboard {

    public UserDashboard(){
        PageFactory.initElements(utilities.Driver.getDriver(), this);
    }

}
