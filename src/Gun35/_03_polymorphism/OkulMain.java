package Gun35._03_polymorphism;

import Gun32._01_Encepsulation.Kisi;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci("ayjamal", "ehet", "ogrenci", "ankara");
        Calisan ca1 = new Calisan("tumaris", "mirzat", "calisan", "yazilim");
        System.out.println("ca1 = " + ca1);
        System.out.println("ogr1 = " + ogr1);
        //toString ini kulaniyor bu yuzden tek metod degil.

        kisi i1 = new Ogrenci("mirzat", "memet", "Ogrenci", "istanbul");
        kisi i2 = new Calisan("xirzat", "memet", "calisan", "satis");

        kisi.kimlikYaz(i1); //kisiden ogrenci yada calisan olsun direk cagirma
        kisi.kimlikYaz(i2);

        kisi.kimlikYaz(ogr1); // new ogrenci ya da new calisan diye yapsak da cagirabilir
        kisi.kimlikYaz(ca1);

        Ogrenci.kimlikYaz(i2); //Ogrenciden calisani da cagriyabildik

    }
}
