
Feature: US013 Parametre Kullanimi
  @gp6
  Scenario: TC01 Parametre Kullanimi
    Given kullanici "https://www.trendyol.com" sayfasinda
    Then kullanici 3 saniye bekler
    When Url'nin "amazon" icerdigini test edelim
    And sayfayi kapatir