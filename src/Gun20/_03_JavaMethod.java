package Gun20;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        // kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını (faktöryel)
        //bir fonksiyonda buldurup, bunun sonucunu main de tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayi girini:");
        int sayi= oku.nextInt();

        int carpimiSonuc=carpimi(sayi);

        String sonuc=tekMiCidtMi(carpimiSonuc);

    }
    public static int carpimi(int sayi){
        int carpimi=1;
        for (int i = 1; i < sayi+1; i++) {
            carpimi=i*carpimi;
        }
        String sonuc=tekMiCidtMi(carpimi);
        System.out.println("sonuc = " + sonuc);
        return carpimi;
    }

    public static String tekMiCidtMi(int carpimi){
        if (carpimi%2==0)
            return "cift";
        else
            return "tek";
    }
}
