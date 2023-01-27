package Gun07;

public class _11_StringReplace {
    public static void main(String[] args) {

        String s1="Merhaba dunya";

        System.out.println("s1 = " + s1);
        System.out.println("s1.replace(\"a\",\"e\") = " + s1.replace("a","e"));
        System.out.println("s1.replace(\"ba\",\"he\") = " + s1.replace("ba","he"));
        System.out.println("s1.replace(\"dunya\",\"java\") = " + s1.replace("dunya","java"));
        System.out.println("s1.replace(\"a\",\"\") = " + s1.replace("a",""));
          //tirak icinde hic bir sey yok a larin hepsini yok et.
    }
}
