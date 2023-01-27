package Gun39._01_OPP_Soru;

public class Kartal extends Hayvan{


    public Kartal(String isim, Boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("kus etleri");
    }

    @Override
    void yemekMiktari() {
        System.out.println("3kg yemek");

    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("6 saat");

    }

    @Override
    void sesi() {
        System.out.println("kartal sesi");

    }
}
