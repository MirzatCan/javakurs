package Gun38._03_Abstract;

public abstract class Sweet extends Food {
    public Sweet(String name) {
        super(name);
    }

    @Override
    public String taste() {
        return "Tatli, sekerli, iyi";
    }
}
