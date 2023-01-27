package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("program basladi");
        try {
            LocalDate tarih=LocalDate.of(2023, Month.FEBRUARY,30);
        }
        catch (Exception ex){
            System.out.println("Hata olustu Lutfen tekrar deneyiniz.");
            System.out.println("Tum hata mesaji = " + ex);
            System.out.println("hatanin aciklamasi = " + ex.getMessage());
        }
        System.out.println("Program Bitti");

        try{
            //java ve Tollari calismaya devam et
            //konulari ogrenmeye ve calismaya devam
            //anlamadigin yer mi oldu? kirilmadan devam et
        }
        catch (Exception ex){
            //hatanin sebebini anla
            //derse daha fazla odaklan
            //gereken videolari izle
            //grup calismalari yap
            //ogren ve kirilmadan devam et
            //unutma sen bir soz verdin, devam
        }
        //sonunda seni guzel bir meslek bekliyor

    }
}
