Feature: US008 Facebook Outline Kullanimi
  Scenario Outline: TC01 kullanici gecersiz bilgilerle giris yapar
    Given kullanici "faceUrl" sayfasina gider
    Then Login yazisini tiklar
    And "<gecersizEmail>" username girer
    And "<gecersizPassword>" password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And kullanici 3 saniye bekler
    And sayfayi kapatir
    Examples:
      | gecersizEmail | gecersizPassword |
      | a@gmail.com | 123456 |

