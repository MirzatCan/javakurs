package Gun07;

public class _07_StringStartsWith {
    public static void main(String[] args) {
        // StarrsWith : bununla basliyor mu
        // sonuc true veya false

        String s1="Merhaba";

        System.out.println("s1.startsWith(\"Me\") = " + s1.startsWith("Me"));
        System.out.println("s1.startsWith(\"ME\") = " + s1.startsWith("ME"));  // buyuk kucuk harf farkediyor.
        System.out.println("s1.startsWith(\"er\") = " + s1.startsWith("er"));
    }
}
