# com.HauseHeaven
### ReadMe Dosyası
### 
***



1. Her QA kendi Package klasöründe çalışır
2. Test filelerin isimlendirmesi US_001_021_034.java seklinde olmali
2. Locate alinan element nerenin elementi oldugu aciklama satiri ile aciklanmali
   || orn:  Homepage>> LoginLink>> Email Text Box ||

<br/>

### Git
***
1. Herkes kendi adina birer branch olusturur.
    * `git branch <isim>`

2. sol üst ya da sag alt(mac için) panelde branch ismimizin yazili oldugu kisimdan
    * main'e tikliyoruz
    * update'e tikliyoruz
    * sonra merge 'main' into 'branch ismi' yazan kısma tikliyoruz
    * bu şekilde pull işlemini gerçekleştirmiş oluyoruz

3. Yaptigi degisiklikleri kucuk commitlerle kendi branchinda saklar. Burada tavsiye edilen sadece sizin yaptiginiz degisikliklerin eklenmesidir.
    * 'git add . kesinlikle kullanilMAMAli'
    * 'git add (degisiklik yapilan yerin dosya yolu yani "path from content root" u)
    * 'git commit -m "İsim/tarih/Yapilan Degisiklikler icin bir mesaj yazilir."'
      Örn >>> git commit -m "<Kendi isminiz>/02.07/loginClassEklendi"
4. git push

5. gelen linkten ustteki linke tiklanir ve github hesabi sayfasi acilir

6. Push ettigimiz kendi kodumuz icin **request** olusturulur ve is biter

7. Merge request islemi team lead tarfindan gerceklestirilir


### Isimlendirmelerde dikkat edilecekler
***
| Element Türü   | Variable name |
|----------------|--------------|
| Button         | signInButton |    
| Logo           | logoX         |
| icon           | iconX        |
| Sadece text    | labelX       |
| Drop down      | dropDownX    |
| Radio Button   | radioButtonX |
| Check box      | checkBoxX    |
| Tablo Sütünu   | columnX      |
| Tablo Satiri   | rowX         |
| Kisi Resimleri | imageProfileX |
| ürün resimleri | imageProductX |
| Linkler        | linkX        |
