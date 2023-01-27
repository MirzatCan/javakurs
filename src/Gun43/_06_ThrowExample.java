package Gun43;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Sifre olusturuma");

        System.out.print("Yeni Sifreniz=");
        String newPassWord=oku.nextLine();

        if (newPassWord.length()<8)
        {
            System.out.println("Lutfen dikkat");
            System.out.println("Sifre en az 8 karakter olmali.");
            //log tutma
        }
        if (newPassWord.length()>15)
        {
            System.out.println("Lutfen dikkat");
            System.out.println("Sifre en fazla 15 karakter olmali");
            //log tutma
        }




    }
}
