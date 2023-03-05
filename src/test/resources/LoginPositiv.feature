Feature: Kullanici login sayfasina bilgilerini girer ve ana sayfaya gecis yapar.
  Background:
    Given Kullanici login sayfasina gider
  @smokeTest
  @positive #Keyword Driven Testing. // runner classinda 'tags' kismina bu keywordü yaziyoruz.
  Scenario: Kullanici gecerli kullanici adi ve sifre ile login islemini gerceklestirebilmelidir.


    When Kullanici kullanici adi kutusuna gecerli kullanici adini girer.
    And Kullanici sifre kutusuna gecerli sifresine girer.
    And Kullanici login butonuna tiklar.
    Then Kullanici ana sayfaya yonlenir.
