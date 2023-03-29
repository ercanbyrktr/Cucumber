package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class FacebookStepDefinition {
    FacebookPage facebook=new FacebookPage();
    Actions actions=new Actions(Driver.getDriver());
    @Given("kullanici {string} ana sayfasinda")
    public void kullaniciAnaSayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("Login yazisini tiklar")
    public void loginYazisiniTiklar() {
        facebook.login.click();
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        facebook.email.sendKeys("gecersizgmail.com");
    }
    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        actions.sendKeys(Keys.TAB).sendKeys("12345").perform();
    }
    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }
    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(facebook.girisYapilmadi.isDisplayed());
    }


    @And("{string} username girer")
    public void usernameGirer(String gecersizUsername) {
        facebook.email.sendKeys(gecersizUsername);
    }

    @And("{string} password girer")
    public void passwordGirer(String gecersizPassword) {
        facebook.sifre.sendKeys(gecersizPassword);
    }
}
