package Gun12;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        // Daha önce çözdüğünüz hesap makinesi sorusunu,
        // switch ile çözünüz.

        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner sayiOku=new Scanner(System.in);
        System.out.print("sayi1:");
        int sayi1=sayiOku.nextInt();
        System.out.print("sayi2:");
        int sayi2=sayiOku.nextInt();

        Scanner strOku=new Scanner(System.in);
        System.out.print("yapmak istediginiz islem:");
        String islem=strOku.nextLine();
        switch (islem.toLowerCase()){
            case "t": System.out.println(sayi1+sayi2);break;
            case "c": System.out.println(sayi1-sayi2);break;
            case "p": System.out.println(sayi1*sayi2);break;
            case "b": System.out.println(sayi1/sayi2);break;
            default: System.out.println("gercersiz islem");
        }
    }
}
