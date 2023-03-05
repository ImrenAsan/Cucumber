Feature: Kullanici ana sayfada hedef kelimeyi taratir.
Background:
  Given Kullanici ana sayfaya gidebilmeli
  When Kullanici Cookie icin gelen seceneklerden Accept and Close’a tiklar
  @wordSearch
  Scenario Outline: <targetWord> aranir ve ilk secenekde varligi dogrulanir.
    And Kullanici arama kutusunu tiklar
    And Kullanici arama kutusuna "<targetWord>" yazar
    And Kullanici submit butonuna tiklar
    And Arama sonucu cikan ilk secenek "<targetWord>" icerdigi Assert edilir
    Then Kullanici sayfayi kapatir
    Examples:
      |targetWord |
      |Keyword test |
      |Data testing |


