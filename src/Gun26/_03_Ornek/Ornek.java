package Gun26._03_Ornek;

import java.util.Scanner;

public class Ornek {
    // 1-Adım :Rectangle(dikdortgen) isminde ayrı bir dosyada olmak üzere class yazınız.
    //         (properties, fields, özellik, eleman, items) : width(int), length(int)  kisaKenar ve uzunKenar
    // 2-Adım :Çevre bulmak üzere Cevre isminde bir metod yazınız.
    // 3-Adım :Dikdörtgenin alanını bulan Alan isimli bir metod yazınız.
    // 4-Adım :1 tane nesne ye deger vererek metodların sonuçları yazdırınız.

    public static void main(String[] args) {

        Rectangle bilgi=new Rectangle();
        Scanner sayiOku=new Scanner(System.in);
        System.out.print("width giriniz:");
        Rectangle.width=sayiOku.nextInt();

        System.out.print("length giriniz:");
        Rectangle.length=sayiOku.nextInt();

        bilgi.cevre();
        bilgi.alan();
    }
}
