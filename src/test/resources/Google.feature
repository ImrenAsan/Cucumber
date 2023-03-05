Feature: Anasayfada kelime taranir ve ilk sayfada varligi dogrulanir.

  @kelime
  Scenario Outline: Kelime anasayfada aranir ve ilk cikan sayfada kelimenin varligi kontrol edilir
    Given Kullanici Google sayfasina yönlenir
    When Butun cerezler kabul edilir
    And Kullanici "<kelime>" arar
    Then "<kelime>" ilk sayfada dogrulanir

    Examples:
    |kelime      |
    |keyword test|
    |data testing|