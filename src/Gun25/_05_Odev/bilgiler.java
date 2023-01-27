package Gun25._05_Odev;

import java.util.ArrayList;
import java.util.Scanner;

public class bilgiler {
    public static void main(String[] args) {

        // Bir bordro programı yapılmak isteniyor.
        // Her calisanin bordroNo(int), tamAdi(String) ve maasi(int) vardır.
        // Kullanıcıdan 20 calisan için bu bilgileri alınız.
        // Bir metodda bütün calisanlar yazdırınız.
        // Bir metodda maas ortalamasını yazdırınız.
        // Bir metodda en fazla ve en az maas alanların isimlerini yazdırınız.
        Scanner intOku=new Scanner(System.in);
        Scanner strOku=new Scanner(System.in);


        ArrayList<calisanlar> bilgiler=new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
            calisanlar bilgi=new calisanlar();
            System.out.print("Bordro No:");
            bilgi.bordroNo=intOku.nextInt();
            System.out.print("Tam Adi:");
            bilgi.tanAdi=strOku.nextLine();
            System.out.print("Maasi:");
            bilgi.maasi=intOku.nextInt();

            bilgiler.add(bilgi);
        }

        calisamlarYaz(bilgiler);
        masOrtalamasiYazi(bilgiler);
        enYuksekVeEnDusukMaasAlanlarYaz(bilgiler);

    }
    public static void calisamlarYaz(ArrayList<calisanlar> bilgiler){

        for (calisanlar bilgi:bilgiler) {
            System.out.println("Calisan Tam Adi= " + bilgi.tanAdi);

        }

    }
    public static void masOrtalamasiYazi(ArrayList<calisanlar> bilgiler){
        int toplam=0;
        for (calisanlar bilgi:bilgiler) {
            toplam=toplam+bilgi.maasi;
        }
        int Ortalam=toplam/bilgiler.size();
        System.out.println("Ortalam = " + Ortalam);
    }
    public static void enYuksekVeEnDusukMaasAlanlarYaz(ArrayList<calisanlar> bilgiler){
        int max=0; String maxIsim = null;
        for (calisanlar bilgi:bilgiler) {
            if (bilgi.maasi>max){
                max=bilgi.maasi;
                maxIsim=bilgi.tanAdi;}
        }
        System.out.println("En yuksek alan kisi = " + maxIsim);

        int min=max; String minIsim = null;
        for (calisanlar bilgi:bilgiler) {
            if (bilgi.maasi<max){
                min=bilgi.maasi;
                minIsim=bilgi.tanAdi;}
        }
        System.out.println("En az alan kisi = " + minIsim);



    }
}
