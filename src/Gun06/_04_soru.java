package Gun06;

import java.util.Scanner;

public class _04_soru {
    public static void main(String[] args) {
        //girilen  bir stringin sadece son hHarfini yazdiriniz.
        Scanner okuStr=new Scanner(System.in);

        System.out.print("Bir cumle giriniz=");
        String cumle=okuStr.nextLine();

        //   01234 -> hariflarin oda numarasi: index
        //   bugun -> son harfi oda numarasinin uzunlugunun-1  olur
        int uzunluk=cumle.length();
        char sonHarf=cumle.charAt(uzunluk-1);

        System.out.println("sonHarf = " + sonHarf);

        //2.yontem
        System.out.println("son Harf=" + cumle.charAt( cumle.length()-1));

    }
}
