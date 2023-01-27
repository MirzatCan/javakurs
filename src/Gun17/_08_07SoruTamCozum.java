package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _08_07SoruTamCozum {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random(10dahil) olarak doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazıdırnız.

        int [] sayilar=new int[10];
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i]=(int)(Math.random()*11);
            System.out.println(sayilar[i]);
        }
        Scanner oku=new Scanner(System.in);
        System.out.print("sayi giriniz:");
        int sayi=oku.nextInt();

        boolean bulundu=false;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]==sayi){
                bulundu=true;
                System.out.println("var.indexi="+i);
            }
        }
        if (!bulundu)
            System.out.println("yok");
    }
}
