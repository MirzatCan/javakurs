package Gun38._03_Abstract;

public abstract class Salad extends Food{
    public Salad(String name) {
        super(name);
    }

    @Override
    public String taste() {
        return "eksi, limonlu, sirkeli";
    }
}
