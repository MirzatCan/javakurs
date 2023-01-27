package Gun14;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
        //girilen bir string harflerini teker teker ekrana alt alta olarak
        //sekilde yazdiriniz, bosluklari yazmasin.

        Scanner strOku=new Scanner(System.in);
        System.out.print("String giriniz:");
        String kelime=strOku.nextLine();
        int kelimeUzun=kelime.length();
        int i=0;
        for (i=0;i<kelimeUzun;i++){
            if (kelime.charAt(i)==' ')
                continue;
            System.out.println(kelime.charAt(i));
        }
    }
}
