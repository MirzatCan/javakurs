package Gun34._02_Ornek;

public class Ogrenci {

    private  final int id;
    private String isim;
    private tip tipi;

    private static int idSayac=1;


    public Ogrenci( String isim,tip tipi) {
        setTipi(tipi);
        setIsim(isim);
        this.id=idSayac++;

    }



    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public tip getTipi() {
        return tipi;
    }

    public void setTipi(tip tipi) {
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi=" + tipi +
                '}';
    }
}
