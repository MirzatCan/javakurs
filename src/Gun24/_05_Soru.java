package Gun24;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_Soru {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        System.out.println("Menü\n1-Ekleme\n2-Düzeltme\n3-Listeleme\n4-Arama\n5-Silme\n6-Çıkış");


        HashMap<Integer, String> menu = new HashMap<>();
        menu.put(1, "Ekleme");
        menu.put(2, "Düzeltme");
        menu.put(3, "Listeleme");
        menu.put(4, "Arama");
        menu.put(5, "Silme");
        menu.put(6, "Çıkış");

        TreeMap<String,String> sozluk=new TreeMap<>();

        int sayi;
        Scanner sayiOku = new Scanner(System.in);
        Scanner yaziOku = new Scanner(System.in);

        do {
            System.out.print("yapmak istdiginiz islem giriniz:");
            sayi = sayiOku.nextInt();

             switch (sayi){
                 case 1: {System.out.println(menu.get(sayi));
                     System.out.print("kelime:");
                     String kelime=yaziOku.nextLine();
                     System.out.print("manasi:");
                     String manasi=yaziOku.nextLine();
                     sozluk.put(kelime,manasi);
                 }break;
                 case 2: {System.out.println(menu.get(sayi));
                     System.out.print("kelime:");
                     String kelime=yaziOku.nextLine();
                     System.out.println("manasi = " +sozluk.get(kelime));
                     System.out.print("Duzeltiniz:");
                     String yeniManasi=yaziOku.nextLine();
                     sozluk.put(kelime,yeniManasi);
                 }break;
                 case 3: {System.out.println(menu.get(sayi));
                     for (Map.Entry<String, String> stringStringEntry : sozluk.entrySet()) {
                         System.out.println(stringStringEntry.toString());
                     }
                 }break;
                 case 4: {System.out.println(menu.get(sayi));
                     System.out.print("Kelime ara:");
                     String arama=yaziOku.nextLine();
                     System.out.println("manasi="+sozluk.get(arama));
                 }break;
                 case 5: {System.out.println(menu.get(sayi));
                     sozluk.clear();
                 }break;
                 case 6: {System.out.println(menu.get(sayi));
                 }break;
             }
        } while (sayi != 6);

        // metod kulanmadan yaptim


        // TODO : geri kalan menu işlemleri yapılacak
        // TODO :  2.Aşama menulerde yapılacak işlemleri METOD ile yapınız.


    }
}
