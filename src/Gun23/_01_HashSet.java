package Gun23;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {
        int sayi=5; // hafizada 1 sayi sakliyor
        int [] dizi=new int[6]; // hafizada 6 sayi saklar
        int [][] tablo=new int[3][20]; // hafizada 60sayi sakliyor,3*20

        //dizi lazim ama buyutu ekledikce artsin, sildikce azalsin
        ArrayList<Integer> liste=new ArrayList<>();// buyu degisken
        ArrayList<ArrayList<Integer>> listelerinListesi=new ArrayList<>(); //2 buyutlu, 2 boyutluda degisken

        //java cim, suana kadar verdigin degisken tipleri icin tesekkur ederim,
        //fakat bana oyle bir dizi verki, hem ArraysList gibi olsun, hem TEKRAR degerleri
        //icine almasin, oyle set ver bana, yani dizi tip ver bana.

        //bu is icin tasarlanmis SET ler adini verdigimiz diziler var
        //HashSet -> sen ekledikce hizli calismak icin kendine gore bir siralamada elamanlari tutar
        //LinkedHashSet -> sen ekledikce EKLENME SIRASINA gore, elemanlari saklar
        //TreeSet -> sen ekledikce onlari her zaman SIRALI tutar
        //bunlarin ortak ozelligi hic TEKRAR deger bulunmaz

        HashSet<Integer> hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(4);
        boolean eklendiMi=hs1.add(5);
        boolean tekrarEklendiMi=hs1.add(5);
        hs1.add(2);

        System.out.println("eklendiMi = " + eklendiMi);
        System.out.println("tekrarEklendiMi = " + tekrarEklendiMi);

        System.out.println("hs1 = " + hs1);



        }
}
