package Tests.Onur;

import Pages.AdminDashboard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;

public class US_33 {
    WebDriver driver;

    @Test(priority = 1)
    public void testimonialsItemCreate() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();


        //go to "https://qa.hauseheaven.com/admin"
        utilities.Driver.getDriver().get(utilities.ConfigReader.getProperty("AdminDashUrl"));

        //Enter a valid email and password and click login
        adminDashboard.emailUsernameForm.sendKeys(utilities.ConfigReader.getProperty("AdminGecerliEmail"));
        adminDashboard.passwordForm.sendKeys(utilities.ConfigReader.getProperty("AdminGecerliPassword"));
        adminDashboard.signInButton.click();
        Thread.sleep(100);

        //Click the "Testimonials" section.
        adminDashboard.testimonialsButton.click();

        //Click "create"
        adminDashboard.createButton.click();

        //click "save&exit" without filling/choosing anything to see reaction for mandatory lines of the page.
        adminDashboard.saveAndExit.click();
        softAssert.assertTrue(adminDashboard.nameError.isDisplayed(), " 'The name field is required.' message didn't appear");

        //Fill the mandatory lines and click "save & exit"
        adminDashboard.nameForm.sendKeys(utilities.ConfigReader.getProperty("ItemName"));
        adminDashboard.contentForm.sendKeys(ConfigReader.getProperty("Content"));
        adminDashboard.saveAndExit.click();

        //Verify the browser redirected back to Testimonials page.
        softAssert.assertTrue(adminDashboard.testimonialsConfirm.isDisplayed());

        //Verify the success message at the bottom-right corner of the page
        softAssert.assertTrue(adminDashboard.successPopup.isDisplayed());

        //Verify that the new item is displayed on the item list.
        softAssert.assertTrue(utilities.Driver.getDriver().findElement(By.xpath("//*/a[text()='autotest_onur']")).isDisplayed());

        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void testimonialsItemEdit() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();


        //Click "edit" button of the item in the list
        adminDashboard.editButton.click();

        //change the name, content and status and click "save&exit"
        adminDashboard.nameForm.clear();
        adminDashboard.nameForm.sendKeys(ConfigReader.getProperty("ItemNameEdit"));
        Thread.sleep(1500);
        adminDashboard.contentForm.click();
        adminDashboard.contentForm.clear();
        Thread.sleep(500);
        adminDashboard.contentForm.sendKeys(ConfigReader.getProperty("ContentEdit"));
        adminDashboard.draftStatus.click();
        adminDashboard.saveAndExit.click();

        //Verify the browser redirected back to testimonials page.
        softAssert.assertTrue(adminDashboard.testimonialsConfirm.isDisplayed());

        //Verify the success message at the bottom-right corner of the page
        softAssert.assertTrue(adminDashboard.successPopup.isDisplayed());

        //Verify that the item with its amended infos are displayed on the item list.
        softAssert.assertTrue(utilities.Driver.getDriver().findElement(By.xpath("//*/a[text()='autotest_onur1']")).isDisplayed());

        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void testimonialsItemDelete() throws InterruptedException {
    SoftAssert softAssert = new SoftAssert();
    AdminDashboard adminDashboard = new AdminDashboard();


        //click to the "delete" button of the item on the list.
        adminDashboard.deleteButton.click();
        Thread.sleep(500);

        //"In the popup window;
        //Verify that there are 3 buttons as ""Cancel"", ""Delete"" at the bottom and ""X"" at the top"
        //Click to the "X"
        //Click to the "Delete" again.
        adminDashboard.deleteXButton.click();
        adminDashboard.deleteButton.click();
        Thread.sleep(500);

        //Click to the "Cancel"
        //Click to the "Delete" again.
        adminDashboard.cancelButton.click();
        adminDashboard.deleteButton.click();
        Thread.sleep(500);

        //click to the "Delete" button on the popup
        adminDashboard.deleteConfirmButton.click();

        //Verify that the success message is displayed.
        softAssert.assertTrue(adminDashboard.successPopup.isDisplayed());
        Thread.sleep(1000);

        //Verify that the relevant item doesn't appear anymore on the list
        softAssert.assertNotEquals(utilities.Driver.getDriver().findElement(By.xpath("//*[@class=' text-start column-key-name']/a[1]")).getText(),"autotest_onur1");
        softAssert.assertAll();
    }
}
