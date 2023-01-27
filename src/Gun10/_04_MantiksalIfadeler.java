package Gun10;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {
        // Mantiksal ifadelern
        // &&  ->  ve demek
        // ||  ->  veya demek

        //Girilen sayi pozitif ve tek ise, ekrana uygun sayi girildi
        //degil ise uygun sayi girilmedi yaziniz.
        Scanner sayiOku=new Scanner(System.in);
        System.out.print("sayi:");
        int sayi=sayiOku.nextInt();

        //hem tek hem pozitif ->  sayi%2=1 && sayi>0

        if (sayi%2==1 && sayi>0)
        {System.out.println("Uyugun sayi");}
        else
        {System.out.println("Uygun sayi degil");}
     }
}
