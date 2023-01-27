package Gun34._03_Ornek;

public class IlkOgrencisi extends Ogrenci {
    private String klup;

    private static int ilkOkulSayac=1;

    public IlkOgrencisi(String isim, tip tipi, String klup) {
        super(isim, tipi,ilkOkulSayac++);
        setKlup(klup);
    }

    public String getKlup() {
        return klup;
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }

    @Override
    public String toString() {
        return "İlkOgrencisi{" +
                "klup='" + klup + '\'' +
                "} " + super.toString();
    }
}
