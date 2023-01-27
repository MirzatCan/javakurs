package Gun34._03_Ornek;

public class Ogrenci {

    private  final int id;
    private String isim;
    private tip tipi;


    public Ogrenci(String isim, tip tipi,int id) {
        setTipi(tipi);
        setIsim(isim);
        this.id=id;

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
