package Gun05;

import java.util.Scanner;

public class _09_Ornek8 {
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını double, boyunu double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)

        Scanner oku=new Scanner(System.in);

        System.out.print("kilonuz=");
        double agirlik= oku.nextDouble();
        System.out.print("buyunuz=");
        double boyu= oku.nextDouble();

        double vucutKitleIn=agirlik/(boyu*boyu);

        System.out.println("boyunuz = " + boyu+ "  kilonuz = " + agirlik);
        System.out.println("Vucut Kitle index = " + vucutKitleIn);


    }
}
