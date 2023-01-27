package Gun16;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // 50 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        // kaç not olduğunu bulunuz ve bunları yazdırnız.
        Scanner oku=new Scanner(System.in);
        int [] notlar=new int[50]; //50 tane int kutusu olusturuldu
        int toplam=0;
        for (int i=0;i<notlar.length;i++){
            System.out.print((i+1)+".Ogrenci Not=");
            notlar[i]=oku.nextInt();
            toplam=toplam+notlar[i];
        }

        int ortalama=toplam/notlar.length;
        int sayac=0;
        for (int i=0;i<notlar.length;i++){
            if (notlar[i]>ortalama)
                sayac++;
            }
        System.out.println("Ortalaman buyuk not sayisi="+sayac);
        }
    }

