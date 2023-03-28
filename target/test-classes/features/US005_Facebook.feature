Feature: US005 Facebook Login
  Scenario: TC01 kullanici gecerli bilgilerle giris yapar
    Given kullanici "faceUrl" ana sayfasinda
    Then Login yazisini tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir