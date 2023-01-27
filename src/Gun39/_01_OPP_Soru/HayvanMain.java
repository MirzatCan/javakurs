package Gun39._01_OPP_Soru;

public class HayvanMain {
    public static void main(String[] args) {
        Kedi k1=new Kedi("kedicik",false,"2020mart");
        k1.yiyecegi();
        k1.yemekMiktari();
        k1.gunlukUykuSuresi();
        k1.sesi();
        System.out.println("k1 = " + k1);

        System.out.println("****************");

        Kartal ka1=new Kartal("kara kartal",true,"2015");
        ka1.yiyecegi();
        ka1.yemekMiktari();
        ka1.gunlukUykuSuresi();
        ka1.sesi();
        System.out.println("ka1 = " + ka1);
    }
}
