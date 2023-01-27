package Gun18;

import java.util.Scanner;

public class _04_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu kullanıcıdan sayı alarak doldurunuz
        // daha sonra ayrı bir döngü de en büyük sayıyı bulunuz.
        int[][] sayilar=new int[2][3];
        Scanner oku=new Scanner(System.in);
        // Okuma islemi
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((i+1)+".satir "+(j+1)+".sayi giriniz=" );
                sayilar[i][j]=oku.nextInt();
            }
            System.out.println();
        }
        // yazdirma islemi
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sayilar[i][j]+" ");
            }
            System.out.println();
        }
        // en buyuk bulma islemi
        int enBuyuk=sayilar[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (sayilar[i][j]>enBuyuk)
                    enBuyuk=sayilar[i][j];
            }
        }
        System.out.println("enBuyuk = " + enBuyuk);



    }
}
