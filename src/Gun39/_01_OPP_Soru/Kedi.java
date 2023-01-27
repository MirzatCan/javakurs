package Gun39._01_OPP_Soru;

public class Kedi extends Hayvan {


    public Kedi(String isim, Boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("Kedi mamasi");

    }

    @Override
    void yemekMiktari() {
        System.out.println("1kg mama");

    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("12 saat");

    }

    @Override
    void sesi() {
        System.out.println("miyav");

    }
}
