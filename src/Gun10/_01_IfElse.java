package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir ogrenci notuna gore 50den buyuk ise gectiniz.
        //kucuk ise kaldiniz yadiriniz
        Scanner sayiOku=new Scanner(System.in);
        System.out.print("Not giriniz:");
        int notOkul=sayiOku.nextInt();

        //1.yontem  ->  sadece if ile
        if (notOkul>=50)
            System.out.println("Gectiniz");
        if (notOkul<50)
            System.out.println("kaldiniz");

        //2.yontem   -> If  else kulanarak
        if (notOkul>=50)
            System.out.println("Gectiniz");
        else   //degil ise demek
            System.out.println("kaldiniz");
    }
}
