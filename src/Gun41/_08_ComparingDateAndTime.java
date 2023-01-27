package Gun41;

import java.time.LocalDate;

public class _08_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        LocalDate dun=bugun.minusDays(1);

        boolean sonraMi=bugun.isAfter(dun); //bugun dunden sonra mi?
        System.out.println("sonraMi = " + sonraMi);

        boolean onceMi=bugun.isBefore(dun); //bugun dunden once mi?
        System.out.println("onceMi = " + onceMi);

        boolean esitMi=bugun.isEqual(dun);
        System.out.println("esitMi = " + esitMi);

        boolean artikYilMi=bugun.isLeapYear(); // bugun un oldugu yil artik yil mi
        System.out.println("artikYilMi = " + artikYilMi);

    }
}
