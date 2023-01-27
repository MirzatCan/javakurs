package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        // Girilen iki sayıdan büyük olanını değerini ekrana yazdırınız,
        // eşit ise eşit yazdırınız.
        Scanner sayioku=new Scanner(System.in);
        System.out.print("sayi1 giriniz=");
        int sayi1=sayioku.nextInt();
        System.out.print("sayi2 giriniz=");
        int sayi2=sayioku.nextInt();
        if (sayi1>sayi2)
        {System.out.println(sayi1);}
        if (sayi1<sayi2)
        {System.out.println(sayi2);}
        if (sayi1==sayi2)
        {System.out.println("Esit");}
    }
}
