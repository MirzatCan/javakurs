package Gun32._03_Encepsulation;

public class Ogrenciler {
    private String ogrenciAd;
    private int OrenciYas;
    private String sinifAdi;

    private int ogrenciId;

    static int idSayac=1;

    public Ogrenciler(String ogrenciAd, int orenciYas, String sinifAdi) {
       setOgrenciAd(ogrenciAd);
       setOrenciYas(orenciYas);
       setSinifAdi(sinifAdi);
       setOgrenciId(idSayac++);
    }

    public String getOgrenciAd() {
        return ogrenciAd;
    }

    public void setOgrenciAd(String ogrenciAd) {
        this.ogrenciAd = ogrenciAd;
    }

    public int getOrenciYas() {
        return OrenciYas;
    }

    public void setOrenciYas(int orenciYas) {
        OrenciYas = orenciYas;
    }

    public String getSinifAdi() {
        return sinifAdi;
    }

    public void setSinifAdi(String sinifAdi) {
        this.sinifAdi = sinifAdi;
    }

    public int getOgrenciId() {
        return ogrenciId;
    }

    public void setOgrenciId(int ogrenciId) {
        this.ogrenciId = ogrenciId;
    }

    @Override
    public String toString() {
        return "Ogrenciler{" +
                "ogrenciAd='" + ogrenciAd + '\'' +
                ", OrenciYas=" + OrenciYas +
                ", sinifAdi='" + sinifAdi + '\'' +
                '}';
    }
}
