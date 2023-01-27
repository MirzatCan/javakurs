package Gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        // girilen bir sayının tek sayı olup olmadığını yazdırınız.
        Scanner sayiOku=new Scanner(System.in);
        System.out.print("Sayi giriniz:");
        int sayi=sayiOku.nextInt();

        int modul=sayi%2;
        System.out.println("modul = " + modul);
        System.out.println("tek sayi mi? " + (modul==1));
        
        //2.yontem
        System.out.println("(sayi%2==1) = " + (sayi%2==1));

    }
}
