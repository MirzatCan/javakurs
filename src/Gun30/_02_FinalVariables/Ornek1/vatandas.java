package Gun30._02_FinalVariables.Ornek1;

public class vatandas {
    String isim;
    final int tcNo;// degistirilemez
    //yani sadece 10kez veri atama sansi var.

    static int sayac=1;

    public vatandas(String isim) {
        this.isim = isim;
        this.tcNo = sayac++;
        //final degiskeni sadece 1 kez veri atanabilir
        //o da ya tanimlanirken, ya da Constructor da
    }

    @Override
    public String toString() {
        return "vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
