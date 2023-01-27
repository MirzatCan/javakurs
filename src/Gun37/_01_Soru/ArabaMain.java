package Gun37._01_Soru;

import java.util.ArrayList;

public class ArabaMain {
    public static void main(String[] args) {
        TeslaCar t1 = new TeslaCar("model 5", 300);
        ToyotaPrius p1 = new ToyotaPrius("sedan", 500);
        Bus b1 = new Bus("mersedes", 700);

        ArrayList<Vehicle> arabalar = new ArrayList<>();
        arabalar.add(t1);
        arabalar.add(p1);
        arabalar.add(b1);

        for (Vehicle v : arabalar) {
            System.out.println("**********************");
            System.out.println(v.getClass().getSimpleName()); // klassin adini yazdir
            System.out.println("**********************");
            //mainde girdigimiz bilgileri yazdir
            System.out.println("v.getModel() = " + v.getModel());
            System.out.println("v.getEngine() = " + v.getEngine());

            //diger claaslardaki bilgileri tariyarak yazdir
            if (v instanceof TeslaCar) {
                System.out.println(((TeslaCar) v).drive());
                System.out.println(((TeslaCar) v).changerBattery());
            }
            else
            if (v instanceof ToyotaPrius) {
                System.out.println(((ToyotaPrius) v).changerBattery());
                System.out.println(((ToyotaPrius) v).changerBattery());
                System.out.println(((ToyotaPrius) v).changeOil());
            }
            else
            if (v instanceof Bus) {
                System.out.println(((Bus) v).drive());
                System.out.println(((Bus) v).changeDeisel());
            }
        }
    }
}
