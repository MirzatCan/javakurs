package Gun25._02_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_SoruCozum {
    public static void main(String[] args) {
        //Bir okulda kayıt programı için Ogrenci bilgilerini alan modül
        // yazılacaktır. Ogrenci ye ait bilgiler (adi, soyadi, sinifi ve adres) vardır.
        // bu yapıyı oluşturunuz.
        // Daha sonra 3 tane öğrenci bilgilerini kullanıcıdan alarak doldurunuz.

        Scanner strOku=new Scanner(System.in);
        Scanner intOku=new Scanner(System.in);

        ArrayList<Ogrenci> snf=new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            Ogrenci ogr=new Ogrenci();

            System.out.print("Adiniz:"); ogr.adi=strOku.nextLine();
            System.out.print("soyadiniz:");ogr.soyadi=strOku.nextLine();
            System.out.print("sinifiniz:");ogr.sinif=intOku.nextInt();
            System.out.print("Adres:");ogr.adres=strOku.nextLine();

            snf.add(ogr);
        }

        for (Ogrenci ogr : snf) {
            System.out.println("org.adi = " + ogr.adi);
            System.out.println("org.soyadi = " + ogr.soyadi);
            System.out.println("org.sinif = " + ogr.sinif);
            System.out.println("org.adres = " + ogr.adres);

        }
    }


}
class Ogrenci{
    String adi;
    String soyadi;
    int sinif;
    String adres;
}
