package Gun14;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        // girilen bir sayının, 2 aynı sayının carpımına
        // eşit olup olmadığını bulunuz.

        // 4 girdim -> 22 bu tam karedir.
        // 5 girdim -> değildir.
        // 9 girdim -> 33

        // 5 girildi, 5 kadar sayilar1,2,3,4
        // 9 girildi, 9 kadar sayilarin 1,2,3,4,5,6,7,8,

        Scanner sayiOku=new Scanner(System.in);
        System.out.print("sayi giriniz:");
        int sayi=sayiOku.nextInt();
        int sayac=0;    // diyelim ki 9 girdik
        int arananRakam=0;      //1.yontem
        boolean bulundu=false;  //2.yontem-> boolean ile cuzum
        while (sayac<sayi){
            if (sayac*sayac==sayi) //0*0==9 1*1==9 2*2==9 3*3==9
            {System.out.println("tam karedir");
                bulundu=true;
                arananRakam=sayac;
                break;} // calistiginda donguden cik.
            sayac++;}
        if (arananRakam==0)
            System.out.println("tam kare degildir");
        if (bulundu==false)
            System.out.println("tam kare degildir");
        }

    }

