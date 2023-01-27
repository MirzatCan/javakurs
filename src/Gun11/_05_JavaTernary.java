package Gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        // Soru : Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        //        olduğunu Ternary operatör ile yazdırınız.
        Scanner sayiOku=new Scanner(System.in);
        System.out.print("Sayi giriniz:");
        int sayi=sayiOku.nextInt();

        System.out.println((sayi>0)?"pozitif":(sayi==0)?"sifir":"negatif");

    }
}
