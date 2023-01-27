package Gun23;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");

        //Ekrana yazdirma
        System.out.println("renkler = " + renkler);

        //Ekrana tek tek nasil yazdiririm      ***** foreach
        for (String elaman:   // sira garanti degil
             renkler) {
            System.out.println("elaman = " + elaman);
        }

        // foreach kulanma sekli
        int[] dizi={35,5,65,25,98,567};
        for (int eleman:
             dizi) {
            System.out.println("eleman = " + eleman);
        }

        //set in kendi sirasi nasil ise onun aynisini verir
        Iterator gosterge= renkler.iterator();
        while (gosterge.hasNext()){  //siradaki elaman var ise
            System.out.println("gosterdigi elaman = " + gosterge.next());
            //.next gostergenin gosterdigi elemani temsil ediyor
        }

    }
}
