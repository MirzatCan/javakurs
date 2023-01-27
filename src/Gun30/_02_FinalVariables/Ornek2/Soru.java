package Gun30._02_FinalVariables.Ornek2;

import java.util.Scanner;

public class Soru {
    // Sabitler isimli bir Class da sabit bir şekilde
    // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
    // bir dakikadaki saniye sayısını tanımlayınız.
    // mainde kullanıcıdan gun, saat, dakika alarak toplam
    // saniyeyi bulunuz.
    public static void main(String[] args) {
        int gun=0;
        int saat=0;
        int dakika=0;

        //1.yontem
        Scanner oku=new Scanner(System.in);
        System.out.print("Gun="); gun= oku.nextInt();
        System.out.print("Saat=");saat= oku.nextInt();
        System.out.print("Dakika=");dakika= oku.nextInt();

        int ToplamSaniye=gun*Sabitler.gunSaat*Sabitler.saatDakika*Sabitler.dakikaSaniye
                +saat*Sabitler.saatDakika*Sabitler.dakikaSaniye
                +dakika*Sabitler.dakikaSaniye;
        System.out.println("Toplam Saniye = " + ToplamSaniye);

        //2.yontem
        System.out.println("Toplam Saniye = " + Sabitler.hesapla(gun,saat,dakika));





    }
}
