package Gun36._06_Interface;

public class Dikdortken implements IGeometri{
    private int kisaKenar;
    private int uzunKenar;

    public Dikdortken() {

    }

    @Override
    public int cevresi() {
        return (kisaKenar+uzunKenar)*2;
    }

    @Override
    public int alani() {
        return kisaKenar*uzunKenar;
    }

    public Dikdortken(int kisaKenar, int uzunKenar) {
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }

    public int getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(int kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }
}
