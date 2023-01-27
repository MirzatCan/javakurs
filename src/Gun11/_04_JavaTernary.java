package Gun11;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        //Soru: Girilen sayı 50 den büyük ise 1 , değilse 0 değerini ekrana yazdırınız.
        // Ternary operatör ile yapınız.

        Scanner sayiOku=new Scanner(System.in);
        System.out.print("sayi giriniz:");
        int sayi=sayiOku.nextInt();

        if (sayi>50)
            System.out.println("1");
        else
            System.out.println("0");

        //2.yontem
        System.out.println((sayi>50) ? "1" : "0");

        //3.yontem
        System.out.println((sayi>50) ? 1 : 0);

        int sonuc=(sayi>50)?1:0;
        System.out.println("sonuc = " + sonuc);


    }
}
