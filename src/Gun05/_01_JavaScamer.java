package Gun05;

import java.util.Scanner;

public class _01_JavaScamer {
    public static void main(String[] args) {
           //tipi  adi      ilk  degeri       islem tamamen bu adimi calistirir
        int      sayi    =   0       ;

        Scanner okuyucu = new Scanner(System.in);
        // tipi   adi     yeni okuyucu (klavyeden - konsoldan)

        System.out.print("Sayi giriniz=");
        sayi= okuyucu.nextInt();//kursor bekliyor sayi girisi icin
        //rakam girilip entara basildiginda degeri alip sayi ya atiyor.

        System.out.println("sayi = " + sayi);




    }
}
