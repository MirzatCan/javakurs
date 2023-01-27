package Gun22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
        int sayi=5; //tek bir rakam tutabilen bir degisken
        int[] dizi=new int[20]; //20 adet sayi saklayabilen bir degisken, uzunluk sabit
        int[][] tablo=new int[20][2];//20*2 lik sayi saklayabilen degisken, sabit uzunluk

        ArrayList<Integer> liste=new ArrayList<>(); //istedigin kadar sayi eklenebilen,uzunlugu degisken

        //  bir sınıf bu sınıf da 20 kişi var ve bunların 3 dersi olsun.Öğrencilerin bu 3 derse ait notlarını
        //  nasıl bir değişkende saklayabilirim.

        ArrayList<Integer> matNotlari=new ArrayList<>();
        ArrayList<Integer> fizNotlari=new ArrayList<>();
        ArrayList<Integer> kimNotlari=new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(60);
        matNotlari.add(65);

        fizNotlari.add(62);
        fizNotlari.add(37);

        kimNotlari.add(78);
        kimNotlari.add(65);
        kimNotlari.add(98);
        kimNotlari.add(48);

        // ArrayList in ArrayList ini nasil yapariz
        ArrayList<ArrayList<Integer>> notlarListe=new ArrayList<>(); //listelerin listesi
        notlarListe.add(matNotlari);
        notlarListe.add(fizNotlari);
        notlarListe.add(kimNotlari);
        System.out.println("notlarListe = " + notlarListe);

        notlarListe.get(0); //matNotlari

        int matBirNot= notlarListe.get(0).get(0);//matNotlarin ilk notu alma
        System.out.println("matBirNot = " + matBirNot);

        System.out.println("matNot= " + notlarListe.get(0));
        System.out.println("fizNot = " + notlarListe.get(1));
        System.out.println("kimNot = " + notlarListe.get(2));

        //yukardikinin yerine bir for dongusu nasil yapilir
        for (int i = 0; i < notlarListe.size(); i++) {
            System.out.println("notlarListe = " + notlarListe.get(i));
        }

        //satir sutun yazdirma
        for (int i = 0; i < notlarListe.size(); i++) {
            for (int j = 0; j < notlarListe.get(i).size(); j++) {
                System.out.print(notlarListe.get(i).get(j)+"  ");
            }
            System.out.println();
        }
    }
}
