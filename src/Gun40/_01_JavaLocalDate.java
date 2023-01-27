package Gun40;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        //LocalDate Sadece gun ay yil bilgisini tutar.

        LocalDate tarih=LocalDate.now();

        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());

        //kendisinde hazir formatlar
        System.out.println("ISO_DATE="+tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT   ="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM  ="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG    ="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL    ="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("***************");
        //Localde aldigim tarihi istedigim ulkenin formatina gore diline gore nasil gosteriririm?
        //Ogrenin localda saati Almanya ya nasil gosteririz.
        System.out.println("FULL Alman gsterisi="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN)));
        System.out.println("FULL cin   gsterisi="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.CHINA)));

        //en-US:  birincisi dili ikincisi ise Ulkeyi tamsil ediyor
        //en-UK:  UK ingilizcesi
        //fr-CA:  Kanada fransizcasi
        //en-CA:  Kanada ingilizcesi
        //tr-TR:  

        Locale[] kulanilabilirLokaller=Locale.getAvailableLocales();

        for (Locale l:kulanilabilirLokaller) {
            if (l.getDisplayCountry().toLowerCase().contains("台湾")) {
                System.out.print("l.getDisplayLanguage() = " + l.getDisplayLanguage());
                System.out.print("l.getDisplayCountry() = " + l.getDisplayCountry());
                System.out.print("l.getCountry() = " + l.getCountry());
                System.out.println("l.getLanguage() = " + l.getLanguage());
            }
        }
        Locale localCince=new Locale("zh","cn");
        System.out.println("FULL cin   gsterisi="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(localCince)));

        Locale localTurkce=new Locale("tr","TR");
        System.out.println("FULL Turkiye gsterisi="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(localTurkce)));

        System.out.println("********istedigim formatta gosterim********");
        //istedigim formatta gosterim
        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozelFormat=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih dd/MM/yyyy = " + tarih.format(ozelFormat));

        DateTimeFormatter o2=DateTimeFormatter.ofPattern("d/M/yy");
        System.out.println("tarih d/M/yy = " + tarih.format(o2));

        DateTimeFormatter o3=DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        System.out.println("tarih EEEE dd.MM.yyyy = " + tarih.format(o3));

        System.out.println("Ozel formaya gore lokasyon = " + tarih.format(o3.withLocale(Locale.CHINA)));

        DateTimeFormatter o4=DateTimeFormatter.ofPattern("EE dd.MM.yyyy");
        System.out.println("tarih EE dd.MM.yyyy = " + tarih.format(o4));

        DateTimeFormatter o5=DateTimeFormatter.ofPattern("MMMM dd.MM.yyyy");
        System.out.println("tarih MMMM dd.MM.yyyy = " + tarih.format(o5));

        //kendimiz istedigimiz tarih vericez
        LocalDate tarih1= LocalDate.of(2000,5,20);
        LocalDate tarih2= LocalDate.of(2000, Month.AUGUST,20);
        System.out.println("tarih1 = " + tarih1);
        System.out.println("tarih1.format(ozelFormat) = " + tarih1.format(ozelFormat));
        System.out.println("tarih2 = " + tarih2);
        System.out.println("tarih2.format(ozelFormat) = " + tarih2.format(ozelFormat));


    }
}
