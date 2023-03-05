Feature: Kullanici ana sayfaya gider ve computer aramasi yapar.

  @search
    Scenario: Kullanici Windows 10 ozelligine sahip bilgisayarlari goruntuler

  Given Kullanici anasayfaya gider
  When Kullanici Cookies secenegini Accept All olarak secer
  And Kullanici arama kutusuna Computer yazar
  And Kullanici arama butonunu basar
  And Kullanici filtre bolumunden WindowsOn secenegine tiklar
  Then Listelenen seceneklerden en ustteki urunun WindowsOn ozelligini dogrular