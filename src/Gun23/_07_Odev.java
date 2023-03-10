package Gun23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class _07_Odev {
    public static <LinkedHashset> void main(String[] args) {
//        1-Create a method totalCount()
//        totalCount() isminde bir method oluşturun.
//        Parametresi  'Integer Hashset' olmalı
//        HashSetteki eleman sayısını alın.
//        totalCount'u döndürün.
//        _**Örnek:**_
//        hashset ; 4,2,3,1,7
//        cevap: 5
        HashSet<Integer> hst1=new HashSet<>();
        hst1.add(4);
        hst1.add(2);
        hst1.add(3);
        hst1.add(1);
        hst1.add(7);
        System.out.println("Eleman Sayisi="+totalCount(hst1));




//        2- changeSet() isminde bir method oluşturun.
//        Parametre olarak bir String HashSet   ve  iki String
//        return hashset olmalı
//        Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
//        **ÖRNEK:**
//        hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
//        String 1 = **banana**
//        String 2 = **peach**
//        **CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"
        HashSet<String> hst2=new HashSet<>();
        hst2.add("banana");
        hst2.add("strawberry");
        hst2.add("kiwi");
        hst2.add("pineapple");

        String str1="banana";
        String str2="peach";
        System.out.println(changeSet(hst2,str1,str2));


//        3- commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
//        return tipi arraylist olmalı.
//        İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**
//        İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**
//        Ortak değerleri ArrayListe ekleyiniz.
//        çıktı:  "Germany" , "Brazil" ,"USA"
//        ArrayListi yazdırınız.
        HashSet<String> hst3=new HashSet<>();
        hst3.add("Germany");
        hst3.add("England");
        hst3.add("South Africa");
        hst3.add("Brazil");
        hst3.add("USA");

        HashSet<String> hst4=new HashSet<>();
        hst4.add("Germany");
        hst4.add("China");
        hst4.add("Brazil");
        hst4.add("France");
        hst4.add("USA");
        System.out.println(commonValues(hst3,hst4).toString());



//        4-removing() isminde bir method oluşturun.
//        Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
//        Eğer Stringler LinkedHashset 'in içinde varsa, sil.
//        Return tipi linkedhashset
//        Örneğin,
//        linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
//        String 1= Germany
//        String 2 = USA
//        **Germany ve USA 'i sil.**
//        Set'i döndür.
        LinkedHashSet<String> lhst=new LinkedHashSet<>();
        lhst.add("Germany");
        lhst.add("France");
        lhst.add("USA");
        lhst.add("Canada");
        lhst.add("Mexico");
        lhst.add("Brazil");

        String a1="Germany";
        String a2="USA";

        System.out.println(removing(lhst,a1,a2));


//        5- 2D ArrayList
//        Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
//        Store all the elements in one arraylist and print the arraylist
//        Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
//        **Örnek:**
//        ```
//        **Girdi:**
//        [
//        [ 1, 2, 3 ],
//        [ 4, 5, 6 ],
//        [ 7, 8, 9 ]
//                  ]
//        **Çıktı:** [1,2,3,4,5,6,7,8,9]
//        ```

        int[][] arry032d= {{1, 2, 3 },  { 4, 5, 6 },  { 7, 8 ,9}};
        int elaman=0;
        for (int[] satir: arry032d) {
            for (int a: satir) {
                elaman++;
            }
        }
        System.out.println("elaman = " + elaman);
        int[] tumu=new int[elaman];
        int sayac=0;
        for (int i = 0; i < arry032d.length; i++) {
            for (int j = 0; j < arry032d[i].length; j++) {
                tumu[sayac]=arry032d[i][j];
                sayac++;
            }
        }
        System.out.println("tumu = " + Arrays.toString(tumu));
//
//
//
//        Özel Soru:
//        6- Bir HashSet i mainde tanımlayınız. Daha Sonra bir fonksiyonda
//        random olarak toplamı 10 tane olacak şekilde 1 den 20 e kadar olan
//        sayılarla doldurunuz. Set i main de yazdırınız.

        HashSet<Integer> hstsayi=new HashSet<>();
        randomSayiEkle(hstsayi);
        System.out.println("hstsayi = " + hstsayi);
    }
    public static HashSet<Integer> randomSayiEkle(HashSet<Integer> hstsayi){
        while (hstsayi.size()<10){
            hstsayi.add((int)(Math.random()*20));
        }
        return hstsayi;
    }
    public static int totalCount(HashSet<Integer> hst){
        int elamanSyi=0;
        for (int i = 0; i < hst.size(); i++) {
            elamanSyi++;
        }
        return elamanSyi;
    }
    public static HashSet<String> changeSet(HashSet<String> hst2, String s1, String s2){
        if (hst2.contains(s1)) {
            hst2.remove(s1);
            hst2.add(s2);
        }

        return hst2;
    }
    public static ArrayList<String>commonValues(HashSet<String> hst3,HashSet<String> hst4){
        ArrayList<String> ortakDeger=new ArrayList<>();
        for (String hst3E:hst3) {
            for (String hst4E:hst4) {
                if (hst3E.equals(hst4E))
                    ortakDeger.add(hst3E);
            }
        }
        return ortakDeger;
    }
    public static LinkedHashSet<String>removing(LinkedHashSet<String> lhst,String a1,String a2){
        lhst.remove(a1);
        lhst.remove(a2);
        return lhst;
    }


}
