package Gun05;

import java.util.Scanner;

public class _03_Ornek2 {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını alarak ekrana yazdırınız

        Scanner oku = new Scanner(System.in); // okuma islemini yapacak olan degisken tanimlandi

        System.out.print("adiniz ve soyadiniz =");// ekran neyin girlecegini yazdik bilgilendirme
        String adSoyad= oku.nextLine();//okuma islemi bu noktada yapiliyor

        System.out.println("adSoyad = " + adSoyad);//verinin gercekten okunabildigini
        // tekrar ekrana yazarak kontrol ettim.
    }
}
