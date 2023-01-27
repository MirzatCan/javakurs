package Gun13;

import java.util.Scanner;

public class _08_DoWhile {
    public static void main(String[] args) {
        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.
        Scanner strOku=new Scanner(System.in);
        String str;
        do {
            System.out.print("giriniz:");
            str=strOku.nextLine();
            if (!str.equals("x")) //if yapma sebebimiz ise ilk girilen x olursa program calisiyor demesin diye
                System.out.println("program calisiyor");

        }while (!str.equals("x"));
        System.out.println("Program bitti");
    }
}
