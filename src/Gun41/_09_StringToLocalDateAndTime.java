package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _09_StringToLocalDateAndTime {
    //kulancidan alinan String durumdaki time veya tarih 
    //bilgisini time veya tarih bilgisine cevilmesi
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();//kodun calismayabasladigu zaman

        Scanner oku=new Scanner(System.in);
        System.out.println("Tarih giriniz:");
        String strTarih=oku.nextLine();

        System.out.println("strTarih = " + strTarih);

        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd MM yyyy");

        LocalDate tarih=LocalDate.parse(strTarih,f);

        System.out.println("tarih = " + tarih);

        long finishTime=System.currentTimeMillis();
        System.out.println("gecen sure="+(finishTime-startTime)+"ms");

    }
}
