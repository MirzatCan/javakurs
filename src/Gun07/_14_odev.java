package Gun07;

import java.util.Scanner;

public class _14_odev {
    public static void main(String[] args) {
        // 1. "I love java" olan bir String oluşturun.
        // Bu cümlenin toplam karakter sayısını yazdırın.
        String soru1="I love you";
        System.out.println("Karakter sayisi=" + soru1.length());

        // 2."Sprint planning" olan bir String oluşturun.
        // Bu dizenin _toplam karakter sayısını_ yazdırın.
        String soru2="Sprint planning";
        System.out.println("Karakter sayisi=" + soru2.length());
        
        // 3."apple" olan bir String oluşturun.
        // String'in içinde app olup olmadığını doğrula.
        String soru3="apple tv";
        System.out.println("soru3.contains(\"app\") = " + soru3.contains("app"));

        //4."orange" kelimesinden oluşan bir String oluşturun.
        // String'in Apple'a eşit olup olmadığını doğrulayın.
        String soru4="orange";
        System.out.println("soru4.equals(\"Apple\") = " + soru4.equals("Apple"));
        
        //5."apple"  olan  bir String oluşturun.
        // String'in apple'a eşit olup olmadığını doğrulayın.
        // Büyük harf veya küçük harf önemli değildir._
        String soru5="apple";
        System.out.println("soru5.equalsIgnoreCase(\"Apple\")) = " + soru5.equalsIgnoreCase("Apple"));
        
        //6."Florida" kelimesinden bir String oluşturun.
        // Florida kelimesinin içindeki, sadece  o harfinin bulunduğu indexini yazdırın.
        String soru6="Florida guzel";
        System.out.println("soru6.indexOf(\"F\") = " + soru6.indexOf("o"));
        
        // 7."Thank you" olan bir String oluşturun.
        // Thank you içindeki, sadece  "y" harfinin bulunduğu konumu yazdırın.
        String soru7="Thank you very much";
        System.out.println("soru7.substring(13,14) = " + soru7.substring(13,14));
        // 8.Main method oluşturun.
        //"Mouse" değerinde bir String oluştur.
        //Mouse String'inin 3. sırasındaki karakteri yazdırın.
        
        // 9."paper" olan bir String oluşturun.
        //String'i büyük harfe çevirin ve yazdırın.
        //örn: apple > APPLE
        String soru9="paper";
        System.out.println("soru9.toUpperCase() = " + soru9.toUpperCase());
        // 10."OraNge" olan bir String oluşturun.
        // String'i _küçük harfe_ çevirin ve yazdırın.
        // örn: APPLE > apple
        String soru10="OraNge";
        System.out.println("soru10.toLowerCase() = " + soru10.toLowerCase());
        // 11."New Jersey" olan bir String oluşturun.
        // Stringi büyük harfe  çevirin ve yazdırın
        String soru11="New Jersey";
        System.out.println("soru11.toUpperCase() = " + soru11.toUpperCase());
        // 12."New York"olan bir String oluşturun.
        // String'i küçük harfe çevirin ve yazdırın.
        String soru12="New York";
        System.out.println("soru12.toLowerCase() = " + soru12.toLowerCase());
        // 13."PADDLE" olan bir String oluşturun.
        //  String'i küçük harfe çevirin ve yazdırın.
        String soru13="PADDLE";
        System.out.println("soru13.toLowerCase() = " + soru13.toLowerCase());

        //Özel sorular
        //1- Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.
        Scanner okuStr=new Scanner(System.in);
        System.out.print("Adiniz=");
        String oku=okuStr.nextLine();
        System.out.print("Soyadiniz=");
        String oku1=okuStr.nextLine();
        System.out.println("Adsoyadiniz= " + oku+" "+oku1);
        //2- Girilen bir kelimenin boş(Blank) olup olmadığını yazdırınız
        Scanner okubos=new Scanner(System.in);
        System.out.print("kelime giriniz:");
        String bosmu=okubos.nextLine();
        System.out.println("bosmu = " + bosmu.isEmpty());
        //3- girilen bir cümledeki A harfi sayısını bulunuz.(Büyük küçük harf ayırımı olmadan)
        Scanner okucumle=new Scanner(System.in);
        System.out.print("Bir cumle giriniz:");
        String kacAvar=okucumle.nextLine();
        String A=kacAvar.replaceAll("[^a^]","");
        System.out.println("A.length() = " + A.length());
        //4- girilen bir kelimenin ilk ve son harfini bulunuz.
        Scanner kelimeOku=new Scanner(System.in);
        System.out.print("Kelime giriniz:");
        String kelime=kelimeOku.nextLine();
        System.out.println("ilk harf = " + kelime.charAt(0) + "  son harf = " + kelime.charAt(kelime.length()-1) );
        //5- girilen bir cümledeki ilk kelimeyi yazdırınız
        Scanner okucumle15=new Scanner(System.in);
        System.out.print("bir cumle giriniz:");
        String soru15=okucumle15.nextLine();
        System.out.println("ilk kelimesi = " + soru15.substring(0,soru15.indexOf(" ")));

        //6- girilen en az 3 kelimelik bir cümledeki ilk iki kelimeyi yazdırınız
        Scanner kelime3oku=new Scanner(System.in);
        System.out.println("en az uc kelimelik cumle giriniz:");
        String soru16=kelime3oku.nextLine();
        System.out.println("Ilk 2 kelime= " + soru16.substring(0,soru16.indexOf(" "))
        + soru16.substring(soru16.indexOf(" "),(soru16.indexOf(" ",(soru16.indexOf(" ")+1))))) ;
        //7- Girilen bir cümlede kaç kelime olduğunu bulunuz
        Scanner kacCumleoku=new Scanner(System.in);
        System.out.println("bir cumle giriniz:");
        String kackelime=kacCumleoku.nextLine();
        String bosluk=kackelime.replaceAll("[^ ^]","");
        int kac=bosluk.length();
        System.out.println("kac = " + (kac+1));

        //8- Girilen bir cumledeki kelimelerin ilk harflerini yazdırınız
        Scanner okusoru18=new Scanner(System.in);
        System.out.println("cumle giriniz:");
        String soru18=okusoru18.nextLine(); // benim adim mirzat


        //9- 3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.E.Y. şeklinde yazınız.
























    }
}
