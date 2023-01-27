package Gun13;

import java.util.Scanner;

public class _09_Odev {
    public static void main(String[] args) {
       //1- Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz
        Scanner sayiOku1 = new Scanner(System.in);
        int sayac1 = 1;
        int toplam = 0;
        while (sayac1 <= 20) {
            System.out.print(sayac1 + ".sayi giriniz:");
            int sayi1 = sayiOku1.nextInt();
            if (sayi1 % 2 == 1 || sayi1 % 2 == -1)
                toplam = toplam + sayi1;
            sayac1++;
        }
        System.out.println("toplam = " + toplam);

        //2- Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz
        Scanner sayiOku2 = new Scanner(System.in);
        int sayac2 = 1;
        int adet = 0;
        while (sayac2 <= 20) {
            System.out.print(sayac2 + ".sayi giriniz:");
            int sayi2 = sayiOku2.nextInt();
            if (sayi2 % 2 == 1 || sayi2 % 2 == -1)
                adet = adet + 1;
            sayac2++;
        }
        System.out.println("adet = " + adet);

        //3- Kullanıcnın gireceği bir sayıya kadar olan sayıların toplamını bulunuz.
        Scanner sayiOku3 = new Scanner(System.in);
        int sayi3; int toplam3=0;
        do {
            System.out.print("sayi giriniz:");
            sayi3 = sayiOku3.nextInt();
            toplam3=toplam3+sayi3;
        } while (sayi3 != 5);
        System.out.println("toplam3 = " + toplam3);
        // soruyu anlamadim,anladim 2.sekil
        Scanner sayiOku33 = new Scanner(System.in);
        System.out.print("sayi giriniz:");
        int sayi33=sayiOku33.nextInt();
        int sayac=0; int toplam33=0;
        while (sayac!=sayi33){
            toplam33=toplam33+sayac;
            sayac++;
        }
        System.out.println("toplam33 = " + toplam33);

        //4- Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.
        Scanner sayiOku4 = new Scanner(System.in);
        int sayac4 = 1;
        int toplam4 = 0;
        while (sayac4 <= 20) {
            System.out.print(sayac4 + ".sayi giriniz:");
            int sayi4 = sayiOku2.nextInt();
            if (sayi4>10 && sayi4<30)
                toplam4 = toplam4 + sayi4;
            sayac4++;
        }
        System.out.println("toplam4 = " + toplam4);

        //5- 100 kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.
        int sayac5=0; int adet2=0;
        while (sayac5<=100){
            if (sayac5%10==5)
                adet2=adet2+1;
            sayac5++;        }
        System.out.println("birler basamağının 5 olan sayi adeti:" + adet2);

        //6- Bir sayı bulmaca oyunu yapılmak isteniyor
        //bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,
        //Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,
        //bilemediniz yazıp tutulan sayıyı bildirsin.
        //Eğer bilirse tebrikler yazsın.
        //Mobil developer kursuna devam edecekler ve kendini zorlamak isteyen testerlar için
        int sayiRandom=(int)(Math.random()*10)+10;
        int sayac6=1;
        Scanner sayiOku6=new Scanner(System.in);
        System.out.println("(10-20 arasında bir sayı giriniz)");
        do {
        System.out.print(sayac+".hakiniz:");
        int sayi66=sayiOku6.nextInt();
        if (sayi66==sayiRandom){
            System.out.println("tebrikler");
            sayac6=4;}
        else {sayac++;
            System.out.println("bilemediniz");}
        }while (sayac6<4);

        //7- Girilen 3 basamaklı bir sayının birler , onlar ve yuzler basamağını bulunuz.
        Scanner sayiOku7=new Scanner(System.in);
        System.out.print("3 basamakli sayi giriniz:");
        int sayi7=sayiOku7.nextInt();
        int sayiYuler=sayi7/100;
        int sayiOnler=sayi7/10%10;
        int sayiBirler=sayi7%10;
        System.out.println("sayiYuler = " + sayiYuler);
        System.out.println("sayiOnler = " + sayiOnler);
        System.out.println("sayiBirler = " + sayiBirler);
        //8- Girilen bir sayının kaç basamak olduğunu bulunuz.
        Scanner sayiOku8=new Scanner(System.in);
        System.out.print("sayi giriniz:");
        double sayi8=sayiOku8.nextDouble();
        String sayi88=Double.toString(sayi8);
        int basamak=sayi88.replaceAll("[^0-9]","").length();
        System.out.println("kac basamak:" + basamak);

        //9- Girilen bir sayının tersi olan sayıyı bulunuz yani 124 girildi ise 421 olan sayı elde edilecek.
        Scanner sayiOku9=new Scanner(System.in);
        System.out.print("sayi giriniz:");
        Long sayi9=sayiOku9.nextLong();
        String sayi99=Long.toString(sayi9);
        int uzunluk=sayi99.length();
        int sayac9=1;
        do {
            System.out.print(sayi99.charAt(uzunluk-sayac9));
            sayac9++;

        }while (sayac9<=uzunluk);
        System.out.println();


        //10- Girilen bir sayının tersi ile aynı olup olmadığını bulunuz. yani simetrik sayı mı?
        Scanner sayiOku10=new Scanner(System.in);
        System.out.print("sayi giriniz:");
        Long sayi10=sayiOku9.nextLong();
        String sayi100=Long.toString(sayi9);
        int uzunluk10=sayi100.length();
        int sayac10=1;

        do {
            char sonuc=sayi100.charAt(uzunluk10-sayac10);
            System.out.print(sonuc);
            sayac10++;
        }while (sayac10<=uzunluk10);

    }
}
