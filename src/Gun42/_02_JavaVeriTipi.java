package Gun42;

import java.util.Arrays;

public class _02_JavaVeriTipi {
    public static void main(String[] args) {
        // ilker tipler yani primitve tipler: short, byte, int , long,float, doble, boolean
        int sayi1=5;
        int sayi2=10;

        sayi1=sayi2; // esitlesen degerler ayni ama kendi hucreleri
        sayi1=34;    //ayri kalir, sayi1, sayi2 ayri yer kulanir,
        sayi2=45;    //deger saklayan yer ayri yer kulanir
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        //Referans tipler

        int[] dizi1={1,2,3,4};
        int[] dizi2={5,6};
        System.out.println("dizi1 = " + Arrays.toString(dizi1));
        System.out.println("dizi2 = " + Arrays.toString(dizi2));

        //burda esitledik dizi1, dizi2 isimler ayri yerde saklanir
        //ama dizi2 yi dizi1 e esitledigimiz icin dizi bir dizi2 nin
        //deger sakladigi yeri kulanir. kendi degeri sakladi yer silinir
        dizi1=dizi2;
        System.out.println("dizi1 = " + Arrays.toString(dizi1));
        System.out.println("dizi2 = " + Arrays.toString(dizi2));

        //burda dizi1 nin ilk dergi degistirsek.
        //dizi1 ile dizi2 ayni deger saklayan yeri kuandigu icin
        //ikisi de degisir.
        dizi1[0]=67;
        System.out.println("dizi1 = " + Arrays.toString(dizi1));
        System.out.println("dizi2 = " + Arrays.toString(dizi2));

        dizi2[0]=55;
        System.out.println("dizi1 = " + Arrays.toString(dizi1));
        System.out.println("dizi2 = " + Arrays.toString(dizi2));

        //String, Intenger ,Double , Long
        //bunlar da Referans tipler, isim aliniyor.
        //ama ilker tipler gibi calisir. her isimin kendi deger saklama yeri var
        String ad1="Mirzat";
        String ad2="Xirzat";

        ad1=ad2;
        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);

        ad1="Tumaris";
        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);

    }
}
