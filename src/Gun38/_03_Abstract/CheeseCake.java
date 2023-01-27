package Gun38._03_Abstract;

public class CheeseCake extends Sweet {
    public CheeseCake(String name) {
        super(name);
    }

    @Override
    public String madeIn() {
        return "Cheese Cake Made in US";
    }
}
