package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TargetWordPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class TargetWordSteps {
    TargetWordPage targetWordPage = new TargetWordPage();
    @Given("Kullanici ana sayfaya gidebilmeli")
    public void kullaniciAnaSayfayaGidebilmeli() {
        Driver.getDriver().get("https://www.telerik.com/support/demos");
    }

    @When("Kullanici Cookie icin gelen seceneklerden Accept and Close’a tiklar")
    public void kullaniciCookieIcinGelenSeceneklerdenAcceptAndCloseATiklar() {

        try {
            targetWordPage.acceptAndClose.click();

        }catch (Exception e){
            System.out.println(e + " Burada cikmadi ");
        }
    }

    @And("Kullanici arama kutusunu tiklar")
    public void kullaniciAramaKutusunuTiklar() {
        targetWordPage.searchLink.click();
    }

    @And("Kullanici arama kutusuna {string} yazar")
    public void kullaniciAramaKutusunaYazar(String targetWord) {targetWordPage.searchBox.sendKeys(targetWord);}

    @And("Kullanici submit butonuna tiklar")
    public void kullaniciSubmitButonunaTiklar() {
        targetWordPage.searchButton.click();
    }

    @And("Arama sonucu cikan ilk secenek {string} icerdigi Assert edilir")
    public void aramaSonucuCikanIlkSecenekIcerdigiAssertEdilir(String targetWord) {
        String allLinks = targetWordPage.partialLinksAll.toString();
        Assert.assertTrue(allLinks.contains(targetWord));
    }
    @Then("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {Driver.closeDriver();}
}

