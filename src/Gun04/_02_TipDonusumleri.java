package Gun04;

public class _02_TipDonusumleri {
    public static void main(String[] args) {
        byte not1=98;
        byte not2=98;
        byte not3=100;
        byte not4=98;

        //byte toplam=not1+not2+not3+not4; bu sekilde olmaz. int yapmak zorundayiz.
        int toplam=not1+not2+not3+not4;

        int toplam1=not1; // byte -> int ayinca problem cikarmadi (Geniletme- Widening Castring)
        // cunku byte icin hafizada ayirilan yer zaten int'e sigar, sigdigi icin kabul eder.
        // cunku veri kaybi ihtimali yok.

        //not1=toplam  dedigimizde. int -> byte atinca dur bakalim dedi (DARLATMA- Narrow Casting)
        //buyuk hafiza ayrilmis bir alani, kucuk hafiza ayrilmis alana atma islemi var.
        //veri kaybi ihtimali var.



        }
}
