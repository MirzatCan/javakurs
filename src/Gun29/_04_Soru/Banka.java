package Gun29._04_Soru;

public class Banka {
    // Hesap (yatan(int), cekilen(int), bakiye(int))
    // Musteri (hesapID(int), ad, soyad, MusteriHesap(Hesap tipinde))
    // Bir banka uygulaması için 1 müşteri tanımlayınız,
    // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,sonra 50 TL çekiniz.
    // Müşteirinin toplan yatanı, toplam cekılenı ve kalan bakiyesini yazdırınız.
    // bakiyeye direk para atanamadıgını kontrol ediniz.
    public static void main(String[] args) {
        Musteri mus1=new Musteri();
        mus1.hesapID=45678;
        mus1.ad="Mirzat";
        mus1.soyAdi="Memet";

        
        mus1.MusteriHesap.paraYatir(100);
        mus1.MusteriHesap.paraYatir(200);
        mus1.MusteriHesap.paraCek(50);


        System.out.println("mus1.MusteriHesap = " + mus1.MusteriHesap);
    }
}
