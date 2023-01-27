package Gun09;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {
        // Girilen bir öğrencinin notuna göre 50 den büyük-eşit
        // ise geçtiniz, küçük ise kaldınız yazdırınız.
        Scanner sayiOku=new Scanner(System.in);
        System.out.print("notunuz=");
        int not=sayiOku.nextInt();
        if (not>=50)
        {System.out.println("Gectiniz");}
        if (not<50)
        {System.out.println("Kaldiniz");}
    }
}
