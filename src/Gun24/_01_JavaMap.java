package Gun24;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
        //Set-> HashSet, LinkedHashSed, TreeSet
        //Map-> HashMap, LinkedHashMap, TreeMap
        //Map = Anahtar + Set  -> Anahtarli Set

        //Anahtarin tipi Integer, degerinin tipi String olsun
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1997,"mirzat");
        hm.put(2000,"xirzat");
        hm.put(1970,"memet");
        hm.put(2019,"Tumaris");
        hm.put(1997,"Ayjamal");  //ayni anahtar kulandigimizda oncekinin yerine atiyor

        System.out.println("hm = " + hm);

        //get.  o anahtardaki elemani verir 
        System.out.println("hm.get(2019) = " + hm.get(2019));

        //containsKey -> bu anahtarli kelime var mi demek, boolean cinsinden
        System.out.println("hm.containsKey(2019) = " + hm.containsKey(2019));  //true
        System.out.println("hm.containsKey(1998) = " + hm.containsKey(1998));  //false

        System.out.println("hm.keySet() = " + hm.keySet()); // sadece anahtarlari yazdir
        System.out.println("hm.values() = " + hm.values()); // sadece elemanlari  yazdir

        hm.remove(2000);  // silme
        System.out.println("hm = " + hm);

        System.out.println("hm.size() = " + hm.size());

        hm.clear();  // temizleme
        System.out.println("hm = " + hm);


        // ************************
        // Map in farki index kullanmadan, kendimiz Index gibi bir sayi belirleyebiliriz.



        
        

    }
}
