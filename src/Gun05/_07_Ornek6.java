package Gun05;

import java.util.Scanner;

public class _07_Ornek6 {
    public static void main(String[] args) {
        //Bir dikdortgenin gerekli kenar uzunlugunu kullanıcıdan isteyip
        // çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+b+a+b    alan =a*a

        Scanner oku=new Scanner(System.in);

        System.out.print("kenar1=");
        double kenar1=oku.nextDouble();
        System.out.print("kenar2=");
        double kenar2=oku.nextDouble();

        double cevre=kenar1+kenar2+kenar1+kenar2;
        double alan=kenar1*kenar2;

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);

    }
}
