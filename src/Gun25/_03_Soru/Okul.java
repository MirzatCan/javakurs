package Gun25._03_Soru;

import Gun25._03_Soru.Ogrenci;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public String adi;
    public String mudurAdi;
    public Object ucreti;

    public static void main(String[] args) {

    //bir dosya icindeki ayri ayri classi birbirine cagirabiliriz.

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
        System.out.println("org.adres = " + ogr.adres);}

    }
}
