package Gun38._03_Abstract;

public abstract class Food {
    public String name;

    abstract public String madeIn();

    abstract String taste();

    public Food(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                "Made in='" + madeIn() + '\'' +
                "Taste='" + taste() + '\'' +
                '}';
    }
}
