package Gun11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        //  Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz

        Scanner sayiOku=new Scanner(System.in);
        System.out.print("sayi giriniz:");
        int sayi1=sayiOku.nextInt();
        System.out.print("sayi giriniz:");
        int sayi2=sayiOku.nextInt();
        System.out.print("sayi giriniz:");
        int sayi3=sayiOku.nextInt();

        System.out.println(Math.max(sayi1,Math.max(sayi2,sayi3)));

    }
}
