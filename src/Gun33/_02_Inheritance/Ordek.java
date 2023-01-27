package Gun33._02_Inheritance;

public class Ordek extends HayvanOrtak {
    private int kanatAcikligi;
    public Ordek(String renk, int kilo, String cinsi,int kanatAcikligi) {
        super(renk, kilo, cinsi);
        getKanatAcikligi(kanatAcikligi);
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("vakvak dedi");
    }

    public int getKanatAcikligi(int kanatAcikligi) {
        return this.kanatAcikligi;
    }

    public void setKanatAcikligi(int kanatAcikligi) {
        this.kanatAcikligi = kanatAcikligi;
    }

    @Override
    public String toString() {
        return "Ordek{" +
                "kanatAcikligi=" + kanatAcikligi +
                '}';
    }
}
