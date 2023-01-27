package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {
        //bir kartvizit uygulamasini 2 kisi icin yapiniz

        HashMap<String,String>mirzatKartVizit=new HashMap<>();
        mirzatKartVizit.put("isim","Mirzar Memet");
        mirzatKartVizit.put("email","mirzat@gmail.com");
        mirzatKartVizit.put("adres","Zeytinburnu/Istanbul");
        mirzatKartVizit.put("Telefon","5399402128");

        System.out.println("mirzatKartVizit.get(\"isim\") = " + mirzatKartVizit.get("isim"));
        System.out.println("mirzatKartVizit.get(\"Telefon\") = " + mirzatKartVizit.get("Telefon"));

        HashMap<String,String>ayjamalKartVizit=new HashMap<>();
        ayjamalKartVizit.put("isim","Ayjamal ehet");
        ayjamalKartVizit.put("email","ayjamal@gmail.com");
        ayjamalKartVizit.put("adres","Zeytinburnu/Istanbul");
        ayjamalKartVizit.put("Telefon","5383866800");

        System.out.println("mirzatKartVizit.get(\"isim\") = " + mirzatKartVizit.get("isim"));
        System.out.println("mirzatKartVizit.get(\"Telefon\") = " + mirzatKartVizit.get("Telefon"));


        HashMap<String,HashMap<String,String>> kartVizitler=new HashMap<>();

        kartVizitler.put("mirzat",mirzatKartVizit);
        kartVizitler.put("ayjamal",ayjamalKartVizit);

        System.out.println("kartVizitler.get(\"mirzat\") = " + kartVizitler.get("mirzat"));
        System.out.println("kartVizitler.get(\"ayjamal\") = " + kartVizitler.get("ayjamal"));

        // ayjamalin adresi
        System.out.println("Ayjamalin adresi = " + kartVizitler.get("ayjamal").get("adres"));

        // sadece emaileri yazdirmak

        for (Map.Entry<String,HashMap<String,String>> Email:
             kartVizitler.entrySet()) {
            System.out.println("Email = " + Email.getValue().get("email"));
        }




    }
}
