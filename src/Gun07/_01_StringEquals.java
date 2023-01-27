package Gun07;

public class _01_StringEquals {
    public static void main(String[] args) {
        // equals : 2 Stringin birbirine esit olup olmadigini kontrol eder
        // sonuc boolean

        String s1="Merhaba";
        String s2="MERHABA";

        boolean esitmi=s1.equals(s2); // s1 esit mi s2 ye
        System.out.println("esitmi = " + esitmi);

        System.out.println("s1 = " + s1.equals(s2));

        System.out.println("s2.equals(MERHABA) = " + s2.equals("MERHABA"));



    }
}
