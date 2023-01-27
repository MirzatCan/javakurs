package Gun32._01_Encepsulation;

public class Kisi {
    String adi; //25 karakter olsun
    private String soyAdi;
    private int yas;

    void yasAta(int yas){
        if (yas>0)
            this.yas=yas;
        else
            System.out.println("hatali giris");
    }

    int yasVer(){ // bunu yapmamizin sebebi private diye kapattigimiz
        // icin boyle yaparak k1.yas diye yazdirabilmek
        return this.yas;
    }

    void soyAdAta(String soyAdi){
        if (soyAdi.length()<25)
            this.soyAdi=soyAdi;
        else
            System.out.println("hatali giris");
    }


    @Override
    public String toString() {
        return "Kisi{" +
                "adi='" + adi + '\'' +
                ", soyAdi='" + soyAdi + '\'' +
                ", yas=" + yas +
                '}';
    }
}
