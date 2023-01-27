package Gun41;

import Utility.MyFunc;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_Soru {
    //Canli digital saat yaziniz
    public static void main(String[] args) {
        DateTimeFormatter f=DateTimeFormatter.ofPattern("kk：mm:ss");

        while (true) {  //true her zaman calismasi icin
            LocalTime time=LocalTime.now();
            System.out.print("\r" + time.format(f));
            MyFunc.bekle(1);
        }


    }
}
