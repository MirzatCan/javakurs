package Gun38._02_Abstract;

public class Dikdortgen extends Sekil {
    private int kenar;
    public Dikdortgen(String name,int kenar) {
        super(name);
        setKenar(kenar);
    }

    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) {
        this.kenar = kenar;
    }

    @Override
    double alan() {
        return kenar*kenar;
    }

    @Override
    double cevre() {
        return kenar*4;
    }

}
