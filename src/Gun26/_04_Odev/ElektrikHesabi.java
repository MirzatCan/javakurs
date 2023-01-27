package Gun26._04_Odev;

public class ElektrikHesabi {
    int toplamTuketim=0;
    double birimFiyat=0.7;
    double fatura=0;


    public void tuketimEkle(int aylikYuketim){
        toplamTuketim+=aylikYuketim;

    }

    public void  toplamTuketimYaz(){
        System.out.println("toplamTuketim = " + toplamTuketim);

    }

    public void  faturaYaz(String isim) {
        fatura=toplamTuketim*birimFiyat;
        System.out.println("*************");
        System.out.println("  Faturaniz  ");
        System.out.println("*************");
        System.out.println("Musteri="+isim);
        System.out.println("Toplam Tuketim = " + toplamTuketim);
        System.out.println("Toplam Tutar= " + Math.round(fatura)); // Math.round kulanma sebebimiz yukaiya yuvarlamak 125.999999  -> 126+
        System.out.println("*************");


    }
}
