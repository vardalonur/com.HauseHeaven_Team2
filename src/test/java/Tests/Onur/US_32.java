package Tests.Onur;

import Pages.AdminDashboard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US_32 {

    WebDriver driver;

    @Test(priority = 1)
    public void tagsItemCreate() throws InterruptedException {


        //go to "https://qa.hauseheaven.com/admin"
        utilities.Driver.getDriver().get(utilities.ConfigReader.getProperty("AdminDashUrl"));
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();

        //Enter a valid email and password and click login
        adminDashboard.emailUsernameForm.sendKeys(utilities.ConfigReader.getProperty("AdminGecerliEmail"));
        adminDashboard.passwordForm.sendKeys(utilities.ConfigReader.getProperty("AdminGecerliPassword"));
        adminDashboard.signInButton.click();
        Thread.sleep(100);

        //Expand "Blog" section on the left menu
        adminDashboard.blogButton.click();

        //Click the "Tags" subsection.
        adminDashboard.tagsButton.click();

        //Click "create"
        adminDashboard.createButton.click();
        //click "save&exit" without filling/choosing anything to see reaction for mandatory lines of the page.
        adminDashboard.saveAndExit.click();

        softAssert.assertTrue(adminDashboard.nameError.isDisplayed(), " 'The name field is required.' message didn't appear");

        //Fill the mandatory lines and click "save & exit"
        adminDashboard.nameForm.sendKeys(utilities.ConfigReader.getProperty("ItemName"));
        adminDashboard.saveAndExit.click();

        //Verify the browser redirected back to the tags page.
        softAssert.assertTrue(adminDashboard.tagsConfirm.isDisplayed());

        //Verify the success message at the bottom-right corner of the page
        softAssert.assertTrue(adminDashboard.successPopup.isDisplayed());

        //Verify that the new item is displayed on the item list.
        softAssert.assertTrue(utilities.Driver.getDriver().findElement(By.xpath("//*/a[text()='autotest_onur']")).isDisplayed());

        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void tagsItemEdit() {
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();


        //Click "edit" button of the item in the list
        adminDashboard.editButton.click();

        //change the name, description and status and click "save&exit"
        adminDashboard.nameForm.clear();
        adminDashboard.nameForm.sendKeys(utilities.ConfigReader.getProperty("ItemNameEdit"));
        adminDashboard.descriptionForm.sendKeys(utilities.ConfigReader.getProperty("DescriptionEdit"));
        adminDashboard.statusMenu.sendKeys(utilities.ConfigReader.getProperty("StatusDraft"));
        adminDashboard.saveAndExit.click();

        //Verify the browser redirected back to the tags page.
        softAssert.assertTrue(adminDashboard.tagsConfirm.isDisplayed());

        //Verify the success message at the bottom-right corner of the page
        softAssert.assertTrue(adminDashboard.successPopup.isDisplayed());

        //Verify that the item with its amended infos are displayed on the item list.
        softAssert.assertTrue(utilities.Driver.getDriver().findElement(By.xpath("//*/a[text()='autotest_onur1']")).isDisplayed());
        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void tagsItemDelete() throws InterruptedException {
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

        //Click to the "Cancel"
        //Click to the "Delete" again.
        Thread.sleep(500);
        adminDashboard.cancelButton.click();
        adminDashboard.deleteButton.click();
        Thread.sleep(500);

        //click to the "Delete" button on the popup
        adminDashboard.deleteConfirmButton.click();

        //Verify that the success message is displayed.
        softAssert.assertTrue(adminDashboard.successPopup.isDisplayed());
        Thread.sleep(500);

        //Verify that the relevant item doesn't appear anymore on the list
        softAssert.assertNotEquals(utilities.Driver.getDriver().findElement(By.xpath("//*[@class=' text-start column-key-name']/a[1]")).getText(),"autotest_onur1");
        softAssert.assertAll();
    }
}