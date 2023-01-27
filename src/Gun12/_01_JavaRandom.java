package Gun12;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {
        //0-5 arasi gibi sayilar urettik, hep sifirdan basladi
        //4-9 arasi nasil urettirirdim.
        // yontem su: once aralik kadar normal uret(9-4) yani 0-5 arasi
        // uretilmis olansayiya min sayi ekle, uretilmis sayiya +4
        //(int)(Math.Random()*(max-min))+min

        //soru: Girilen max ve min araliginda bir sayi urettiriniz.

        Scanner sayiOku=new Scanner(System.in);
        System.out.print("min=");
        int min=sayiOku.nextInt();

        System.out.print("max=");
        int max=sayiOku.nextInt();

        int randomSayi=(int)(Math.random()*(max-min))+min;
        System.out.println("randomSayi = " + randomSayi);
    }
}
