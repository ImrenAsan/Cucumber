package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GoogleSearch;
import utilities.Driver;

public class GoogelSteps {
    GoogleSearch googleSearch = new GoogleSearch();
    @Given("Kullanici Google sayfasina yönlenir")
    public void kullaniciGoogleSayfasinaYönlenir() {
        Driver.getDriver().get("https://www.google.de/");
    }

    @When("Butun cerezler kabul edilir")
    public void butunCerezlerKabulEdilir() {
        try {
           googleSearch.acceptCookiesButton.click();

        }catch (Exception e){
            System.out.println(e + " Burada cikmadi ");
        }
    }

    @And("Kullanici {string} arar")
    public void kullaniciArar(String kelime) {
        googleSearch.searchBox.sendKeys(kelime, Keys.ENTER);
    }


    @Then("{string} ilk sayfada dogrulanir")
    public void ilkSayfadaDogrulanir(String kelime) {
        String result = googleSearch.firstRow.getText();
        Assert.assertTrue(result.contentEquals(kelime));
    }



}
