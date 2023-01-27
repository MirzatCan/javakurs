package Gun03;

public class _07_JavaString {
    public static void main(String[] args) {
        String Ad="Mirzat"; //String  :  kelime veya kelimeleri saklamak icin kullanilir
        //sinirlarini " " ile belirler.

        String Soyadi="Memet";

        System.out.println("Soyadi = " + Soyadi);
        System.out.println("Ad = " + Ad);
        System.out.println("Ad ve Soyadi = "+Ad+"\t"+Soyadi);
        System.out.println("Ad ve Soyadi = "+Ad+" "+Soyadi);
        // + lar string arasinda oldugunda birlestirir.
        //"" arasina bosluk koyunca yada \t yazinca bosluk yazdirir.

        String tamAd="Mirzat"+" "+"memet";
        System.out.println("tamAd = " + tamAd);
        


    }
}
