package Gun38._02_Abstract;

public abstract class Sekil {
    private String name;


    abstract double alan();

    abstract double cevre();

    public Sekil(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void ciz(){
        System.out.println(getName()+" cizildi");
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +
                "alan='" + alan() + '\'' +
                "cevre='" + cevre() + '\'' +
                '}';
    }
}


