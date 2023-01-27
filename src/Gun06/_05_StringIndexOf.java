package Gun06;

public class _05_StringIndexOf {
    public static void main(String[] args) {
        //01234   :  hariflerin oda numaralari 0 dan baslar -> index
        //bugun

        String cumle="Merhaba dunya";
        // D nin index i kactir
        // M nin index i kactir
        // 0(539)9402128  -> ( in oda numarasi kactir
        //verilen karakterlerin string icindeki Index  ini verir

        System.out.println("cumle.indexOf(\"M\") = " + cumle.indexOf("M")); // o
        System.out.println("cumle.indexOf(\"a\") = " + cumle.indexOf("a")); // 4
        System.out.println("cumle.indexOf(\"ha\") = " + cumle.indexOf("ha"));// 3
        System.out.println("cumle.indexOf(\" \") = " + cumle.indexOf(" ")); //7
        System.out.println("cumle.indexOf(\"A\") = " + cumle.indexOf("A")); //-1 yok demek
        System.out.println("cumle.indexOf(\"a\",5) = " + cumle.indexOf("a",5)); //6
        // a yi aramaya 5 (dahil) nolu index ten sonra basla


    }
}
