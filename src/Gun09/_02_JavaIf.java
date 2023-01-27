package Gun09;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının negatif mi , pozitif mi olduğunu yazdırınız.
        // Sıfır ise sıfır yazdırınız.

        Scanner sayiOku=new Scanner(System.in);
        System.out.print("Sayi giriniz:");
        int sayi=sayiOku.nextInt();
        if (sayi>0)
        {System.out.println("pozitif");}
        if (sayi<0)
        {System.out.println("negatif");}
        if (sayi==0) //== yapmak zorundayiz
        {System.out.println("sifir");}
    }
}
