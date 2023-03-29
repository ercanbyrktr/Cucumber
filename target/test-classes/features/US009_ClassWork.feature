Feature: US009 ClassWork
  Scenario: TC01 Herokuapp sitesi buton tarama

    Then kullanici "herokuappUrl" sayfasina gider
    And Add Element butonuna basin
    And Delete butonu gorunur oluncaya kadar bekleyin
    And Delete butonunun gorunur oldugunu test edin
    And Delete butonunu basarak butonu silin
    And AddRemove Elements yazisinin gorunurlugunu test eder
    And kullanici 3 saniye bekler
    And Delete butonunun gorunmedigini test edin
    And kullanici 3 saniye bekler
    And sayfayi kapatir