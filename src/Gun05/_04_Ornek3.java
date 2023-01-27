package Gun05;

import java.util.Scanner;

public class _04_Ornek3 {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını ayrı ayrı okutarak alıp
        // birlikte ekrana yazdırnız.

        Scanner adSoyad = new Scanner(System.in);

        System.out.print("adiniz=");
        String ad=adSoyad.next();
        System.out.print("soyadiniz=");
        String soyad=adSoyad.next();

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("Adiniz ve soyadiniz = " + ad+" "+ soyad);








    }
}
