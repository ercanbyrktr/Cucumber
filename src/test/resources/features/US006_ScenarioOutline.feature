Feature: US006 kullanici amazonda istedigi kelimeleri aratir

  Scenario Outline: TC01 Kullanici istedigi kelimeleri aratir

    Given Kullanici amazon sayfasina gider
    Then kullanici "<istenenKelime>" icin arama yapar
    Then sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And sayfayi kapatir
    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | nutella       | nutella              |
      | selenium      | selenium             |
      | sql           | sql                  |

# TestNG deki dataProvider kullanimindaki gibi Cucumberda da Scenerio Outline kullaniriz
# Bu sekilde birden fazla kelimeyi tek seferde aratabiliriz

