package Gun14;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
        // kullanıcının gireceği bir rakama kadar
        // olan sayıların toplamını bulunuz.

        Scanner sayiOku=new Scanner(System.in);
        System.out.print("sayi giriniz:");
        //1.yontem    0 dan baslayarak toplama
        int sayi=sayiOku.nextInt();
        int i=0;   int toplam=0;
        for (i=0;i<sayi;i++)
            toplam=toplam+i;
        System.out.println("toplam = " + toplam);

        //2.yontem     verdigi sayidan geriye 0'a kadar toplama
        int I=sayi; int toplam2=0;
        for (I=sayi; I>=0;I--)
            toplam2=toplam+I;
        System.out.println("toplam2 = " + toplam2);

    }
}
