package Gun41;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _04_JavaLocalDateTime{
    public static void main(String[] args) {
        //LocalDateTime hem tarih hem de saat bigisini tutar

        LocalDateTime dt=LocalDateTime.now();
        System.out.println("dt = " + dt);

        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt.getMonth() = " + dt.getMonth());
        System.out.println("dt.getMonthValue() = " + dt.getMonthValue());
        //LocalDate ve LocalTime daki hepsi ortak kulanilabiliriz


        System.out.println("dt.format(DateTimeFormatter.ISO_DATE_TIME) = " + dt.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("SHORT= " + dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("SHORT= " + dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));

        //ozel formatta isedigimiz gibi yazdirma
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm");
        System.out.println("dt.format(f) = " + dt.format(f));



    }
}
