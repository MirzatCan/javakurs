package Gun43;

import java.util.Scanner;

public class _02_JavaRuntimeException {
    public static void main(String[] args) {
        System.out.println("Program basladi");

        try {// hata bolgesini try{} ine aldik
            Scanner oku=new Scanner(System.in);
            System.out.print("Sayi1=");
            int sayi1= oku.nextInt();

            System.out.print("Sayi2=");
            int sayi2= oku.nextInt();

            int bolum=sayi1/sayi2;
            System.out.println("bolum = " + bolum);
        }
        catch (Exception hata){
            //hata mesalarinin hata isimli Eception cinsinden degiskene attim
            System.out.println("hata = " + hata.getMessage());
            System.out.println("Lutfen tekrar deneyiniz");
        }
        System.out.println("program bitti");

    }
}
