package Gun39._05_OPP_Soru;

import Utility.MyFunc;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        ArrayList<IFood> siparis=new ArrayList<>();
        Scanner sayiOku=new Scanner(System.in);
        int secenek = 0;
        do {
            System.out.println("Menü*");
            System.out.println("1-Adana Kebap (55 TL)");
            System.out.println("2-Lahmacun (33 TL)");
            System.out.println("3-Borsh (33 TL)");
            System.out.println("4-Palov (44 TL)");
            System.out.println("0-Tamam");
            System.out.print("Seciminiz:");
            secenek=sayiOku.nextInt();
            switch (secenek){
                case 1:IFood ak=new AdanaKebab();
                       siparis.add(ak);
                       break;

                case 2:IFood lh=new Lahmacun();
                       siparis.add(lh);
                       break;

                case 3: IFood bo=new Borsh();
                        siparis.add(bo);
                        break;

                case 4:IFood pa=new Palov();
                       siparis.add(pa);
                       break;
            }
        }while (secenek!=0);

        System.out.println("Alinan siparisler");
        for (IFood s:siparis) {
            System.out.println(s.getClass().getSimpleName());
        }

        System.out.println("Siparis Hazirlaniyor");
        MyFunc.bekle(2); //2 saniye bekleme islemi
        double toplam=0;
        for (IFood s:siparis) {
            TecniKetche.Hazirla(s);
            toplam+=s.ucret();
        }
        System.out.println("toplam = " + toplam);
    }
}
