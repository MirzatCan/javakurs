package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen vize(%50) ve final(%50) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        // 2 tane sinav var tolamini 2 ye bol.  ortalamasi
        //final kelimesi javaya ait kelime

        Scanner sayiOku=new Scanner(System.in);
        System.out.println("Vize Not=");
        System.out.println("Final Not=");
        int vize=sayiOku.nextInt();
        int finalNot=sayiOku.nextInt();
        double ortalama=(vize+finalNot)/2;

        if (ortalama>=60)
            System.out.println("Gectiniz");
        else
            System.out.println("kaldiniz");


    }
}
