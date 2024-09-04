package Tests.Onur;

import Pages.AdminDashboard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US_32 {

    WebDriver driver;

    @Test
    public void tagsItemCreate() throws InterruptedException {
        //go to "https://qa.hauseheaven.com/admin"
        //Enter a valid email and password and click login
        //Expand "Blogs" section on the left menu
        //Verify the "Tags" tab is displayed
        //Click the "Tags" subsection.
        //Verify the "Tags" page is displayed properly.
        //Verify the create menu button is displayed at topright side
        //Verify that an edit menu button is displayed at the end of the line for per item in the list.
        //Verify that a delete menu button displayed at the end of the line for per item in the list.

        utilities.Driver.getDriver().get(utilities.ConfigReader.getProperty("AdminDashUrl"));
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.emailUsernameFormu.sendKeys(utilities.ConfigReader.getProperty("AdminGecerliEmail"));
        adminDashboard.passwordFormu.sendKeys(utilities.ConfigReader.getProperty("AdminGecerliPassword"));
        adminDashboard.signInButonu.click();
        Thread.sleep(100);
        adminDashboard.blogButonu.click();
        adminDashboard.tagsButonu.click();
         /*
             //tr[@role='row']
             bu sıraya temel stepler ve testler yazıldıktan sonra for loop ile itemlist isDisplayed testi yazılabilir.
         */
        adminDashboard.createButton.click();
        adminDashboard.saveAndExit.click();

        softAssert.assertTrue(adminDashboard.nameError.isDisplayed(), " 'The name field is required.' message didn't appear");

        adminDashboard.nameForm.sendKeys(utilities.ConfigReader.getProperty("ItemName"));
        adminDashboard.saveAndExit.click();

        softAssert.assertTrue(adminDashboard.tagsReturn.isDisplayed());
        softAssert.assertTrue(adminDashboard.successPopup.isDisplayed());

        softAssert.assertTrue(utilities.Driver.getDriver().findElement(By.xpath("//*/a[text()='autotest_onur']")).isDisplayed());

        softAssert.assertAll();


    }

    @Test
    public void tagsItemEdit() {
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.editButton.click();
        adminDashboard.nameForm.clear();
        adminDashboard.nameForm.sendKeys(utilities.ConfigReader.getProperty("ItemNameEdit"));
        adminDashboard.descriptionForm.sendKeys(utilities.ConfigReader.getProperty("DescriptionEdit"));
        adminDashboard.statusMenu.sendKeys(utilities.ConfigReader.getProperty("StatusEdit"));
        adminDashboard.saveAndExit.click();
        softAssert.assertTrue(adminDashboard.tagsReturn.isDisplayed());
        softAssert.assertTrue(adminDashboard.successPopup.isDisplayed());

        softAssert.assertTrue(utilities.Driver.getDriver().findElement(By.xpath("//*/a[text()='autotest_onur1']")).isDisplayed());
        softAssert.assertAll();

    }

    @Test
    public void tagsItemDelete() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.deleteButton.click();
        Thread.sleep(500);
        adminDashboard.deleteXButton.click();
        adminDashboard.deleteButton.click();
        Thread.sleep(500);
        adminDashboard.cancelButton.click();
        adminDashboard.deleteButton.click();
        Thread.sleep(500);
        adminDashboard.deleteConfirmButton.click();
        softAssert.assertTrue(adminDashboard.successPopup.isDisplayed());
        Thread.sleep(500);
        softAssert.assertNotEquals(utilities.Driver.getDriver().findElement(By.xpath("//*[@class=' text-start column-key-name']/a[1]")).getText(),"autotest_onur1");
        softAssert.assertAll();

    }
}