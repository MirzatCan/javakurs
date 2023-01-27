package Gun26._02_Ornek;

import java.util.ArrayList;

public class Ornek {
    public static void main(String[] args) {
        // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- Adım : Bu degerlerı yazıdırınız.

        // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
        //           çalıştığında kişinin doğum yılını versin.

        // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
        //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.

        Person bilgi1=new Person();
        bilgi1.name="Mirzat";
        bilgi1.surname="memet";
        bilgi1.age=25;

        Person bilgi2=new Person();
        bilgi2.name="xirzat";
        bilgi2.surname="memet";
        bilgi2.age=22;

        //1.yontem    normal basit yazdirma
        System.out.println("bilgi.name = " + bilgi1.name);
        System.out.println("bilgi.surname = " + bilgi1.surname);
        System.out.println("bilgi.age = " + bilgi1.age);

        System.out.println("bilgi2.name = " + bilgi2.name);
        System.out.println("bilgi2.surname = " + bilgi2.surname);
        System.out.println("bilgi2.age = " + bilgi2.age);

        //2.yontem     normal metod kulanarak yazdirma
        bilgiYazdir(bilgi1);
        bilgiYazdir(bilgi2);

        //3.yontem     kendi ait oldugu class dan cagiriyoruz
        bilgi1.bilgia1Yazdir();
        bilgi2.bilgia1Yazdir();

//        int[] dizi=new int[5];
//        System.out.println("dizi.toString() = " + dizi.toString()); //burda yazdirmak icin toString dememiz lazim
//
//        ArrayList<Integer> liste=new ArrayList<>();
//        System.out.println("liste = " + liste.toString());// burda gerek yok. ama toString diye de yazabiliriz

        //4.yontem
        System.out.println("bilgi1 = " + bilgi1); //calismaz,ama toString diye bir metod acarsak calisir.

        //4.adim
        //1.yontem
        bilgi1.getBirthYear(); //getBirthYear(bilgi1) degil.
        bilgi2.getBirthYear();

        //4.adim 2.yontem
        System.out.println("bilgi2.getBirthYear2(); = " + bilgi2.getBirthYear2());

        //5.adim
        bilgi1.getInitials();




    }

    public static void bilgiYazdir(Person bilgi){
        System.out.println("bilgi.name = " + bilgi.name);
        System.out.println("bilgi.surname = " + bilgi.surname);
        System.out.println("bilgi.age = " + bilgi.age);
    }

}
