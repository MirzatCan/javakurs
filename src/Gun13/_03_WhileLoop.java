package Gun13;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        //girilen 5 sayinin toplaminin sonucunu yazdiriniz
        Scanner sayiOku=new Scanner(System.in);
        System.out.print("sayi giriniz:");

        int sayac=0;
        int toplam=0;
        while (sayac<5)
        {int sayi=sayiOku.nextInt();
            toplam=toplam+sayi; sayac++;
        }
        System.out.println(toplam);
    }
}
