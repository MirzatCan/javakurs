package Gun41;

import java.time.LocalDate;
import java.time.Period;

public class _05_Period {
    public static void main(String[] args) {
        //Period 2 tarih arasindaki farki gosterir
        //LocalDate ler icin kulanilir

        LocalDate dogumTarih=LocalDate.of(1997,03,24);
        LocalDate bugun=LocalDate.now();

        Period fark=Period.between(dogumTarih,bugun);
        System.out.println("fark = " + fark);
        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears()+" Yasindasiniz");

        System.out.println("************************");

        Period p3gun=Period.ofDays(3);
        Period p3ay=Period.ofMonths(3);

        System.out.println("p3ay = " + p3ay);
        System.out.println("p3gun = " + p3gun);

        LocalDate ucGunSonra=bugun.plus(p3gun);
        System.out.println("ucGunSonra = " + ucGunSonra);

        LocalDate ucAySonra=bugun.plus(p3ay);
        System.out.println("ucAySonra = " + ucAySonra);

        //*****************************
        //kursun bitis tarihini bulunuz

        LocalDate baslangicTarih=LocalDate.of(2022,10,31);
        Period kursSure=Period.ofMonths(6);
        LocalDate bitisTarihi=baslangicTarih.plus(kursSure);
        System.out.println("bitisTarihi = " + bitisTarihi);
        System.out.println("bitisTarihi.getDayOfWeek() = " + bitisTarihi.getDayOfWeek());

        //ne kadar sure kaldi
        Period kalanSure=Period.between(bugun,bitisTarihi);
        System.out.println("kalanSure = " + kalanSure);

        //kurs ne kadar suredir devam ediyor
        Period suanaKadarsurenSure=Period.between(baslangicTarih,bugun);
        System.out.println("suanaKadarsurenSure = " + suanaKadarsurenSure);












    }
}
