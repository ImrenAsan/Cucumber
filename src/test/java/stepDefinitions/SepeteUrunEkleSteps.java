package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SepeteUrunEklePage;
import utilities.Driver;

public class SepeteUrunEkleSteps {
    SepeteUrunEklePage sepeteUrunEkle = new SepeteUrunEklePage();
    String actualCount;
    String expectedCount;
    String actualCount2;
    @Given("kullanici {string} web sayfasina gider")
    public void kullaniciWebSayfasinaGider(String webPage) {Driver.getDriver().get(webPage);}

    @When("kullanici cookiesi kabul eder")
    public void kullaniciCookiesiKabulEder() {
        sepeteUrunEkle.cookiesAcceptButton.click();
    }

    @And("kullanici Pricing linkine tiklar")
    public void kullaniciPricingLinkineTiklar() {
        sepeteUrunEkle.pricingPage.click();
    }

    @And("kullanici BuyNow butonu ile sepete bir urun ekler")
    public void kullaniciBuyNowButonuIleSepeteBirUrunEkler() {
        sepeteUrunEkle.buyNowButton.click();
    }


    @And("kullanici Pricing sayfasina geri doner")
    public void kullaniciPricingSayfasinaGeriDoner() {
        sepeteUrunEkle.continueShopping.click();
    }

    @And("kullanici BuyNow butonu ile bir urun daha ekler")
    public void kullaniciBuyNowButonuIleBirUrunDahaEkler() {
        sepeteUrunEkle.secondProductAdd.click();
    }

    @And("kullanici ana sayfaya geri doner")
    public void kullaniciAnaSayfayaGeriDoner() {
        sepeteUrunEkle.goToHomePage.click();
    }

    @And("kullanici sepet uzerindeki mevcut sayiyi alir")
    public void kullaniciSepetUzerindekiMevcutSayiyiAlir() {
        actualCount = sepeteUrunEkle.goToCart.getText();
    }

    @And("kullanici sepete tekrar gider")
    public void kullaniciSepeteTekrarGider() {
        sepeteUrunEkle.goToCart.click();
    }

    @And("kullanici sepetteki urunlerden bir tanesini Delete linki ile siler")
    public void kullaniciSepettekiUrunlerdenBirTanesiniDeleteLinkiIleSiler() {
        sepeteUrunEkle.deleteLink.click();
    }

    @Then("kullanici sepet simgesi uzerindeki sayinin bir eksildigini kontrol eder")
    public void kullaniciSepetSimgesiUzerindekiSayininBirEksildiginiKontrolEder() {
        actualCount2= sepeteUrunEkle.goToCart.getText();
        System.out.println("actualCount2 = " + actualCount2);
        expectedCount= actualCount;
        Assert.assertEquals(expectedCount, actualCount2);
    }


}
