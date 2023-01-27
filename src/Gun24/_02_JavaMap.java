package Gun24;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _02_JavaMap {
    public static void main(String[] args) {

        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1997,"mirzat");
        hm.put(2000,"xirzat");
        hm.put(1970,"memet");
        hm.put(2019,"Tumaris");
        hm.put(1997,"Ayjamal");

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        //Anahrae yazdirma
        for (Integer K:
                hm.keySet()) {
            System.out.print(K+" ");
        }
        System.out.println();

        // elaman yazdirma
        for (String E:
                hm.values()) {
            System.out.print(E+" ");
        }
        System.out.println();

        //anahtar ve elaman beraber yazdirma
        for (Map.Entry<Integer,String> kv:hm.entrySet()) {
            System.out.println(kv.getKey() + "-" + kv.getValue());
        }

        //*********************
        //foreach kulanarak yazdirma.

    }
}