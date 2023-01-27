package Gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {
        int sayi; //hafizada int kadar yer ayiriyor, sadece tam sayi atilabilir.
        //tam sayi default INT

        // tam sayilar
        byte byteDeger=7; // -128...127
        short shortDeger=1648; //-32000...32000
        int intDeger=250000;
        long longDeger = 23232345454545L; //sonuna L eklemek lazim.

        //ondalikli sayilar
        //ondalikli sayilarda default DOUBLE dir
        double doubleDeger=3.1414141415414411; //noktadan sonra 16 hane duyarlidir.
        float floatDeger=3.14121F;  // noktadan sonra 7 hane duyarlidir. sonuna F eklemek lazim.

        //karakter ve karakterler
        char basHarif='A';  // bir tane karakter saklayabilir.
        String isim= "isim";  // kelime veya cumle saklayabilir. String S buyuk olmak zorunda.

        System.out.println("isim = " + isim);
        System.out.println("basHarif = " + basHarif);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("byteDeger = " + byteDeger);


    }
}
