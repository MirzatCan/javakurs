package Gun28._01_Constructor;

public class Okul {
    public static void main(String[] args) {

        //1.yol
        Ogrenci org1=new Ogrenci();// nesne olusturma ani
        org1.id=1;  // ozelliklerinin degerlerini veriyorum
        org1.adi="Mirzat";
        org1.soyAdi="memet";
        org1.sinifi=5;
        System.out.println("org1.adi = " + org1.adi);

        //2.yol
        Ogrenci org2=new Ogrenci(2,"xirzat","memet",3);
        System.out.println("org2.adi = " + org2.adi);

        Ogrenci org3=new Ogrenci(3,"tumaris","Mirzat");
        System.out.println("org3.adi = " + org3.adi);
    }
}
