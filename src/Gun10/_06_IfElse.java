package Gun10;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner passWordOku=new Scanner(System.in);
        System.out.println("pasaword:");
        String password=passWordOku.nextLine();

        if (password.length()>=8||password.length()<=12|| password.contains("pass"))
        {System.out.println("uyugun pasword");}
    }
}
