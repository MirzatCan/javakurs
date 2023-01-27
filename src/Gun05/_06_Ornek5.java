package Gun05;

import java.util.Scanner;

public class _06_Ornek5 {
    public static void main(String[] args) {
        //Bir karenin kenarını kullanıcıdan isteyip çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+a+a+a    alan =a*a

        Scanner oku = new Scanner(System.in);

        System.out.print("kenar=");
        double kenar= oku.nextDouble();

        double cevre=kenar+kenar+kenar+kenar;
        double alan=kenar*kenar;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);

    }
}
