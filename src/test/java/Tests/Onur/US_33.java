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
        utilities.Driver.getDriver().get(utilities.ConfigReader.getProperty("AdminDashUrl"));
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.emailUsernameForm.sendKeys(utilities.ConfigReader.getProperty("AdminGecerliEmail"));
        adminDashboard.passwordForm.sendKeys(utilities.ConfigReader.getProperty("AdminGecerliPassword"));
        adminDashboard.signInButton.click();
        Thread.sleep(100);
        adminDashboard.testimonialsButton.click();
        adminDashboard.createButton.click();
        adminDashboard.saveAndExit.click();

        softAssert.assertTrue(adminDashboard.nameError.isDisplayed(), " 'The name field is required.' message didn't appear");

        adminDashboard.nameForm.sendKeys(utilities.ConfigReader.getProperty("ItemName"));
        adminDashboard.contentForm.sendKeys(ConfigReader.getProperty("Content"));
        adminDashboard.saveAndExit.click();

        softAssert.assertTrue(adminDashboard.testimonialsConfirm.isDisplayed());
        softAssert.assertTrue(adminDashboard.successPopup.isDisplayed());

        softAssert.assertTrue(utilities.Driver.getDriver().findElement(By.xpath("//*/a[text()='autotest_onur']")).isDisplayed());

        softAssert.assertAll();

    }
    @Test(priority = 2)
    public void testimonialsItemEdit() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        Thread.sleep(500);
        adminDashboard.editButton.click();
        adminDashboard.nameForm.clear();
        adminDashboard.nameForm.sendKeys(ConfigReader.getProperty("ItemNameEdit"));
        Thread.sleep(1500);
        adminDashboard.contentForm.click();
        adminDashboard.contentForm.clear();
        Thread.sleep(500);
        adminDashboard.contentForm.sendKeys(ConfigReader.getProperty("ContentEdit"));
        adminDashboard.draftStatus.click();
        adminDashboard.saveAndExit.click();
        softAssert.assertTrue(adminDashboard.testimonialsConfirm.isDisplayed());
        softAssert.assertTrue(adminDashboard.successPopup.isDisplayed());

        softAssert.assertTrue(utilities.Driver.getDriver().findElement(By.xpath("//*/a[text()='autotest_onur1']")).isDisplayed());

        softAssert.assertAll();
    }
    @Test(priority = 3)
    public void testimonialsItemDelete() throws InterruptedException {
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
        Thread.sleep(1000);
        softAssert.assertNotEquals(utilities.Driver.getDriver().findElement(By.xpath("//*[@class=' text-start column-key-name']/a[1]")).getText(),"autotest_onur1");
        softAssert.assertAll();


    }
}
