package Tests.Can;

import Pages.Projects;
import Pages.UserDashboard;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;


import java.security.Key;
import java.util.List;

import static utilities.Driver.driver;

public class US_08 {

    @Test
    public void TC01(){
        //Launch browser
        //Go to https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));
        //Click on "Project"
        UserDashboard userDashboard = new UserDashboard();
        userDashboard.projectsButton.click();

        //Validate Current Title
        String expectedTitle = "Projects";
        String actualTitle = Driver.getDriver().getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle, expectedTitle);
        //Validate Number of Found Result

        Projects projects = new Projects();
        String expectedNumberOfFoundResult = "Found 1 - 9 Of 9 Results";
        String actualNumberOfFoundResult = projects.resultText.getText();

        softAssert.assertEquals(actualNumberOfFoundResult, expectedNumberOfFoundResult);

        //Get Total Number of Result
        String totalNumber = actualNumberOfFoundResult.substring(10,11);
        System.out.println("Total Number of Projects: " + totalNumber);

        Driver.quitDriver();
    }


    @Test
    public void TC02(){
        Actions actions = new Actions(Driver.getDriver());
        //Launch browser
        //Go to https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));
        //Click on "Projects"
        UserDashboard userDashboard = new UserDashboard();
        userDashboard.projectsButton.click();
        //Validate Current Title
        String expectedTitle = "Projects";
        String actualTitle = Driver.getDriver().getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle, expectedTitle);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        //Click on the first project of the page
        Projects projects = new Projects();
        utilities.ReusableMethods.bekle(2);
        projects.firstProject.click();
        //Validate Current Title
        String expectedTitleOfAProject = "Palm Paradise Residences";
        String actualTitleOfAProject = driver.findElement(By.xpath("//h1")).getText();

        SoftAssert softAssert1 = new SoftAssert();
        softAssert1.assertEquals(actualTitleOfAProject, expectedTitleOfAProject);

        Projects projects1 = new Projects();
        //Validate current type of project with type in the project page
        utilities.ReusableMethods.bekle(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        utilities.ReusableMethods.bekle(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        String expectedTypeOfProject = projects1.typeOfProjectinProjectPage.getText();

        String actualTypeOfProject = projects1.typeOfProjectinDetails.getText();

        softAssert1.assertEquals(actualTypeOfProject, expectedTypeOfProject);

        Driver.quitDriver();
    }


    @Test
    public void TC03(){
        //Launch browser
        //Go to https://qa.hauseheaven.com/
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));
        //Click on "Projects"
        UserDashboard userDashboard = new UserDashboard();
        userDashboard.projectsButton.click();
        //Validate Current Title
        String expectedTitle = "Projects";
        String actualTitle = Driver.getDriver().getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle, expectedTitle);
        //Choose determined search boxes then click on "Search"

        Projects projects = new Projects();
        projects.country.click();
        projects.countryInput.sendKeys("USA" + Keys.ENTER);

        projects.category.click();
        projects.categoryInput.sendKeys("Villa" + Keys.ENTER);

        projects.searchButton.click();

        //Validate the Result
        //Getting all Projects in the page
        for (int number = 1; number <= 9; number++) {
            // XPath ile number değişkenine göre elementleri buluyoruz
            List<WebElement> elements = driver.findElements(By.xpath("(//a[@class='prt-link-detail text-uppercase'])[" + (number) + "]"));

            // Eğer elements boş değilse, her bir eleman için kontrol yap
            if (!elements.isEmpty()) {
                for (WebElement element : elements) {
                    // Elementin metnini al
                    String elementText = element.getText();

                    // Eğer elementin metni "villa" içeriyorsa
                    if (elementText.toLowerCase().contains("villa")) {
                        System.out.println("Bulunan element: " + elementText);

                    }
                }
            } else {
                System.out.println("No element found for index: " + (number + 1));
            }
        }

        Driver.quitDriver();
    }
}