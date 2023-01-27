package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayının tek mi çift mi olduğunu yazdırınız
        Scanner sayiOku=new Scanner(System.in);
        System.out.print("Sayi giriniz:");
        int sayi=sayiOku.nextInt();

        if (sayi%2==0)
        {System.out.println("cift");}
        if (sayi%2!=0)//1 veya -1 olmasi lazim   != esit degil ise demek
        {System.out.println("tek");}

    }
}
