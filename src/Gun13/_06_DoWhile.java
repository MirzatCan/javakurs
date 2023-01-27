package Gun13;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {
        //kulanici 0 degerini girene kadar,
        //girdigi sayilarin toplamini bulunuz
        Scanner oku=new Scanner(System.in);
        int toplam=0;

        System.out.println("Sayi giriniz:");
        int sayi= oku.nextInt();
        toplam=toplam+sayi;
        while (sayi!=0){
            System.out.println("Sayi giriniz:");
            sayi= oku.nextInt();
            toplam=toplam+sayi;
        }
        System.out.println("toplam = " + toplam);

    }
}
