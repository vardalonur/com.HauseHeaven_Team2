package Tests.Onur;

import Pages.AdminDashboard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_32 extends TestBaseRapor {

    WebDriver driver;

    @Test(priority = 1)
    public void tagsItemCreate() throws InterruptedException {
/*/*
        extentTest = extentReports.createTest("arama testi",
                                    "Kullanici belirlenen kelimeyi aratip sonuc bulabilmelidir");

        // Testotomasyonu anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        extentTest.info("Kullanici Testotomasyonu anasayfaya gider");

        // url'in "testotomasyonu" icerdigini test edin
        String expectedUrlIcerik = "testotomasyonu";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));
        extentTest.pass("url'in 'testotomasyonu' icerdigini test eder");
 */
        extentTest = extentReports.createTest("tagsItemCreate",
                "Creating an item on Tags subsection");
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();

        //go to "https://qa.hauseheaven.com/admin"
        utilities.Driver.getDriver().get(utilities.ConfigReader.getProperty("AdminDashUrl"));
        extentTest.info("go to \"https://qa.hauseheaven.com/admin\"");

        //Enter a valid email and password and click login
        adminDashboard.emailUsernameForm.sendKeys(utilities.ConfigReader.getProperty("AdminGecerliEmail"));
        adminDashboard.passwordForm.sendKeys(utilities.ConfigReader.getProperty("AdminGecerliPassword"));
        adminDashboard.signInButton.click();
        Thread.sleep(100);
        extentTest.info("Enter a valid email and password and click login");

        //Expand "Blog" section on the left menu
        adminDashboard.blogButton.click();
        extentTest.info("Expand \"Blog\" section on the left menu");

        //Click the "Tags" subsection.
        adminDashboard.tagsButton.click();
        extentTest.info("Click the \"Tags\" subsection.");

        //Click "create"
        adminDashboard.createButton.click();
        extentTest.info("Click \"create\"");
        //click "save&exit" without filling/choosing anything to see reaction for mandatory lines of the page.
        adminDashboard.saveAndExit.click();
        softAssert.assertTrue(adminDashboard.nameError.isDisplayed(), " 'The name field is required.' message didn't appear");
        extentTest.pass("click \"save&exit\" without filling/choosing anything to see reaction for mandatory lines of the page.");

        //Fill the mandatory lines and click "save & exit"
        adminDashboard.nameForm.sendKeys(utilities.ConfigReader.getProperty("ItemName"));
        adminDashboard.saveAndExit.click();
        extentTest.info("Fill the mandatory lines and click \"save & exit\"");

        //Verify the browser redirected back to the tags page.
        softAssert.assertTrue(adminDashboard.tagsConfirm.isDisplayed());
        extentTest.pass("Verify the browser redirected back to the tags page.");

        //Verify the success message at the bottom-right corner of the page
        softAssert.assertTrue(adminDashboard.successPopup.isDisplayed());
        extentTest.pass("Verify the success message at the bottom-right corner of the page");

        //Verify that the new item is displayed on the item list.
        softAssert.assertTrue(utilities.Driver.getDriver().findElement(By.xpath("//*/a[text()='autotest_onur']")).isDisplayed());
        extentTest.pass("Verify that the new item is displayed on the item list.");

        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void tagsItemEdit() throws InterruptedException {
        extentTest = extentReports.createTest("tagsItemEdit",
                "Editing an item on Tags Subsection");

        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();

        //go to "https://qa.hauseheaven.com/admin"
        utilities.Driver.getDriver().get(utilities.ConfigReader.getProperty("AdminDashUrl"));
        extentTest.info("go to \"https://qa.hauseheaven.com/admin\"");

        //Enter a valid email and password and click login
        adminDashboard.emailUsernameForm.sendKeys(utilities.ConfigReader.getProperty("AdminGecerliEmail"));
        adminDashboard.passwordForm.sendKeys(utilities.ConfigReader.getProperty("AdminGecerliPassword"));
        adminDashboard.signInButton.click();
        Thread.sleep(100);
        extentTest.info("Enter a valid email and password and click login");

        //Expand "Blog" section on the left menu
        adminDashboard.blogButton.click();
        extentTest.info("Expand \"Blog\" section on the left menu");

        //Click the "Tags" subsection.
        adminDashboard.tagsButton.click();
        extentTest.info("Click the \"Tags\" subsection.");


        //Click "edit" button of the item in the list
        adminDashboard.editButton.click();
        extentTest.info("Click \"edit\" button of the item in the list");
        //change the name, description and status and click "save&exit"
        adminDashboard.nameForm.clear();
        adminDashboard.nameForm.sendKeys(utilities.ConfigReader.getProperty("ItemNameEdit"));
        adminDashboard.descriptionForm.sendKeys(utilities.ConfigReader.getProperty("DescriptionEdit"));
        adminDashboard.statusMenu.sendKeys(utilities.ConfigReader.getProperty("StatusDraft"));
        adminDashboard.saveAndExit.click();
        extentTest.info("change the name, description and status and click \"save&exit\"");

        //Verify the browser redirected back to the tags page.
        softAssert.assertTrue(adminDashboard.tagsConfirm.isDisplayed());
        extentTest.pass("Verify the browser redirected back to the tags page.");

        //Verify the success message at the bottom-right corner of the page
        softAssert.assertTrue(adminDashboard.successPopup.isDisplayed());
        extentTest.pass("Verify the success message at the bottom-right corner of the page");

        //Verify that the item with its amended infos are displayed on the item list.
        softAssert.assertTrue(utilities.Driver.getDriver().findElement(By.xpath("//*/a[text()='autotest_onur1']")).isDisplayed());
        extentTest.pass("Verify that the item with its amended infos are displayed on the item list.");

        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void tagsItemDelete() throws InterruptedException {
        extentTest = extentReports.createTest("tagsItemDelete",
                "Deleting an item on Tags Subsection");
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();

        //go to "https://qa.hauseheaven.com/admin"
        utilities.Driver.getDriver().get(utilities.ConfigReader.getProperty("AdminDashUrl"));
        extentTest.info("go to \"https://qa.hauseheaven.com/admin\"");

        //Enter a valid email and password and click login
        adminDashboard.emailUsernameForm.sendKeys(utilities.ConfigReader.getProperty("AdminGecerliEmail"));
        adminDashboard.passwordForm.sendKeys(utilities.ConfigReader.getProperty("AdminGecerliPassword"));
        adminDashboard.signInButton.click();
        Thread.sleep(100);
        extentTest.info("Enter a valid email and password and click login");

        //Expand "Blog" section on the left menu
        adminDashboard.blogButton.click();
        extentTest.info("Expand \"Blog\" section on the left menu");

        //Click the "Tags" subsection.
        adminDashboard.tagsButton.click();
        extentTest.info("Click the \"Tags\" subsection.");

        //click to the "delete" button of the item on the list.
        adminDashboard.deleteButton.click();
        Thread.sleep(500);

        extentTest.info("click to the \"delete\" button of the item on the list.");
        //"In the popup window;
        //Verify that there are 3 buttons as ""Cancel"", ""Delete"" at the bottom and ""X"" at the top"

        softAssert.assertTrue(adminDashboard.cancelButton.isDisplayed());
        extentTest.pass("Verify the cancel button is displayed on the popup");


        softAssert.assertTrue(adminDashboard.deleteConfirmButton.isDisplayed());
        extentTest.pass("Verify the delete button is displayed on the popup");


        softAssert.assertTrue(adminDashboard.deleteXButton.isDisplayed());
        extentTest.pass("Verify the X button is displayed on the popup");


        //Click to the "X"
        //Click to the "Delete" again.
        adminDashboard.deleteXButton.click();
        extentTest.info("Click to the \"X\"");

        adminDashboard.deleteButton.click();
        extentTest.info("Click to the \"Delete\" again.");

        //Click to the "Cancel"
        //Click to the "Delete" again.
        Thread.sleep(500);
        adminDashboard.cancelButton.click();
        extentTest.info("Click to the \"Cancel\"");

        adminDashboard.deleteButton.click();
        extentTest.info("Click to the \"Delete\" again.");

        Thread.sleep(500);

        //click to the "Delete" button on the popup
        adminDashboard.deleteConfirmButton.click();
        extentTest.info("click to the \"Delete\" button on the popup");

        //Verify that the success message is displayed.
        softAssert.assertTrue(adminDashboard.successPopup.isDisplayed());
        Thread.sleep(500);
        extentTest.pass("Verify that the success message is displayed.");

        //Verify that the relevant item doesn't appear anymore on the list
        softAssert.assertNotEquals(utilities.Driver.getDriver().findElement(By.xpath("//*[@class=' text-start column-key-name']/a[1]")).getText(),"autotest_onur1");
        extentTest.pass("Verify that the relevant item doesn't appear anymore on the list");

        softAssert.assertAll();
    }
}