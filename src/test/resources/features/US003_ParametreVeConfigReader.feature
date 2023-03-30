Feature: Parametre Kullanimi

  Scenario: TC01 Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "faceUrl" sayfasina gider
    When Url'nin "facebook" icerdigini test edelim
    And sayfayi kapatir
  @gp2
  Scenario: TC02 Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "hepsiburadaUrl" sayfasina gider
    When Url'nin "hepsiburada" icerdigini test edelim
    And sayfayi kapatir

  Scenario: TC03 Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "googleUrl" sayfasina gider
    Then kullanici 3 saniye bekler
    When Url'nin "google" icerdigini test edelim
    And sayfayi kapatir
  @gp2
  Scenario: TC04 Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "amznUrl" sayfasina gider
    When Url'nin "amazon" icerdigini test edelim
    And sayfayi kapatir