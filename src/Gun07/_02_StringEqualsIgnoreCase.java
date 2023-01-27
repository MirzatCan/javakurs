package Gun07;

public class _02_StringEqualsIgnoreCase {
    public static void main(String[] args) {

        String s1="merhaba";
        String s2="MERHABA";

        System.out.println("s2.equals(s1) = " + s2.equals(s1)); // eguals karsilastirir. buyuk kucuk harf farkli
        System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase(s2));
        //egualsIngnoreCase -> buyuk kucuk harf esit olarak say demek.

    }
}
