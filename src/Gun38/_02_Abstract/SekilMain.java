package Gun38._02_Abstract;

public class SekilMain {
    public static void main(String[] args) {

        Dikdortgen d1=new Dikdortgen("dik",5);
        d1.ciz();
        System.out.println("d1.getName() = " + d1.getName());
        System.out.println("d1.alan() = " + d1.alan());
        System.out.println("d1.cevre() = " + d1.cevre());
        System.out.println("d1 = " + d1);

        System.out.println("***********************");

        Daire dr1=new Daire("cember",5);
        dr1.ciz();
        System.out.println("dr1.getName() = " + dr1.getName());
        System.out.println("dr1.alan() = " + dr1.alan());
        System.out.println("dr1.cevre() = " + dr1.cevre());
        System.out.println("dr1 = " + dr1);
    }
}
