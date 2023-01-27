package Gun26._01_Ornek;

import Gun26._01_Ornek.okul;

public class Kampus {
    public static void main(String[] args) {
        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)  -> tip
        // Ogrenci : okulNo, tamAd, okulu  -> Tip

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz
        // atayıp  yazdırınız.

        Orenci org=new Orenci();
        org.okulNo=1;
        org.tamAdi="Mirzat memet";


        //1.yontem
        okul okulBilgi=new okul();
        okulBilgi.adi="Yildiz teknik unversitesi";
        okulBilgi.mudurAdi="yilmaz erdogan";
        okulBilgi.ucreti=50000;
        org.okulu=okulBilgi;


        //2.yontem
        org.okulu=new okul();
        org.okulu.adi="Yildiz teknik unversitesi";
        org.okulu.mudurAdi="yilmaz erdogan";
        org.okulu.ucreti=5000;



        System.out.println("org.okulNo = " + org.okulNo);
        System.out.println("org.tamAdi = " + org.tamAdi);
        System.out.println("org.okulu.adi = " + org.okulu.adi);
        System.out.println("org.okulu.mudurAdi = " + org.okulu.mudurAdi);
        System.out.println("org.okulu.ucreti = " + org.okulu.ucreti);


        org.bilgiYazdir();// Ogrenci class da yazdirma modulu kunarak da kulanabiliriz.
    }
}
