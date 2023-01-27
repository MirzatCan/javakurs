package Gun06;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Cadde, Sokak , PostaKodu(int) ve ülke şeklinde
        // adres bilgisi alarak yazdırınız.
        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);

        System.out.print("Cadde=");
        String Cadde=okuStr.nextLine();//  nextline -> arada bosluk olan cumleler icin
        System.out.print("Sokak=");    //  mirzat bosluk memet gibi.
        String Sokak=okuStr.nextLine();
        System.out.print("Posta kod=");
        int postakod=okuInt.nextInt();
        System.out.print("sehir=");
        String sehir=okuStr.nextLine();
        System.out.print("ulke=");
        String Ulke=okuStr.nextLine();

        System.out.println("Adress = " + Cadde + Sokak + postakod + sehir + Ulke );



    }
}
