package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class gurustepDefinition {
    GuruPage guru=new GuruPage();
    @And("{string} sutununda tum degerleri yazdirir")
    public void sutunundaTumDegerleriYazdirir(String baslik) {
        int index=0;
        for (int i = 0; i < guru.basliklar.size(); i++) {
            if (guru.basliklar.get(i).getText().equals(baslik)){//Feature'dan gelen string degeri i degerine eşitledik
                System.out.println(guru.basliklar.get(i).getText());//Feature'dan gelen basligi yazdirdik
                index=i+1;//Feature'dan gelen ve i degerine esitledigimiz string'i ayni degere sahip sutunlarda yazdirabilmek
                //icin bos bir konteynır olusturup ona atadık. listte Index 0(sıfır) dan basladıgı icin ve webRable locate'imiz 1 den
                //basladigi icin i degerini 1 arttirdik
                List<WebElement> sutunElement=
                        Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+index+"]"));
                //Sonrasında webTable'daki body'i locate edip esitledigimiz index'i baslik altındaki sutunu getirebilmesi icin bu liste koyduk
                sutunElement.forEach(t-> System.out.println(t.getText()));
                //Lambda ile de o sutunu yazdırdık

                //for (WebElement w:sutunElement) {
                //    System.out.println(w.getText());
                //}

            }
        }
    }
}
