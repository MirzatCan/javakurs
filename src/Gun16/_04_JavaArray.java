package Gun16;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.
        Scanner oku=new Scanner(System.in);
        int[] sayilar=new int[7];
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print((i+1)+".sayi giriniz=");
            sayilar[i]=oku.nextInt();
            toplam=toplam+sayilar[i];
        }
        int ortalama=toplam/sayilar.length;
        int sayac=0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]>ortalama && sayilar[i]%2!=0)
                sayac++;
        }
        System.out.println("sayac = " + sayac);

    }
}
