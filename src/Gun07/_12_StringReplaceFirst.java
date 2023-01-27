package Gun07;

public class _12_StringReplaceFirst {
    public static void main(String[] args) {
        // replaceFirst : bir Stringin icindeki karakterlerin verilerini degisterir. sadece ilk

        String s1="Merhaba Dunya";

        System.out.println("s1 = " + s1);
        System.out.println("s1.replaceFirst(\"a\",\"b\") = " + s1.replaceFirst("a","b"));
        System.out.println("s1.replaceFirst(\"ba\",\"he\") = " + s1.replaceFirst("ba","he"));
        System.out.println("s1.replaceFirst(\"Dunya\",\"java\") = " + s1.replaceFirst("Dunya","java"));
        System.out.println("s1.replaceFirst(\"a\",\"\") = " + s1.replaceFirst("a",""));

    }
}
