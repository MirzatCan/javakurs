package Gun17;

import java.util.Scanner;

public class _05_JavaSplitMetodu {
    public static void main(String[] args) {
        //Split: bir sthring parcalara ayirmak demek

        //kulancidan alacaginiz cumleyi kelimelerine gore alt alta yazdiriniz.
        Scanner oku=new Scanner(System.in);
        System.out.print("cumle:");
        String cumle=oku.nextLine();

        String [] kelimeler=cumle.split(" ");

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);
        }
    }
}
