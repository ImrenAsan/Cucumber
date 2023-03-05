package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SearchPage;
import utilities.ConfigReader;
import utilities.Driver;

public class SearchSteps {
    SearchPage searchPage = new SearchPage();
    @Given("Kullanici anasayfaya gider")
    public void kullaniciAnasayfayaGider() {Driver.getDriver().get("https://www.ebay.de/");}

    @When("Kullanici Cookies secenegini Accept All olarak secer")
    public void kullaniciCookiesSeceneginiAcceptAllOlarakSecer() {
        searchPage.acceptAll.click();
    }

    @And("Kullanici arama kutusuna Computer yazar")
    public void kullaniciAramaKutusunaComputerYazar() {
        searchPage.searchBox.sendKeys("Computer");
    }

    @And("Kullanici arama butonunu basar")
    public void kullaniciAramaButonunuBasar() {
        searchPage.searchButton.click();
    }

    @And("Kullanici filtre bolumunden WindowsOn secenegine tiklar")
    public void kullaniciFiltreBolumundenWindowsOnSecenegineTiklar() {
        searchPage.checkboxWindows10.click();
    }

    @Then("Listelenen seceneklerden en ustteki urunun WindowsOn ozelligini dogrular")
    public void listelenenSeceneklerdenEnUsttekiUrununWindowsOnOzelliginiDogrular() {
        String titleText= searchPage.productTitle.getText();
        Assert.assertTrue(titleText.contains("Windows 10"));
    }
}
