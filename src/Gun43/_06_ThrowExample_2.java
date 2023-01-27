package Gun43;

import java.util.Scanner;

public class _06_ThrowExample_2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Sifre olusturuma");

        System.out.print("Yeni Sifreniz=");
        String newPassWord=oku.nextLine();
    try {
        if (newPassWord.length() < 8) { // bu mesaj ile sini hat olusturur
            throw new Exception("Sifre en az 8 karakter olmali.");
        }
        if (newPassWord.length() > 15) { // bu mesaj ile sunu hat olusturur
            throw new Exception("Sifre en fazla 15 karakter olmali");

        }
    }
    catch (Exception ex){
        // hatalar bir yere toplanip , hepsi icin yapilmasi gerekken islemler
        //birden fazla burada yapilabilir, mesala long tutmak gibi
        System.out.println("Lutfen dikkat");
        System.out.println("ex.getMessage() = " + ex.getMessage());
    }
    }
}
