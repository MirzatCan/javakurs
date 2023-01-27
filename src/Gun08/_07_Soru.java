package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // kullanıcının gireceği 2 sayının birbirine
        // eşit mi olup olmadığını yazdırınız
        Scanner sayOku=new Scanner(System.in);
        System.out.print("sayi1 giriniz=");
        int sayi1=sayOku.nextInt();

        System.out.print("sayi2 giriniz=");
        int sayi2=sayOku.nextInt();

        System.out.println("sayi1 sayi2 esit mi? " + (sayi1==sayi2));

        //2.yontem
        boolean esitMi= (sayi1==sayi2);
        System.out.println("esitMi = " + esitMi);


    }
}
