package Gun16;

public class _05_JavaArray {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra rndom olarak bir tanesini seçip ekrana seçileni yazıdırnız.
        String[] tvKanal={"TRT","kanalD","atv","fox","haberTurk"};
        int random=(int)(Math.random()*(tvKanal.length));
        System.out.println(tvKanal[random]);

    }
}
