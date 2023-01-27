package Gun11;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner sayiOku=new Scanner(System.in);
        System.out.print("uretilecek sayi siniri=");
        int sinir=sayiOku.nextInt();

        int tutulacakSayi=(int)(Math.random()*sinir);
        System.out.print("Tahmininiz=");
        int sayi=sayiOku.nextInt();

        if (sayi==tutulacakSayi)
            System.out.println("Tebrikler");
        else
            System.out.println("bilemediniz");
    }
}
