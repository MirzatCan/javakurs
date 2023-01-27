package Gun38._03_Abstract;

public class GreekSalad extends Salad{
    public GreekSalad(String name) {
        super(name);
    }

    @Override
    public String madeIn() {
        return "Greek Salad Made in ";
    }
}
