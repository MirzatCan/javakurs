package Gun07;

public class _09_StringToLowerCase {
    public static void main(String[] args) {
        // toLowerCase : Stringi kucuk harfe cevirir.
        
        String s1="Merhaba Dunya";

        System.out.println("s1 = " + s1);
        System.out.println("s1.toLowerCase() = " + s1.toLowerCase()); //kucuk harfe donusturdu

        System.out.println("s1.toLowerCase().startsWith(\"me\") = " + s1.toLowerCase().startsWith("me"));
        // once toLowerCase yaparak kucuk harfa donustur. sonra "me" ile basliyor mu

    }
}
