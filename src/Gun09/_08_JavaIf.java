package Gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        Scanner sifreOku=new Scanner(System.in);
        System.out.print("Sifre giriniz:");
        String sifre=sifreOku.nextLine();
        System.out.print("Tekrar girini:");
        String tekrarsifre=sifreOku.nextLine();

        //1.yontem
        if (sifre.equals(tekrarsifre))
        {System.out.println("ayni");}
        if (!sifre.equals(tekrarsifre))
        {System.out.println("degil");}

        //2.yontem
        boolean esitmi=sifre.equals(tekrarsifre);
        if (esitmi==true)
        {System.out.println("ayni");}
        if (esitmi==false)
            System.out.println("degil");




    }
}
