@parametre
Feature: US002 Parametre Kullanimi
  Background: Ortak adim
    Given Kullanici amazon sayfasina gider

  Scenario: TC01 Kullanici amazonda parametreli arama yapar

    Then kullanici "nutella" icin arama yapar
    Then sonuclarin "nutella" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Kullanici amazonda parametreli arama yapar

    Then kullanici "selenium" icin arama yapar
    Then sonuclarin "selenium" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC03 Kullanici amazonda parametreli arama yapar

    Then kullanici "java" icin arama yapar
    Then sonuclarin "java" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC04 Kullanici amazonda parametreli arama yapar

    Then kullanici "SQL" icin arama yapar
    Then sonuclarin "SQL" icerdigini test eder
    And sayfayi kapatir

    # Feature dosyasında parametreli arama yaptıgımızda ""(tırnak) icine aldıgımız string degeri
    # stepDefinitionda bir kere parametreli method olusturur ve yeni bir arama yapmak istedigimizde
    # Tekrar method olusturmadan feature dosyasından ""(tırnak) icinde belirttigimiz string ifadeyi
    # degistirmemiz yeterli olacaktır. Böylece kodlarımız dinamik olacaktır