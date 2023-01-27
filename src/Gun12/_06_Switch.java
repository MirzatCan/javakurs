package Gun12;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        // Girilen bir sayının birler basamağının değerini yazı ile yazdırınız.
        Scanner sayiOku=new Scanner(System.in);
        System.out.print("sayi giriniz:");
        int sayi=sayiOku.nextInt();

        int modul=sayi%10;

        switch (modul) {
            case 0 : System.out.println("0");break;
            case 1 : System.out.println("1");break;
            case 2 : System.out.println("2");break;
            case 3 : System.out.println("3");break;
            case 4 : System.out.println("4");break;
            case 5 : System.out.println("5");break;
            case 6 : System.out.println("6");break;
            case 7 : System.out.println("7");break;
            case 8 : System.out.println("8");break;
            case 9 : System.out.println("9");break;


        }
    }
}
