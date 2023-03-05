package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SauceDemoPage;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginNegativeSteps {

    SauceDemoPage sauceDemoPage = new SauceDemoPage();
    @Given("Kullainci login sayfasina gider")
    public void kullainciLoginSayfasinaGider() {
        Driver.getDriver().get("url");
    }
    @When("Kullanici kullanici kutusuna gecerli kullanici adini girmelidir")
    public void kullaniciKullaniciKutusunaGecerliKullaniciAdiniGirmelidir() {

        sauceDemoPage.username.sendKeys(ConfigReader.getProperty("username"));

    }

    @And("Kullainci sifre kutusuna gecersiz bir {string} girer")
    public void kullainciSifreKutusunaGecersizBirGirer(String sifre) {
        sauceDemoPage.password.sendKeys(sifre);
    }

    @And("Kullanici login butonuna tiklamalidir")
    public void kullaniciLoginButonunaTiklamalidir() {
        sauceDemoPage.loginButton.click();
    }
    @Then("Kullanici login hata mesaji alir ve login sayfasinda kalir")
    public void kullaniciLoginHataMesajiAlirVeLoginSayfasindaKalir() {

        Assert.assertTrue(sauceDemoPage.errorMessage.isDisplayed());
    }
}
