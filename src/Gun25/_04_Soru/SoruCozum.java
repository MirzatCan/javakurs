package Gun25._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class SoruCozum {
    public static void main(String[] args) {
        // Ogretmen için not defteri programı yapılma isteniyor.
        // Her ogrencının okulNo(int), tamAdi(String) ve notu(int) vardır.
        // Öğretmenden 20 öğrenci için bu bilgileri alınız.
        // bütün öğrencileri bir metodda yazdırınız.
        // sınıfın not ortalamasını yine bir metodda yazdırınız.
        // gerekli Class(lar) için ayrı dosya açınız
        Scanner strOku=new Scanner(System.in);
        Scanner intOku=new Scanner(System.in);

        ArrayList<Ogrenci> bilgiler=new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            Ogrenci org=new Ogrenci();
            System.out.print("Ogrenci Okul No:");
            org.okuNo=intOku.nextInt();
            System.out.print("Tam Adi:");
            org.tamAdi=strOku.nextLine();
            System.out.print("Ogrenci Notu:");
            org.not=intOku.nextInt();

            bilgiler.add(org);
        }
        bilgilariYazdir(bilgiler);
        ortalamaniYazdir(bilgiler);
    }

    public static void bilgilariYazdir(ArrayList<Ogrenci> bilgiler){
        for (Ogrenci org:bilgiler) {
            System.out.println("org.okuNo = " + org.okuNo);
            System.out.println("org.tamAdi = " + org.tamAdi);
            System.out.println("org.not = " + org.not);
        }
    }

    public static void ortalamaniYazdir(ArrayList<Ogrenci> bilgiler){
        int toplam=0;
        for (Ogrenci org:bilgiler) {
            toplam=toplam+org.not;
        }
        System.out.println("Ortalamasi= " + toplam/bilgiler.size());
    }

}
