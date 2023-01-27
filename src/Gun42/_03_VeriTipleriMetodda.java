package Gun42;

import java.util.Arrays;

public class _03_VeriTipleriMetodda {
    public static void main(String[] args) {
        // ilkel tip
        int sayi=5;
        sayiartir(sayi);
        System.out.println("sayi = " + sayi); //5. cunku sayi hala 5 metod ile iliskisi yok

        //referans tip
        int[] dizi={1,2,3};
        diziSifirla(dizi);
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));
        //dizi degeri degisti motod ile degisti


        String ad="Mirzat";
        stringSifirla(ad);
        System.out.println("ad = " + ad); // referans tipi ama ilker tip gibi calisir degerler degismez

    }
    public static void sayiartir(int sayi){ //buraya sayi mi gelir 5 mi gelir? 5 gelir
        sayi++; //6
    }
    public static void diziSifirla(int[] dizi){
        dizi[0]=0;
        dizi[1]=0;
        dizi[2]=0;
    }
    public static void stringSifirla(String ad){
        ad="";
    }
}
// Özet: Temel fark:
// 1- İlkel tipler sadece 1 değer saklarlar, bu yüzden metodlara sadece değeri gider.Eşitlendiğinde sadece değer aktarılır.
// 2- Nesne tipler İlkel tipten tek farkı NULL değeri alabilmeleri, bu yüzden ilkel tip gibi davranırlar
// 3- Referans tipler metoda gönderildiklerinde kendileri giderler. Eşitlemelerde referanslar eşitlenir.
