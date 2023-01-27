package Gun06;

public class _03_StringCharAt {
    public static void main(String[] args) {
        // CharAt  istenilen noktadaki karakteri verir
        //karakterlerin sirasi 0 dan baslar ve buna index denir.
        //            0123456789012
        String cumle="Merhaba Dunya"; //leagth 13 ama karakterlerin odasi indexi 0-12 dahil

        char ilkHarf=cumle.charAt(0);
        System.out.println("ilkHarf = " + ilkHarf);


    }
}
