package Gun36._06_Interface;

public class GeometreMain {
    public static void main(String[] args) {

        Kare k1=new Kare();
        k1.setKareKenar(5);
        System.out.println("k1.alani() = " + k1.alani());
        System.out.println("k1.cevresi() = " + k1.cevresi());


        Dikdortken d1=new Dikdortken();
        d1.setUzunKenar(8);
        d1.setKisaKenar(5);
        System.out.println("d1.alani() = " + d1.alani());
        System.out.println("d1.cevresi() = " + d1.cevresi());


    }
}
