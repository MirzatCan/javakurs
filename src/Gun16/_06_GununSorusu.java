package Gun16;

public class _06_GununSorusu {
    public static void main(String[] args) {

        // TODO : gunun sorusu : bir döngü ile 5 tane rasgele buldurunuz
        // TODO : fakat bir buldunu tekrar bulmasın
        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra rndom olarak bir tanesini seçip ekrana seçileni yazıdırnız.

        String[] tvKanal={"TRT","kanalD","atv","fox","haberTurk"};
        for (int i = 0; i < tvKanal.length; i++) {
            int random=(int)(Math.random()*(tvKanal.length));
            System.out.println(tvKanal[random]);



        }


    }
}
