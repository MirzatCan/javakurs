package Gun18;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int sayi=0; //1 tane sayi
        int [] sayilar=new int[100];//100 tane sayi

        int[] ders1Notlari=new int[50];  //50kisilik sinifin 1.dersin notlari
        int[] ders2Notlari=new int[50];  //2. ders
        int[] ders3Notlari=new int[50];  //0-49 arasi index degisiyor

        int[][] tumDersNotlari=new int[3][50]; //3 tane ders 50tane ogrenci,150 tane sayi
                                               //3 satir, 50 sutun
                                               //her satir 50 tane sayi, 50sutun
                                               //0.satir,  1.satir,   2.satir
                                               //satir:0,1,2  sutun:0,1,2,3,....49
        ders1Notlari[0]=80; //tek boyuntlu dizinin ilk(0) elamanina 80 degeri atadim
        tumDersNotlari[0][0]=80; //2 boyutlu dizide 0.satir,0.sutununa 80 degeri atadim

        System.out.println("tumDersNotlari[0][0] = " + tumDersNotlari[0][0]);

        Scanner oku=new Scanner(System.in);
        tumDersNotlari[0][0]=oku.nextInt();




    }
}
