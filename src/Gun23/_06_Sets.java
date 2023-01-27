package Gun23;

import java.util.HashSet;

public class _06_Sets {
    public static void main(String[] args) {
        HashSet<Integer> setA=new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet<Integer> setB=new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        System.out.println("setA = " + setA);
        System.out.println("setB = " + setB);

        // birlestirme
        HashSet<Integer> birlesikHali=new HashSet<>();
        birlesikHali.addAll(setB);
        birlesikHali.addAll(setA);
        System.out.println("birlesikHali = " + birlesikHali);

        // farki
        HashSet<Integer> farki=new HashSet<>();
        farki.addAll(setA);
        farki.removeAll(setB);
        System.out.println("farki = " + farki);

        //ortak elamanlar ,  kesisim
        HashSet<Integer> ortakElaman=new HashSet<>();
        ortakElaman.addAll(setA);
        ortakElaman.retainAll(setB);
        System.out.println("ortakElaman = " + ortakElaman);







    }
}
