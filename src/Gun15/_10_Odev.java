package Gun15;

import java.util.Scanner;

public class _10_Odev {
    public static void main(String[] args) {

        //1. 0 ile 100 arasındaki bütün çift sayıları yazdırabileceğiniz bir kod yazınız. _Not: 0 ve 100 dahildir.
        int sayac1=0;
        System.out.println("0 ile 100 arasındaki bütün çift sayılar:");
        do {
            if (sayac1%2==0){
            System.out.print(sayac1+" ");}
            sayac1++;
        }while (sayac1<=100);
        System.out.println();

        //2. 0 ile 100 arasındaki bütün tek sayıları yazdırabileceğiniz bir kod yazınız.
        int sayac2=0;
        System.out.println("0 ile 100 arasındaki bütün tek sayılar:");
        do {
            if (sayac2%2!=0){
                System.out.print(sayac2+" ");}
            sayac2++;
        }while (sayac2<=100);
        System.out.println();

        //3.100'den 0'a kadar bütün tek sayıları yazdırınız.
        //```
        //99-98-97-96....
        //```
        //`100 ve 0 dahil değildir.
        int sayac3=100;
        System.out.println("100 ile 0 arasındaki bütün tek sayılar:");
        do {
            if (sayac3%2!=0){
                System.out.print(sayac3+" ");}
            sayac3--;
        }while (sayac3>0);
        System.out.println();

        //4.İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.
        //İlk 10 doğal sayı: 1,2,3,4,5,6,7,8,9,10
        System.out.println("İlk 10 doğal sayının toplamını:");
        int sayac4=1; int toplam=0;
        while (sayac4<11){
            toplam=toplam+sayac4;
            sayac4++;
        }
        System.out.println("toplam = " + toplam);

        //5."0 ile 100" arasındaki sayıları kapsayan bir kod yazınız.
        //Bu kod bu sayıların tek mi çift mi olduğunu belirleyebilecek bir kod olmalı.
        //Eğer sayı çift sayıysa;
        //"This number is even and number is 0"
        //Eğer sayı tek sayıysa;
        //"This number is odd and number is 1"
        //yazdırmalıdır.
        //Sonuç böyle olmalıdır.
        // ```
        //This number is even and number is 0
        //This number is odd and number is 1
        //This number is even and number is 2
        //This number is odd and number is 3
        //```
        for (int i=0;i<=100;i++){
            if (i%2==0)
                System.out.println("This number is even and number is "+i);
            else
                System.out.println("This number is odd and number is "+i);
        }

        //6. 0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayıları yazdırınız.
        //Sonuç bu şekilde olmalıdır.
        //0
        //20
        //40
        //60
        //80
        //100
        //```
        System.out.println("0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayılar");
        for (int i=0;i<=100;i++){
            if (i%4==0 && i%5==0)
                System.out.println(i);
        }

        //7. Uzunluk ve genişliğini yazan kişinin belirlediği # bütünü oluşturabileceğiniz bir kod yazınız
        //_örn:
        //_length(uzunluk): 7
        //_width(genişlik): 5
        //_Output:_
        //#####
        //#####
        //#####
        //#####
        //#####
        //#####
        //#####
        Scanner Oku=new Scanner(System.in);
        System.out.print("uzunluk:");
        int uzunluk=Oku.nextInt();
        System.out.print("genislik:");
        int genislik=Oku.nextInt();
        for (int i=0;i<uzunluk;i++){
            for (int j=0;j<genislik;j++){
                System.out.print("#");
            }
            System.out.println();
        }


        //8.Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
        //Sonuç böyle olmalıdır.
        //*      1.satirda 4 tane bosluk 1 tane *
      //* *      2.satirda 3 tane bosluk 2 tane *
    //* * *      3.satirda 2 tane bosluk 3 tane *
  //* * * *      4.satirda 1 tane bosluk 4 tane *
//* * * * *      5.satirda 0 tane bosluk 5 tane *

        for (int i=1;i<=5;i++){
            for (int j=5;j>i;j--){
                System.out.print(" ");}
            for (int y=1;y<=5;y++){
                System.out.print("*");
                if (y==i)
                    break;
                }
            System.out.println();
        }

        //9.Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
        //Sonuç böyle olmalıdır;
       //*           1.satira 4bosluk sonra 1 yildiz
      //* *          2.satira 3bosluk sonra 1 yildiz 1bosluk 1 yildiz
     //* * *         3.satira 2bosluk sonra 1 yildiz 1bosluk 1 yildiz 1bosluk 1 yildiz
    //* * * *        4.satira 1bosluk sonra 1 yildiz 1bosluk 1 yildiz 1bosluk 1 yildiz 1bosluk 1 yildiz
   //* * * * *       5.satira 0bosluk sonra 1 yildiz 1bosluk 1 yildiz 1bosluk 1 yildiz 1bosluk 1 yildiz 1bosluk 1 yildiz
        for (int i=1;i<=5;i++){
            for (int b=5;b>i;b--){
                System.out.print(" ");
            }
            for (int y=1;y<=5;y++){
                System.out.print("* ");
                if (y==i)
                    break;
            }
            System.out.println();
        }

        //10. do while loop kullanınız.
        // 0 ile 30 arasındaki bütün çift sayıları yazdırınız.
        int sayac10=0;
        System.out.println("0 ile 30 arasındaki bütün çift sayılar:");
        do {if (sayac10%2==0){
            System.out.print(sayac10+" ");}
            sayac10++;
        }while (sayac10<=30);
    }
}
