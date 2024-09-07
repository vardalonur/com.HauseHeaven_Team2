package Tests.Onur;

import Pages.AdminDashboard;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;

public class US_35 {
    @Test(priority = 1)
    public void PropertiesItemCreate() throws InterruptedException {


        utilities.Driver.getDriver().get(utilities.ConfigReader.getProperty("AdminDashUrl"));
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.emailUsernameForm.sendKeys(utilities.ConfigReader.getProperty("AdminGecerliEmail"));
        adminDashboard.passwordForm.sendKeys(utilities.ConfigReader.getProperty("AdminGecerliPassword"));
        adminDashboard.signInButton.click();
        Thread.sleep(100);
        adminDashboard.realEstateButton.click();
        adminDashboard.propertiesButton.click();
         /*
             //tr[@role='row']
             bu sıraya temel stepler ve testler yazıldıktan sonra for loop ile itemlist isDisplayed testi yazılabilir.
         */
        adminDashboard.createButton.click();
        adminDashboard.saveAndExit.click();

        softAssert.assertTrue(adminDashboard.nameError.isDisplayed(), " 'The name field is required.' message didn't appear");

        adminDashboard.titleForm.sendKeys(utilities.ConfigReader.getProperty("ItemName"));
        adminDashboard.contentForm.sendKeys(ConfigReader.getProperty("Content"));
        adminDashboard.propertyLocationForm.sendKeys(ConfigReader.getProperty("PropertiesLocation"));
        adminDashboard.saveAndExit.click();


        softAssert.assertTrue(adminDashboard.propertiesConfirm.isDisplayed());
        softAssert.assertTrue(adminDashboard.successPopup.isDisplayed());

        softAssert.assertTrue(utilities.Driver.getDriver().findElement(By.xpath("//*/a[text()='autotest_onur']")).isDisplayed());

        softAssert.assertAll();


    }

    @Test(priority = 2)
    public void propertiesItemEdit() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.editButton.click();
        adminDashboard.titleForm.clear();
        adminDashboard.titleForm.sendKeys(utilities.ConfigReader.getProperty("ItemNameEdit"));
        adminDashboard.contentForm.clear();
        adminDashboard.contentForm.sendKeys(utilities.ConfigReader.getProperty("ContentEdit"));

        adminDashboard.propertyLocationForm.clear();
        adminDashboard.propertyLocationForm.sendKeys(ConfigReader.getProperty("PropertiesLocationEdit"));
        adminDashboard.moderationStatusMenu.click();
        adminDashboard.rejectedStatus.click();
        adminDashboard.moderationStatusMenu.click();
        adminDashboard.approvedStatus.click();

        adminDashboard.saveAndExit.click();

        softAssert.assertTrue(adminDashboard.propertiesConfirm.isDisplayed());
        softAssert.assertTrue(adminDashboard.successPopup.isDisplayed());

        softAssert.assertTrue(utilities.Driver.getDriver().findElement(By.xpath("//*/a[text()='autotest_onur1']")).isDisplayed());
        softAssert.assertAll();

    }

    @Test(priority = 3)
    public void propertiesItemDelete() throws InterruptedException {
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
