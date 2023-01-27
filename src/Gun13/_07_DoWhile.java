package Gun13;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        //kulanici 0 degerini girene kadar,
        //girdigi sayilarin toplamini bulunuz
        Scanner oku = new Scanner(System.in);
        int toplam = 0;
        int sayi;
        do {//dongu arasi sart basta olmadigindan en az 1 kez calisir. kontrol sonda
            System.out.print("Sayi giriniz:");
            sayi = oku.nextInt();
            toplam = toplam + sayi;
        } while (sayi != 0);
        System.out.println("toplam = " + toplam);
    }
}
