Feature: US001 Background Kullanimi
  Background: Ortak adimlar
    Given Kullanici amazon sayfasina gider

  Scenario: TC01 Kullanici amazonda nutella aratir


    Then Kullanici nutella aratir
    And sonuclarin nutella icerdigini test eder


  Scenario: TC02 Kullanici Selenium nutella aratir


    Then Kullanici Selenium aratir
    And sonuclarin Selenium icerdigini test eder


  Scenario: TC03 Kullanici amazonda iphone aratir


    Then Kullanici iphone aratir
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir

