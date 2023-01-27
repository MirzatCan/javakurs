package Gun13;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // 100 e kadar olan sayıların toplamını bulunuz
        int sayac=0;
        int toplam=0;
        while (sayac<=100){
        toplam=toplam+sayac;
        sayac++;
        }
        System.out.println("toplam="+toplam);
    }
}
