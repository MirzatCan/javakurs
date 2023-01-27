package Gun36._06_Interface;

public class Kare implements IGeometri{

    private int kareKenar;

    @Override
    public int cevresi() {
        return kareKenar*4;
    }
    @Override
    public int alani() {
        return kareKenar*kareKenar;
    }

    public Kare() {
        setKareKenar(kareKenar);
    }

    public int getKareKenar() {
        return kareKenar;
    }

    public void setKareKenar(int kareKenar) {
        this.kareKenar = kareKenar;
    }
}
