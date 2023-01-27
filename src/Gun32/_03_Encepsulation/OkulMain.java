package Gun32._03_Encepsulation;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Scanner strOku=new Scanner(System.in);
        Scanner intOku=new Scanner(System.in);

        Okul yeniOkul=new Okul("Yildiz teknik",3);

        System.out.println("Kontencan= " + yeniOkul.getKontencan());

        do {
            System.out.print("Adiniz:"); String ad=strOku.nextLine();
            System.out.print("yasiniz:");int yas=intOku.nextInt();
            System.out.print("sinifiniz:"); String sinif=strOku.nextLine();

            if (yas<15){
                Ogrenciler org=new Ogrenciler(ad,yas,sinif);
                yeniOkul.getOrg().add(org);
            }
            else
                System.out.println("Ogrenci yasi okul icin uygun degil");


        }while (yeniOkul.getOrg().size()<yeniOkul.getKontencan());

        System.out.println("yeniOkul.getOrg() = " + yeniOkul.getOrg());



    }
}
