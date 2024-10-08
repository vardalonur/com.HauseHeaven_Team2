package Tests.Serpil;

import Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static utilities.Driver.driver;

public class US_23 {


    @Test (priority = 1)
    public void projects () throws InterruptedException {


        //Go to https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));
        SoftAssert softAssert = new SoftAssert();
        UserDashboard userDashboard = new UserDashboard();
        Projects projects=new Projects();
        WebsiteMain websiteMain= new WebsiteMain();

        //Log in as registered user by entering user email and password
        userDashboard.homePageSignInButton.click();
        userDashboard.userEmailUsernameForm.sendKeys(ConfigReader.getProperty("UserValidEmail"));
        userDashboard.userPasswordForm.sendKeys(ConfigReader.getProperty("UserValidPassword"));
        userDashboard.userLogInButton.click();
        Thread.sleep(2000);

        //Click on the 'Projects' link.
        softAssert.assertTrue(websiteMain.projectsButton.isDisplayed(), "Project button is not displayed.");
        websiteMain.projectsButton.click();

        //Confirm that the projects are listed on the page as expected
        List<WebElement> project = driver.findElements(By.xpath("//h4[@class='mb-0']"));
        Assert.assertTrue(project.size() > 0, "Projeler listelenmedi!");

        softAssert.assertTrue(projects.firstProject.isDisplayed(),"First project is not displayed");

        System.out.println("Projeler başarıyla listelendi.");

        Driver.quitDriver();


    }

    @Test (priority = 2)
    public void projectDetail() throws InterruptedException {


        //Go to https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));
        SoftAssert softAssert = new SoftAssert();
        UserDashboard userDashboard = new UserDashboard();
        Projects projects=new Projects();
        WebsiteMain websiteMain=new WebsiteMain();

        //Log in as registered user by entering user email and password
        userDashboard.homePageSignInButton.click();
        userDashboard.userEmailUsernameForm.sendKeys(ConfigReader.getProperty("UserValidEmail"));
        userDashboard.userPasswordForm.sendKeys(ConfigReader.getProperty("UserValidPassword"));
        userDashboard.userLogInButton.click();

        Thread.sleep(2000);

        //Click on the 'Projects' link.
        softAssert.assertTrue(websiteMain.projectsButton.isDisplayed(), "Project button is not displayed.");
        websiteMain.projectsButton.click();

        //Confirm that the projects are listed on the page as expected
       List<WebElement> project = driver.findElements(By.xpath("//h4[@class='mb-0']"));
       softAssert.assertTrue(project.size() > 0, "Projeler listelenmedi");


        softAssert.assertTrue(projects.firstProject.isDisplayed(),"First project is not displayed");
        System.out.println("İlk proje başarıyla listelendi.");

        //Click on individual project listings to view the details of each project.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500);");
        Thread.sleep(2000);
        projects.firstProject.click();

        //Verify that each project's details are displayed correctly, including information such as
        //project name, description, date etc.
        softAssert.assertTrue(projects.firstProjectDetails.isDisplayed(),"First project detail page is not displayed");
        System.out.println("İlk proje detay sayfası başarıyla görüntülendi.");
        driver.navigate().back();
        //Second project

        softAssert.assertTrue(projects.secondProject.isDisplayed(),"Second project is not displayed");
        System.out.println("İkinci proje başarıyla listelendi.");


        Thread.sleep(1000);
        projects.secondProject.click();

        softAssert.assertTrue(projects.secondProjectDetails.isDisplayed(),"Second project detail page is not displayed");
        System.out.println("İkinci proje detay sayfası başarıyla görüntülendi.");

       // driver.navigate().back();
        Driver.quitDriver();



    }

}
