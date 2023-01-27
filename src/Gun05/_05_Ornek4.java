package Gun05;

import java.util.Scanner;

public class _05_Ornek4 {
    public static void main(String[] args) {
        //kullancidan alacaginiz 2 tam sayinin toplamini ekrana yazdiriniz.
        Scanner oku=new Scanner(System.in);

        System.out.print("sayi=");
        int sayi1= oku.nextInt();
        System.out.print("sayi=");
        int sayi2= oku.nextInt();

        int toplam=sayi1+sayi2;

        System.out.println("toplam = " + toplam);


    }
}
