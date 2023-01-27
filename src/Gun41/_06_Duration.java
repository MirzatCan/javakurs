package Gun41;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _06_Duration {
    public static void main(String[] args) {
        //Duration hem Localtime hem de LocalDateTime arasindaki farki alir.

        //LocalTime
        LocalTime dersBaslangic=LocalTime.of(19,0,0);
        LocalTime dersBitis=LocalTime.of(22,0,0);

        Duration gunlukDersSuresi=Duration.between(dersBaslangic,dersBitis);
        System.out.println("gunlukDersSuresi = " + gunlukDersSuresi);

        System.out.println("gunlukDersSuresi.toHours() = " + gunlukDersSuresi.toHours());
        System.out.println("gunlukDersSuresi.toMinutes() = " + gunlukDersSuresi.toMinutes());
        System.out.println("gunlukDersSuresi.toMillis() = " + gunlukDersSuresi.toMillis());

        //LocalDateTime
        LocalDateTime from=LocalDateTime.of(2022,11,01,19,00);
        LocalDateTime to=LocalDateTime.of(2023,04,30,22,00);

        Duration toplamKursSuresi=Duration.between(from,to);
        System.out.println("toplamKursSuresi = " + toplamKursSuresi);
        System.out.println("toplamKursSuresi.toDays() = " + toplamKursSuresi.toDays());
        System.out.println("toplamKursSuresi.toHours() = " + toplamKursSuresi.toHours());
        System.out.println("toplamKursSuresi.toMinutes() = " + toplamKursSuresi.toMinutes());







    }
}
