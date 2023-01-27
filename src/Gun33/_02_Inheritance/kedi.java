package Gun33._02_Inheritance;

public class kedi extends HayvanOrtak{
    public kedi(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("miyavladi");
    }
}
