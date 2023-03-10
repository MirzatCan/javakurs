package Gun20;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

public class _07_Odev {
    public static void main(String[] args) {
//        1-Ismi **randomNum** olan bir method oluşturun.
//        Parametre olarak **int max** almalı.
//        Bu method, 0 ile max arasında random bir değer döndürmelidir.
//        Random numarayı döndürünüz.
          randomNum(50);

//        2-"OrtaKelime" isminden bir method oluşturun.
//        Bu method String'i parametre olarak almalı.
//        Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
//        Ortadaki kelimeyi return yapınız.
//        Örnek: Ben Java'yı seviyorum.
//        print : Java'yı
//        Örnek2:
//        Java'yı kolayca öğreniyorum.
//        print: kolayca
          OrtaKelime("Benim Adim Mirzat");


//        3-reverseString isminde bir method oluşturun.
//        Bu method bir String'i parametre olarak alsın.
//        Ve bu method, girilen String'i tersten yazsın.
//        Terste yazılmış halini yazdırınız.
//        Örn: String = "Java'yı Seviyorum."
//        Print: .muroyiveS ıy'avaJ
          reverseString("Benim Adim Mirzat");



//        4-adı  reverseWord olan bir method oluşturun
//        Bu methodun String olarak bir parametresi olmalıdır
//        Ve bu cümledeki kelimelerle tersine çevirmeli
//        Ters halini yazdırın.
//        Örnek 1 :
//        Dize: Java yazın
//        dönüş şöyle olmalıdır:  yazın Java
        reverseWord("Benim Adim Mirzat");



//        5- EvenOddNums isminde bir method oluşturun.
//        Bu yöntem String olan bir parametreyi kabul etsin.
//        Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
//        Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
//        toplam sonucu yazdırın.
//        **İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.**
//        For example Örnek:
//        String =  "6678421312"
//        6+6-7+8+4+2-1-3-1+2
//        sonuç 16 olmalı
        EvenOddNums("6678421312");


//        6-Girilen bir diziyi tersten yazdıran bir metod yazınız.
        String[] dizi={"M","I","R","Z","A","T"};
        DiziYazdir(dizi);



//        7-powerOfThree isminde bir method oluşturun.
//        Parametre olarak int
//        Return tipi boolean
//        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
//        **Örnek 1:**
//        ```
//        **Girdi:** 27
//        **Çıktı:** true
//        ```
//        ```
//        Açıklama: 3*3*3 =27
//        ```
//        ```
//        Sonuç= true
//        ```

        System.out.println();
        System.out.println(powerOfThree(125001));


//        8-`append adında bir method oluşturun.`
//        `Parametre olarak iki int array  oluşturun.`
//        ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
//        Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
//        Bunu döndürmelidir:
//        {2, 4, 6, 1, 2, 3, 4, 5}.

        int[] arry1={2, 4, 6};
        int[] arry2={1, 2, 3, 4, 5};
        append(arry1,arry2);



//        9-**isUnique** adında bir method oluşturun.
//        Parametre olarak int array alır.
//        ve bu dizideki değerlerin benzersiz olup olmadığını gösteren bir boolean değeri döndürür (benzerlik yoksa true, var ise false).
//        örneğin, list isminde bir array'imiz varsa,
//        ```
//        int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
//        ```
//        Bu listede yinelenen eleman olmadığı için sonuç true dönmelidir.
//        ```
//        int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
//        ```
//        Bu listede eleman 3, iki tane olduğu için sonuç false dönmelidir.
        int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
        int[] list2 = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
        System.out.println();
        System.out.println(isUnique(list));
        System.out.println(isUnique(list2));




    }
    public static int randomNum(int max) {
        int rnd = (int) (Math.random() * max);
        System.out.println("rnd = " + rnd);
        return rnd;
    }
    public static String OrtaKelime(String cumle){
        String [] kelime=cumle.split(" ");
        String sonKelime = null;
        for (int i = 0; i <kelime.length; i++) {
            sonKelime=kelime[(int) (kelime.length/2)];
        }
        System.out.println("sonKelime = " + sonKelime);

        return sonKelime;
    }
    public static String reverseString(String cumle2) {
        System.out.print("Tersi:");
        for (int i = cumle2.length()-1; i >=0 ; i--) {
            System.out.print(cumle2.charAt(i));
        }
        return cumle2;
    }
    public static String reverseWord(String cunle3){
        System.out.println();
        System.out.print("ters cumle:");
        String [] kelimeler=cunle3.split(" ");
        for (int i =kelimeler.length-1; i>=0 ; i--) {
            System.out.print(kelimeler[i]+" ");
        }

        return cunle3;
    }
    public static void EvenOddNums( String sayi) {
        long lSayi = Long.parseLong(sayi);
        int sonuc = 0;
        do {
            if ((lSayi%10)%2==0)
                sonuc+=lSayi%10;
            else
                sonuc-=lSayi%10;
            lSayi=lSayi/10;
        }while (lSayi>0);
        System.out.println("sonuc = " + sonuc);

    }
    public static void DiziYazdir(String[] dizi){
        for (int i = dizi.length-1; i >=0; i--) {
            System.out.print(dizi[i]);
        }
    }
    public static boolean powerOfThree(int ustu3Mu){
        for (int i = 0; i < ustu3Mu; i++) {
            if (i * i * i == ustu3Mu)
                return true;
        }
        return false;
    }
    public static void append(int[] arry1,int[] arry2){
        int [] arry3 = new int[arry1.length+arry2.length-1];
        for (int i = 0; i < arry1.length; i++) {
            arry3[i]=arry1[i];
        }
        for (int i = 0; i < arry2.length; i++) {
            arry3[(i+arry1.length)-1]=arry2[i];
        }
        for (int i = 0; i < arry3.length; i++) {
            System.out.print(arry3[i]+" ");
        }

    }
    public static boolean isUnique( int[] lists){
        for (int i = 0; i < lists.length; i++) {
            for (int j = 0; j < lists.length; j++) {
                if (i!=j && lists[i]==lists[j])
                    return false;
            }
        }

        return true;
    }
}
