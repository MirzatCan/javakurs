package Gun38._02_Abstract;

public class Daire extends Sekil{
    private int r;
    public Daire(String name,int r) {
        super(name);
        setR(r);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    double alan() {
        return r*r*3.14;
    }

    @Override
    double cevre() {
        return r*2*3.14;
    }
}
