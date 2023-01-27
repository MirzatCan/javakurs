package Gun06;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // Girilen bir ad soyadı "Ismet Temur"  I.T.
        //  I.T. şeklinde yazdırınız.

        Scanner okuStr=new Scanner(System.in); // kulancidan veri isteme islemi
        System.out.print("Ad-soyad="); // kulancini anlasin diyr vernigimiz soru
        String adSoyad=okuStr.nextLine(); // ad soyadi veri olarak alindi

        char ilkHarf=adSoyad.charAt(0); // ilk harf
        int boslukIndex=adSoyad.indexOf(" "); // once bosluk indexi buluyoruz
        char sonharf=adSoyad.charAt(boslukIndex+1); // bosluktan sonraki index soyad ilk harf oluyor
        // char soyadiIlkharf=adSoyad.ChatAt(adSoyad.indexOf(" ")+1);  -> ikinci sekil direk bir satirda 2 islem tamamlamak
        System.out.println(ilkHarf+"."+sonharf+".");
    }
}
