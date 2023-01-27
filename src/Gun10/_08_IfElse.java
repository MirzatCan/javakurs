package Gun10;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123

        Scanner strOku=new Scanner(System.in);
        System.out.print("aralarına bir boslukla 3 sayi giriniz:");
        String sayilar=strOku.nextLine();

        int boslukIndex1=sayilar.indexOf(" ");
        int boslukIndex2=sayilar.lastIndexOf(" ");

        int sayi1=Integer.parseInt(sayilar.substring(0,boslukIndex1));
        int sayi2=Integer.parseInt(sayilar.substring(boslukIndex1+1,boslukIndex2));
        int sayi3=Integer.parseInt(sayilar.substring(boslukIndex2+1));

        if ((sayi1+sayi2+sayi3)%2==0)
            System.out.println("cift");
        else
            System.out.println("tek");

    }
}
