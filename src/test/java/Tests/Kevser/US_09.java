package Tests.Kevser;

import Pages.Agents;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class US_09 {

    @Test
    public void TC01(){

        //Browser aç ve https://qa.hauseheaven.com/  adersine git
        Driver.getDriver().get(ConfigReader.getProperty("WebsiteMainPageURL"));

        //Header bölümünde 'Agents' butonunun görünür olduğunu doğrula
        WebsiteMain websiteMain = new WebsiteMain();
        Assert.assertTrue(websiteMain.agentsButonu.isDisplayed());

        //Agents butonuna tıkla
        websiteMain.agentsButonu.click();

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

    


}
