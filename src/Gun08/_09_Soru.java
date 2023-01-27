package Gun08;

import java.util.Scanner;

public class _09_Soru {
    public static void main(String[] args) {
        // girilen bir cümledeki ilk kelimeyi yazdırınız
        Scanner cumleOku=new Scanner(System.in);
        System.out.println("cumle giriniz:");
        String cumle=cumleOku.nextLine();

        System.out.println("ilk kelime:" + cumle.substring(0,cumle.indexOf(" ")));


    }
}
