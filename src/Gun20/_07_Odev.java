package Gun20;

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



//        6-Girilen bir diziyi tersten yazdıran bir metod yazınız.





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




//        8-`append adında bir method oluşturun.`
//        `Parametre olarak iki int array  oluşturun.`
//        ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
//        Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
//        Bunu döndürmelidir:
//        {2, 4, 6, 1, 2, 3, 4, 5}.




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





}
