package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuapPage;
import utilities.Driver;

import java.time.Duration;

public class HerokuappstepDefinition {
    HerokuapPage herokuapPages=new HerokuapPage();
    @And("Add Element butonuna basin")
    public void addElementButonunaBasin() {
        herokuapPages.addElementButton.click();
    }

    @And("Delete butonu gorunur oluncaya kadar bekleyin")
    public void deleteButonuGorunurOluncayaKadarBekleyin() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(herokuapPages.deleteButton));


    }

    @And("Delete butonunun gorunur oldugunu test edin")
    public void deleteButonununGorunurOldugunuTestEdin() {
        //assert herokuapPages.deleteButton.isDisplayed();--> bu sekildede kullanabiliriz
        Assert.assertTrue(herokuapPages.deleteButton.isDisplayed());
    }

    @And("Delete butonunu basarak butonu silin")
    public void deleteButonunuBasarakButonuSilin() {
        herokuapPages.deleteButton.click();
    }

    @And("Delete butonunun gorunmedigini test edin")
    public void deleteButonununGorunmediginiTestEdin() {
       // Assert.assertFalse(herokuapPages.deleteButton.isDisplayed());
       // Assert.assertFalse(Driver.getDriver().getPageSource().contains("Delete"));
        assert ! herokuapPages.deleteElement.isDisplayed();
    }


    @And("AddRemove Elements yazisinin gorunurlugunu test eder")
    public void addremoveElementsYazisininGorunurlugunuTestEder() {
        assert herokuapPages.addRemoveElements.getText().equals("Add/Remove Elements");
    }
}
