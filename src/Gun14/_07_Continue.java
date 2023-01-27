package Gun14;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {
        //kulancidan 5 sayi isteyiniz.
        //bu sayilarin 6 ile 10 arasindakiler haric,digerlerini toplasin

        Scanner sayiOku=new Scanner(System.in);
        int i=0; int toplam=0;
        for (i=0;i<5;i++){
            System.out.print("sayi giriniz:");
            int sayi=sayiOku.nextInt();

            if (sayi>6 && sayi<10)
                continue;  //calistigi anda kendinden sonra gelen komutlari pas gec

            toplam=toplam+sayi;
            System.out.println("toplam = " + toplam);
        }
    }
}
