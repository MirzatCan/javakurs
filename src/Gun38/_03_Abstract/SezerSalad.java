package Gun38._03_Abstract;

public class SezerSalad extends Salad{
    public SezerSalad(String name) {
        super(name);
    }

    @Override
    public String madeIn() {
        return "Sezar Salad Made in Mediterranean";
    }
}
