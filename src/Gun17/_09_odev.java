package Gun17;

import java.util.Arrays;

public class _09_odev {
    public static void main(String[] args) {
        // 1.Bu String'i oluşturun. "Removes white space from both ends of a string"
        // String'deki kelime sayısını yazdırınız.
        String cumle1="Removes white space from both ends of a string";
        System.out.println("cumle1 = " + cumle1);
        String [] kelimeler=cumle1.split(" ");
        for (int i = 0; i < kelimeler.length; i++)
            System.out.println((i + 1) + ".kelime=" + kelimeler[i]);
        System.out.println("kelime sayisi:"+kelimeler.length);

        //2.Bir String oluşturun : "Hello World"
        //Stringi tersten yazdırın ve print edin.
        //_Cevap böyle olmalı :  "dlroW olleH"
        String cumle2="Hello World";
        System.out.print("ters hali:");
        for (int i = cumle2.length(); i >0; i--) {
            System.out.print(cumle2.charAt(i-1));

        }
        System.out.println();
        //3.İnt Array oluştur ve elemanları   : 25,30,30,35,100
        //Array in elemanlarının toplamını yazdır.
        //Cevap 220 olmalı.
        int [] sayilar={25,30,30,35,100};
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam=toplam+sayilar[i];
        }
        System.out.println("toplam = " + toplam);

        //4.int Array oluşturun.
        //elemanları : 13, 15,14,16,16
        //Arrayin elemanlarını yazdırın.
        int []sayilar4={13,15,14,16,16};
        for (int i = 0; i < sayilar4.length; i++) {
            System.out.println("sayi"+(i+1)+":"+sayilar4[i]);
        }

        //5.String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
        //Array'daki eleman sayısını yazdırınız.
        //Cevap 4 olmalı.
        String[] dizi={"new jersey" , "new york", "boston","California"};
        System.out.println("elaman sayisi=" + dizi.length);

        //6.String Array (Dizi) oluşturunuz.
        // elemanları : Apple, Orange , Babana, Kiwi
        //Array'leri tüm elemanları yazdırınız.
        String[] dizi6={"Apple","Orange","Babana","Kiwi"};
        for (int i = 0; i < dizi6.length; i++) {
            System.out.println((i+1)+".elaman:" + dizi6[i]);
        }

        //7.int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        //Array'in ortalamasını alınız.
        int [] sayilar7={12, 14 , 21 ,23 , 10 ,4};
        int toplam7=0;
        for (int i = 0; i < sayilar7.length; i++) {
            toplam7=toplam7+sayilar7[i];
        }
        int oratalama=toplam7/sayilar7.length;
        System.out.println("oratalama = " + oratalama);

        //8.int Array oluşturun ve elemanları : 5,6,8,12,14,19
        //Eğer sayı çiftse topla, tekse çıkar.
        //**Örneğin:**
        //**-5 + 6 + 8 + 12 + 14 - 19 = 16**
        //Toplamlarını yazdırın.
        int[] sayilar8={5,6,8,12,14,19};
        int toplam8=0;
        for (int i = 0; i < sayilar8.length; i++) {
            if (sayilar8[i]%2==0)
                toplam8=toplam8+sayilar8[i];
            else
                toplam8=toplam8-sayilar8[i];
        }
        System.out.println("toplam8 = " + toplam8);

        //9.int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
        int [] sayilar9={15,25,22,18,30};
        Arrays.sort(sayilar9);
        System.out.println("En buyuk 2.elaman=" + sayilar9[sayilar9.length-2]);

        //10.int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        //En küçük (minimum) sayıyı yazdırınız.
        int [] sayilar10={14,19,5,21};
        Arrays.sort(sayilar10);
        System.out.println("En kucuk sayi=" + sayilar10[0]);

        //11.int Array oluşturun ve elemanları : 12,2,5,15,8
        //En büyük değeri yazdırınız.
        int[] sayilar11={12,2,5,15,8};
        int enBuyuk=sayilar11[0];
        for (int i = 1; i < sayilar11.length; i++) {
            if (enBuyuk<sayilar11[i])
                enBuyuk=sayilar11[i];
        }
        System.out.println("enBuyuk = " + enBuyuk);

        //12.String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        //Eğer aitse "true" çevirin.
        //Loops (döngüler) kullanın.
        String [] cumle12={"Apple","Orange","Babana","Pineapple"};
        boolean varMI=false;
        for (int i = 0; i < cumle12.length; i++) {
            if (cumle12[i]=="Apple") {
                varMI = true;
                System.out.println("var mi=" + varMI);
            }
        }
        if (!varMI)
            System.out.println("varMI = " + varMI);

        //13.Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        //$ işaretlerini kaldırın ve sayıları toplayın.
        //Sayıların toplamını yazdırın.
        String sayilar13="$12 $23 $10 $2 $5 $2";
        String dolarYok=sayilar13.replace("$","");
        System.out.println("dolarYok = " + dolarYok);
        String[] parcalar=dolarYok.split(" ");

    }
}
