package Gun12;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner sayiOku=new Scanner(System.in);
        System.out.print("sayi1:");
        int sayi1=sayiOku.nextInt();
        System.out.print("sayi2:");
        int sayi2=sayiOku.nextInt();

        System.out.println("toplamak icin T");
        System.out.println("cikarmak icin C");
        System.out.println("carpmak icin P");
        System.out.println("bolmek icin B");

        Scanner strOku=new Scanner(System.in);
        System.out.print("yapmak istediginiz islem:");
        String islem=strOku.nextLine();
        //1.yontem: If yaparak cozum
        if (islem.equalsIgnoreCase("T"))
            System.out.println(sayi1+sayi2);
        if (islem.equalsIgnoreCase("C"))
            System.out.println(sayi1-sayi2);
        if (islem.equalsIgnoreCase("P"))
            System.out.println(sayi1*sayi2);
        if (islem.equalsIgnoreCase("B"))
            System.out.println(sayi1/sayi2);
        //2.yontem:If else kulanarak    (merdivenli If -> ladder If)
        if (islem.equalsIgnoreCase("T"))
            System.out.println(sayi1+sayi2);
        else
            if (islem.equalsIgnoreCase("C"))
                System.out.println(sayi1-sayi2);
            else
                if (islem.equalsIgnoreCase("P"))
                    System.out.println(sayi1*sayi2);
                else
                    if (islem.equalsIgnoreCase("B"))
                        System.out.println(sayi1/sayi2);
                    else
                        System.out.println("gecersiz islem.");



    }
}
