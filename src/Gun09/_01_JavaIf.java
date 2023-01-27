package Gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        //baklava dilimiz -> if
        //girilen sayi 10dan buyuk ise ekrana 10dan buyuk diye yaziniz
        //sayi>10 ise "10dan buyuk" yaz

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int sayi =oku.nextInt();

        if (sayi>10)  // sart
        {//if saritlari oldugunda tamamlamasi gereken islemler{} arasina yazilir.
            System.out.println("10 dan buyuk");

        }




    }
}
