package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız

        Scanner sayiOku=new Scanner(System.in);
        System.out.print("kac saat kaldiniz:");
        int saat=sayiOku.nextInt();

        if (saat<=3)
            System.out.println("ucret:10Tl");
        else
            if (saat>3 && saat<=5)
                System.out.println("ucret:15Tl");
            else
                System.out.println("ucret:20Tl");
    }
}
