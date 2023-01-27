package Gun41;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _01_JavaLocalTime {
    public static void main(String[] args) {
        //LocalTime : Tarih bilgisi icermez, sadece saat dakika ve nano saniye

        LocalTime time=LocalTime.now();
        System.out.println("time = " + time);

        System.out.println("time.getHour() = " + time.getHour());
        System.out.println("time.getMinute() = " + time.getMinute());
        System.out.println("time.getSecond() = " + time.getSecond());
        System.out.println("time.getNano() = " + time.getNano());
        
        //kendimize ozel format
        DateTimeFormatter of1=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("time.format(of1) = " + time.format(of1));

        DateTimeFormatter of2=DateTimeFormatter.ofPattern("kk:mm");
        System.out.println("time kk:mm = " + time.format(of2));

        DateTimeFormatter of3=DateTimeFormatter.ofPattern("k:mm");
        System.out.println("time k:mm = " + time.format(of3));

        //*****************************
        //kendimiz saat dakika saniye belirleme
        LocalTime time1=LocalTime.of(9,15,23);
        System.out.println("time1 of3 format sekli = " + time1.format(of3)); //tek haneli saat formatindan


    }
}
