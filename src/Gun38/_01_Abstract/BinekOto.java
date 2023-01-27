package Gun38._01_Abstract;
// interface i class icinde kulanmak
//ayri bir interface dosyasi acmaya gerek yok

//2si bir arada => 1 interface + 1 parent class = abstract
public abstract class BinekOto {
    private String marka;
    private int uretimYeri;
    private int vitesAdedi;

    public BinekOto(String marka, int uretimYeri, int vitesAdedi) {
        setMarka(marka);
        setUretimYeri(uretimYeri);
        setVitesAdedi(vitesAdedi);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimYeri() {
        return uretimYeri;
    }

    public void setUretimYeri(int uretimYeri) {
        this.uretimYeri = uretimYeri;
    }

    public int getVitesAdedi() {
        return vitesAdedi;
    }

    public void setVitesAdedi(int vitesAdedi) {
        this.vitesAdedi = vitesAdedi;
    }

    @Override
    public String toString() {
        return "BinekOto{" +
                "marka='" + marka + '\'' +
                ", uretimYeri=" + uretimYeri +
                ", vitesAdedi=" + vitesAdedi +
                '}';
    }

    abstract int hizlanmaSuresi();  // burda da abstract kulanicaz
}
