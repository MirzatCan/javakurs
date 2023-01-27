package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _07_ZonedDateTime {
    //baska zaman Bolgelerinin (Time zone) zaman bilgesini alma
    public static void main(String[] args) {
        ZonedDateTime zdt=ZonedDateTime.now();
        //su anda benim bulundugum default zamani verdi
        System.out.println("zdt = " + zdt);

        Set<String> zamanBolgeleri=ZoneId.getAvailableZoneIds();
        for (String z:zamanBolgeleri) {
            if (z.toLowerCase().contains("ist"))
                System.out.println("z = " + z);
        }

        ZoneId zonIdIstanbul=ZoneId.of("Europe/Istanbul");
        ZonedDateTime zoneIstanbul=ZonedDateTime.now(zonIdIstanbul);
        System.out.println("zoneIstanbul = " + zoneIstanbul);

        ZoneId zonIdLondon=ZoneId.of("Europe/London");
        ZonedDateTime zoneLondon=ZonedDateTime.now(zonIdLondon);
        System.out.println("zoneLondon = " + zoneLondon);
    }
}
