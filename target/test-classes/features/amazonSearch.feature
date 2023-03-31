
Feature: Amazon Search
  @gp1
  Scenario: TC01 Kullanici amazonda nutella aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici nutella aratir
    And sonuclarin nutella icerdigini test eder
    And sayfayi kapatir

  Scenario: TC01 Kullanici Selenium nutella aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici Selenium aratir
    And sonuclarin Selenium icerdigini test eder
    And sayfayi kapatir

  Scenario: TC01 Kullanici amazonda iphone aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici iphone aratir
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir