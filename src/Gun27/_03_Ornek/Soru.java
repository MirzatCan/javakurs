package Gun27._03_Ornek;
// Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
// 1- Lesson : fields : name, saat (1-10 arasında değer alıyor).
// 2- Student: fields : name, maxSaat, dersleri adında derslerini listesini tutacak bir liste.
// 3- 3 adet ders oluşturunuz.
// 4- 1 adet öğrenci tanımlayınız alabileceği maxCredit(maxSaat) si 10 olsun.
// 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
//    ders eklerken max alabileceği Saati geçmemeli, geçerse
//    uyarı versi, alabileceğiniz max Saati doldu şeklinde.
// 6- Unıversıte kurallarını yazdıran 2 maddelik bir not yazdıran metod ekleyinız.en basta
//    yazdırınız.

public class Soru {
    public static void main(String[] args) {
        dersler ders1=new dersler();
        ders1.dersAdi="Matematik";
        ders1.dersSaat=4;

        dersler ders2=new dersler();
        ders2.dersAdi="Fizik";
        ders2.dersSaat=4;

        dersler ders3=new dersler();
        ders3.dersAdi="kimya";
        ders3.dersSaat=3;

        Ogrenciler ogrenci1=new Ogrenciler();
        ogrenci1.isim="Mirzat";
        ogrenci1.maxSaat=10;

        ogrenci1.dersEkle(ders1);
        ogrenci1.dersEkle(ders2);
        ogrenci1.dersEkle(ders3);

        ogrenci1.dersleriYzdir();

        Ogrenciler.unversiteKurallariYaz();


    }
}
