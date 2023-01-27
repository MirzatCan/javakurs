package Gun21;

import java.security.Security;
import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // dizi, array : boyut sayısı belli, sonradan değiştirilemez
        int[] dizi = new int[5]; // Array 5 elemanlı boyutu sonradan değiştirelimiyor

        // Boyutu dinamik olsun, eleman ekledikçe uzasın, sildikçe kısalsın
        // ArrayList : boyutunu başta vermene bile gerek yok, boyutu başlangıçta 0
        // eleman ekledikçe arta, sildikçe kısalır.

        ArrayList<Integer> integerList=new ArrayList<>();
        ArrayList<String> stringList=new ArrayList<>();
        ArrayList<Double> doubleList=new ArrayList<>();

        ArrayList<String> isimler=new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("Mirzat"); //uzunluk1
        isimler.add("sirzat"); //uzunluk2
        isimler.add("medine"); //uzunluk3
        isimler.add("memet");  //uzunluk4

        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size()); // uzunluku veriyor.

        isimler.add(1,"tumaris"); // verilen index e ekliyor, degerleri 1 kayiyor sona doguru
        System.out.println("isimler = " + isimler);

        isimler.set(1,"ayjamal");//verilen index deki elamani degistiriyor
        System.out.println("isimler = " + isimler);

        boolean varMi=isimler.contains("Mirzat"); // var mi?
        System.out.println("varMi = " + varMi);

        isimler.remove("ayjamal"); //degerlere gore siler
        System.out.println("isimler = " + isimler);

        isimler.remove(1);  //rakam verildiginde index olarak kabul ediyor. o rakamlin index degeri siliyor
        System.out.println("isimler = " + isimler);

        int indexOfMedine=isimler.indexOf("medine");
        System.out.println("indexOfMedine = " + indexOfMedine);

        // tip int oldugunda romove yapip silerken 1 girince her zaman index olarak kabul eder.
        // eger eleman olarak silmek istersek sayinin onune (Object) diye belirtmemiz lazim

        String ilkElaman=isimler.get(0); //verilen index deki degeri verir
        System.out.println("ilkElaman = " + ilkElaman);

        isimler.clear(); // her seyi temizler
        System.out.println("isimler = " + isimler);


    }
}
