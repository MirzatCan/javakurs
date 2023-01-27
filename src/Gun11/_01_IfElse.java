package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayını pozitif, negatif veya sıfır olduğunu yazdırınız.

        Scanner sayiOku = new Scanner(System.in);
        System.out.print("sayi giriniz:");
        double sayi = sayiOku.nextDouble();

        if (sayi > 0)
            System.out.println("sayi: pozitif");
        else{
        if (sayi == 0)
            System.out.println("sayi: 0");
        else
            System.out.println("sayi: negatif ");}


    }
}
