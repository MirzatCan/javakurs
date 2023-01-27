package Gun10;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        //Girilen bir sayinin tek mi cift mi oldugunu yazdiriniz

        Scanner sayiOku=new Scanner(System.in);
        System.out.print("Sayi giriniz:");
        int sayi=sayiOku.nextInt();

        if (sayi%2==0)
        {System.out.println("Cift");}
        else
        {System.out.println("tek");}
    }
}
