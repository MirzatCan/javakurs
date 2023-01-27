package Gun32._03_Encepsulation;

import java.util.ArrayList;

public class Okul {
    private String okulAdi;
    private int kontencan;

    private ArrayList<Ogrenciler> org=new ArrayList<>();


    public Okul(String okulAdi, int kontencan) {
        setOkulAdi(okulAdi);
        setKontencan(kontencan);
    }

    public Okul() {

    }

    public String getOkulAdi() {
        return okulAdi;
    }

    public void setOkulAdi(String okulAdi) {
        this.okulAdi = okulAdi;
    }

    public int getKontencan() {
        return kontencan;
    }

    public void setKontencan(int kontencan) {
        this.kontencan = kontencan;
    }

    public ArrayList<Ogrenciler> getOrg() {
        return org;
    }

    public void setOrg(ArrayList<Ogrenciler> org) {
        this.org = org;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulAdi='" + okulAdi + '\'' +
                ", kontencan=" + kontencan +
                ", org=" + org +
                '}';
    }
}
