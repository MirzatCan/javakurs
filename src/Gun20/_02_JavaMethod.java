package Gun20;

import java.util.Scanner;

public class _02_JavaMethod{
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.
        Scanner oku=new Scanner(System.in);

        System.out.print("1.sayi giriniz:");
        int sayi1=oku.nextInt();

        System.out.print("2.sayi giriniz:");
        int sayi2=oku.nextInt();

        int enb=enBuyuk(sayi1,sayi2);
        System.out.print("enb = " + enb);
    }
    public static int enBuyuk(int a, int b){
            //1.yontem
        int donecek=0;
        if (a>b)
            donecek=a;
        else
            donecek=b;
        return donecek;
            //2.yontem
        // return a > b ? a : b;

            //3.yontem
        //if (a>b)
        //    return a;
        //else
        //    return b;

    }
}
