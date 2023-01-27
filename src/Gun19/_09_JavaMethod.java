package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _09_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız
        int[] sayilar=new int[5];
        Scanner oku=new Scanner(System.in);
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print((i+1)+".sayi giriniz:");
            sayilar[i]= oku.nextInt();

        }
        System.out.println(Arrays.toString(sayilar));
        enBuyuk(sayilar);
        enkucuk(sayilar);
        ortalam(sayilar);

    }
    public static void enBuyuk(int[] sayilar){
        int enBuyuk=sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]>enBuyuk)
                enBuyuk=sayilar[i];
        }
        System.out.println("enBuyuk = " + enBuyuk);


    }
    public static void enkucuk(int[] sayilar){
        int enkucuk=sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]<enkucuk)
                enkucuk=sayilar[i];
        }
        System.out.println("enkucuk = " + enkucuk);

    }
    public static void ortalam(int[] sayilar){
        int toplam=0;   int ortalama;
        for (int i = 0; i < sayilar.length; i++) {
            toplam=toplam+sayilar[i];
        }
        ortalama=toplam/sayilar.length;
        System.out.println("ortalama = " + ortalama);
    }
}
