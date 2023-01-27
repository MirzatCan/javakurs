package Gun36._03_Interface;

public class GeometriMain {
    public static void main(String[] args) {
        Cember c1=new Cember();
        c1.ciz();

        Dikdortgen d1=new Dikdortgen();
        d1.ciz();

        ICizdir c2=new Cember();
        c2.ciz(); // direk class adindan da cagirabiliriz

        cizdirme(c1);
        cizdirme(d1);

    }
    public static void cizdirme(ICizdir iCiz){
        iCiz.ciz();
    }

}
