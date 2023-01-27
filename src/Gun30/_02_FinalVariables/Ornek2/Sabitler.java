package Gun30._02_FinalVariables.Ornek2;

public class Sabitler {
     final static int gunSaat=24;
     final static int saatDakika=60;
     final static int dakikaSaniye=60;


public static int hesapla(int gun,int saat, int dakika){
     int ToplamSaniye=gun*Sabitler.gunSaat*Sabitler.saatDakika*Sabitler.dakikaSaniye
             +saat*Sabitler.saatDakika*Sabitler.dakikaSaniye
             +dakika*Sabitler.dakikaSaniye;

     return ToplamSaniye;
}
}


