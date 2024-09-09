package Tests.Kevser;

import Pages.Agents;
import Pages.WebsiteMain;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_09 {

    @Test
    public void TC01(){

        //Browser aç ve https://qa.hauseheaven.com/  adersine git
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));

        //Header bölümünde 'Agents' butonunun görünür olduğunu doğrula
        WebsiteMain websiteMain = new WebsiteMain();
        Assert.assertTrue(websiteMain.agentsButton.isDisplayed());

        //Agents butonuna tıkla
        websiteMain.agentsButton.click();

        //İlk emlakçının ismi görüntülendiğini doğrula.
        Agents agents = new Agents();
        Assert.assertTrue(agents.ilkAgentIsimElementi.isDisplayed());

        //İlk emlakçının telefon numarası görüntülendiğini doğrula.
        Assert.assertTrue(agents.ilkAgentTelefonNo.isDisplayed());

        //İlk emlakçının mail adresi görüntülendiğini doğrula
        Assert.assertTrue(agents.ilkAgentEmail.isDisplayed());

        //İlk emlakçının ilan sayısı görüntülendiğini doğrula
        Assert.assertTrue(agents.ilkAgentIlanSayisi.isDisplayed());

        //Sayfayı kapat
        Driver.quitDriver();
    }

    @Test
    public void TC02(){
        //Browser aç ve https://qa.hauseheaven.com/  adersine git
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));
        WebsiteMain websiteMain = new WebsiteMain();
        Agents agents = new Agents();

        //Agents butonuna tıkla

        websiteMain.agentsButton.click();

        //Email ikonu görünür olduğunu doğrula
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});",agents.ilkAgentMailButonu);
        ReusableMethods.bekle(1);
        Assert.assertTrue(agents.ilkAgentMailButonu.isDisplayed());

        // Sayfay kapat
        Driver.quitDriver();

    }
}
