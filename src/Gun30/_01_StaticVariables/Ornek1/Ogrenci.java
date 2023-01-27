package Gun30._01_StaticVariables.Ornek1;

public class Ogrenci {
    String adi;
    String soyAdi;
    static String okuAdi="Yildiz teknik";
    // sen bitanesin
    //hepsi için geçerli tek bir tane eleman
    //Tekrarlayan ve tum nesneler için kullanılacak
    //değişkenler için STATIC kullanıyoruz.
    //static=sen bir tanesin
    //static varsa hafızadan tasarruf sağlar. hepsine atanır,
    //tek olarak hafızada bulunur
    //tipin, sınıfın, classın değişkeni oldu

    public Ogrenci(String adi, String soyAdi) {
        this.adi = adi;
        this.soyAdi = soyAdi;

    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "adi='" + adi + '\'' +
                ", soyAdi='" + soyAdi + '\'' +
                ", Okul Adi='" + okuAdi + '\'' +
                '}';
    }
}
