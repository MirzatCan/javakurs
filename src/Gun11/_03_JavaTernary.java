package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        //kulancinin girecegi sayinin tek mi cift mi oldugunu yazdiriniz.

        Scanner sayioku=new Scanner(System.in);
        System.out.print("Sayi=");
        int sayi=sayioku.nextInt();

        if (sayi%2==0)
            System.out.println("cift");
        else
            System.out.println("tek");
        //2.yontem
        String sonuc=(sayi%2==0) ?"cift" : "tek"; // ? -> if   : -> else

        System.out.println("sonuc = " + sonuc);

        System.out.println((sayi%2==0) ?"cift" : "tek");


    }
}
