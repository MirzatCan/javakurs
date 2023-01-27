package Gun24;

import java.util.*;

public class _04_JavaMap {
    public static void main(String[] args) {

        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(9,"tilki");
        hm.put(2,"kedi");
        hm.put(90,"kopek");
        hm.put(62,"kus");
        hm.put(30,"kurt");
        System.out.println("hm = " + hm); // hizli calismak icin, kendisine gore siralir

        LinkedHashMap<Integer,String>lhm=new LinkedHashMap<>();
        lhm.put(9,"tilki");
        lhm.put(2,"kedi");
        lhm.put(90,"kopek");
        lhm.put(62,"kus");
        lhm.put(30,"kurt");
        System.out.println("lhm = " + lhm); //Ekledigi siraya gore sirala

        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(9,"tilki");
        tm.put(2,"kedi");
        tm.put(90,"kopek");
        tm.put(62,"kus");
        tm.put(30,"kurt");
        System.out.println("tm = " + tm); // her zaman sirali Key e gore, kendinden sortlu


    }
}
