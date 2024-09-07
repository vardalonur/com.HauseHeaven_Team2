package Tests.Serpil;

import Pages.AdminDashboard;
import Pages.UserDashboard;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class US_23 {


    @Test
    public void projects (){

      /*Launch browser
    Go to https://qa.hauseheaven.com/
    Log in as registered user by entering user email and password
    Click on the 'Projects' link.
    Confirm that the projects are listed on the page as expected.
   */

        //Go to https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));
        SoftAssert softAssert = new SoftAssert();
        UserDashboard userDashboard = new UserDashboard();







    }

    @Test
    public void projectDetail(){

          /* Launch browser
Go to https://qa.hauseheaven.com/
Log in as registered user by entering user email and password
Click on the 'Projects' link.
Confirm that the projects are listed on the page as expected.
On the 'Projects' page, check the displayed number of projects.
Click on individual project listings to view the details of each project.
Verify that each project's details are displayed correctly, including information such as
project name, description, date etc.
     */








    }

}
