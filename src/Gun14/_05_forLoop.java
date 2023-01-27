package Gun14;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        //2.bolum: carpinin degeri 10000 gectiginde islem durdur.

        Scanner sayiOku=new Scanner(System.in);
        System.out.print("sayi giriniz:");
        //1.yontem    1 dan baslayarak carpma
        int sayi=sayiOku.nextInt();
        int i=1;   int carpi=1;
        for (i=1;i<=sayi;i++)
        {
            carpi=carpi*i;
            if (carpi>10000){
                System.out.println("break calisti");
                break;}
        }

        System.out.println("carpi = " + carpi);

        //2.yontem     verdigi sayidan geriye 1'a kadar carpsin
        int I=sayi; int carpi2=1;
        for (I=sayi; I>=1;I--){
            carpi2=carpi2*I;
            if (carpi2>10000){
                System.out.println("break calisti");
                break;}
        }
        System.out.println("carpi2 = " + carpi2);
    }
}
