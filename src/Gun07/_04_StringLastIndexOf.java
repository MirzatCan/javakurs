package Gun07;

public class _04_StringLastIndexOf {
    public static void main(String[] args) {
        // indeOf gibi calisir bu aramada bastan bslar
        // lastindexOf ise : aramayi sondan baslar

        //         0123456
        String s1="Merhaba";
        System.out.println("s1.indexOf(\"a\") = " + s1.indexOf("a"));//4
        System.out.println("s1.lastIndexOf(\"a\") = " + s1.lastIndexOf("a")); //6
        // index her zaman tek, sadece barama sondan basliyor
        // yani ilk harf hala 0
    }
}
