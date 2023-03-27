package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@parametre",
        dryRun = false

)

public class Runner {
    /*
    Runner Class'ı TestNG'deki XML mantıgı ile calısır. Calıstırmak istedigimiz seneryolara tag belirtiriz
    ve belirttigimiz tag'ları calistirir. XML'deki gibi istedigimiz testleri calistirmak icin kullanırız.
    Runner class body'si bostur ve runner class'ını ekleyecegimiz notasyonlar aktive eder.
    Bu class'da kullanacagımız 2 adet notasyon vardır
    1-@RunWith(Cucumber.class) notasyonu Runner class'ına calisma ozelligi ekler
    Bu notasyon oldugu icin Cucumber framework'umuzde Junit kullanmayı tercih ederiz
    2-@CucumberOptions notasyonu icinde
    features : Runner dosyasının feature dosyasını nereden bulacagını tarif eder
    glue : stepDefinitions yolunu belirtiriz
    tags : Hangi tag'ı calistirmak istiyorsak onu belli eder

    dryRun : iki secenek vardır
    dryRun = true; dersek testimizi calistirmadan eksik adımları bize verir
    dryRun = false; testlerimizi driver ile calistirir.
     */

}
