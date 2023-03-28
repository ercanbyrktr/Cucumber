package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;

public class Facebook {
    @Given("kullanici facebook ana sayfasinda")
    public void kullaniciFacebookAnaSayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("faceUrl"));
    }

    @Then("Login yazisini tiklar")
    public void loginYazisiniTiklar() {
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
    }
}
