Feature: US005 Facebook Login
  Scenario: TC01 kullanici gecerli bilgilerle giris yapar
    Given kullanici facebook ana sayfasinda
    Then Login yazisini tiklar
    And gecersiz username girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And kullanici sayfayi kapatir