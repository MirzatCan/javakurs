package Gun33._02_Inheritance;

public class Kopek extends HayvanOrtak {
    public Kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }


    @Override
    public void konustu() {
        super.konustu();
        System.out.println("Havladi");
    }
}
