package Gun04;

public class _07_SayiKelime {
    public static void main(String[] args) {
        //sayilari birbirine cevirdik
        //yazilarin rekamlara cevirmesi, rakamlarin yaziya cevirmesi var

        String ad="Mirzat";
        String kelimeSayi="65"; //string halde, toplama gibi isleme giremez.

        int sayiDeger=Integer.parseInt(kelimeSayi); // sayiya donusur. Integer.parseInt->buyuk harf Int

        int toplam=sayiDeger+sayiDeger;
        System.out.println("toplam = " + toplam);

        //toplam su anda int sayi, bunu String nasil donustururum.
        String Strtoplam= Integer.toString(toplam); //String e donusturur. Integer.toString->buyuk harf Int
        System.out.println("Strtoplam = " + Strtoplam);





    }
}
