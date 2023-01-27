package Gun06;

public class _08_stringContains {
    public static void main(String[] args) {
        // contains :  bir stringin içerisinde karakter(lerin) var olup
        // olmadıgını boolean cinsinden söyle true veya false

        String cumle="Merhaba dunya";
        boolean Varmi=cumle.contains("a");
        System.out.println("Varmi = " + Varmi);

        // direk de yapanilirsiniz
        System.out.println("varMi=" + cumle.contains("a"));
        System.out.println("varMi= " + cumle.contains("ha"));


    }
}
