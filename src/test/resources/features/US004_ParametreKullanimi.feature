Feature: US004 Parametre Kullanimi
  Scenario: TC01 Parametre Kullanimi
  Scenario: TC01 Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "https://www.trendyol.com" sayfasinda
    Then kullanici 3 saniye bekler
    When Url'nin "trend" icerdigini test edelim
    And sayfayi kapatir