package Gun07;

public class _03_StringIsEmpty {
    public static void main(String[] args) {
        // isEmpty: bir Stringin icinde bir sey var mi yok mu boolean olarak verir
        // kabaca "bos mu"  demek.
        String s1="merhaba";
        System.out.println("s1.isEmpty() = " + s1.isEmpty());

        String s2=" "; // bosluk karakteri A gibi bir karakterdir.
        System.out.println("s2.isEmpty() = " + s2.isEmpty());

        String s3="";
        System.out.println("s3.isEmpty() = " + s3.isEmpty());

    }
}
