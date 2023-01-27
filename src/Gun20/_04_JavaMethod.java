package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        //Kullanıcının gireceği 2 sayının toplamını
        //bir fonksiyonda buldurup, bunun sonucunu main de yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("1.sayi giriniz:");
        int sayi1= oku.nextInt();;

        System.out.print("2.sayi giriniz:");
        int sayi2= oku.nextInt();

        int toplam=toplamBul(sayi1,sayi2);
        System.out.println("toplam = " + toplam);
    }
    public static int toplamBul(int a,int b){
        int toplam=a+b;
        return toplam;

        //2.yontem
        // return (a+b);
    }
}
