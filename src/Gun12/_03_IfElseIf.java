package Gun12;

import java.util.Scanner;

public class _03_IfElseIf {
    public static void main(String[] args) {
        // Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner strOku=new Scanner(System.in);
        System.out.print("(deris adi:not)seklinde giriniz:");
        String strnot=strOku.nextLine();

        //int not=Integer.parseInt(strnot.replaceAll("[^0-9]",""));
        // replace kulanak cuzum. bu sekilde : degil hersey yazsa olur.

        // : nin intenger bularak : sonraki kismini al.
        int not=Integer.parseInt(strnot.substring(strnot.indexOf(":")+1));

        if (not<40)
            System.out.println("F");
        else
            if (40<=not&& not<60)
                System.out.println("E");
            else
                if (60<=not&& not<70)
                    System.out.println("D");
                else
                    if (70<=not&& not<80)
                        System.out.println("C");
                    else
                        if (40<=not&& not<90)
                            System.out.println("B");
                        else
                            if (90<=not)
                                System.out.println("A");
    }
}
