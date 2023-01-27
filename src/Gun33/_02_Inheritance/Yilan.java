package Gun33._02_Inheritance;

public class Yilan extends HayvanOrtak{

    private int uzunluk;
    public Yilan(String renk, int kilo, String cinsi, int uzunluk) {
        super(renk, kilo, cinsi);
        setUzunluk(uzunluk);

    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("gizladi");
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    @Override
    public String toString() {
        return "Yilan{" +
                "uzunluk=" + uzunluk +
                '}';
    }
}
