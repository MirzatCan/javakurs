package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("Program Basladi");

        try {
            Scanner oku=new Scanner(System.in);
            System.out.print("Sayi1=");
            int sayi1= oku.nextInt();

            System.out.print("Sayi2=");
            int sayi2= oku.nextInt();

            int bolum=sayi1/sayi2;
            System.out.println("bolum = " + bolum);

            System.out.println("Program Bitti");
        }

        // burda direk Exception kulansak genel hatalari verir

        catch (InputMismatchException ex){ // belirli bir hata
            System.out.println("Lutfen Sayi giriniz");
        }
        catch (ArithmeticException ex){ // belirli bir hata
            System.out.println("sidira bolme hatasi");
        }
        catch (Exception ex) { // yukardaki hatalar disindaki hatalar icin
            System.out.println("Hata Olustu"+ex.getMessage());
        }

    }
}
