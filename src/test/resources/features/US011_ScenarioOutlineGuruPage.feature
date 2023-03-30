Feature: US011 Class Work

  Scenario Outline: TC01 kullanici sutun basligi ile liste alabilmeli

    Given kullanici "guruUrl" sayfasina gider
    And  "<Basliklar>" sutununda tum degerleri yazdirir
    Examples:
      | Basliklar          |
      | Company            |
      | Group              |
      | Prev Close (Rs)    |
      | Current Close (RS) |
      | % Change           |
    Scenario: kullanici sayfayi kapatir
      Given sayfayi kapatir