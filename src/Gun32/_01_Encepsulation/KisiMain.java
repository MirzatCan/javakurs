package Gun32._01_Encepsulation;

public class KisiMain {
    public static void main(String[] args) {
        Kisi k1=new Kisi();
        k1.adi="Mirzat";
        k1.soyAdAta("memet");
        //k1.soyAdi="Memet";
        // k1.yas=-25; burda kullanici yanli girdi -25 girdi
        k1.yasAta(-25);
        k1.yasAta(24);


        System.out.println("k1.yasVer() = " + k1.yasVer());
        //yas  privete diye kapatildi ama ayri bir metod yaparak kulandik

        System.out.println("k1 = " + k1);

        //degiskene direk erisimi kapatip
        //bir metod ile korumali veri gonderme ve alma
        // islemine Encepsulation denir


    }
}
