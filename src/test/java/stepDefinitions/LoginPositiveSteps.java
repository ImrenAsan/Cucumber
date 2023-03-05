package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SauceDemoPage;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginPositiveSteps {
    SauceDemoPage sauceDemoPage = new SauceDemoPage();
    @Given("Kullanici login sayfasina gider")
    public void kullanici_login_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("Kullanici kullanici adi kutusuna gecerli kullanici adini girer.")
    public void kullanici_kullanici_adi_kutusuna_gecerli_kullanici_adini_girer() {
        sauceDemoPage.username.sendKeys(ConfigReader.getProperty("username"));
    }
    @When("Kullanici sifre kutusuna gecerli sifresine girer.")
    public void kullanici_sifre_kutusuna_gecerli_sifresine_girer() {
        sauceDemoPage.password.sendKeys(ConfigReader.getProperty("password"));
    }
    @When("Kullanici login butonuna tiklar.")
    public void kullanici_login_butonuna_tiklar() {
        sauceDemoPage.loginButton.click();
    }

    @Then("Kullanici ana sayfaya yonlenir.")
    public void kullaniciAnaSayfayaYonlenir() {
        String expectedTitle = "PRODUCTS";
        Assert.assertEquals(expectedTitle, sauceDemoPage.title.getText());
    }



}
