package Gun33._03_Inheritance;

public class GenelMudur extends Calisan{

    private int tazminat;
    public GenelMudur(String isim, double maas, int maasKatSayisi,int tazminat) {
        super(isim, maas, maasKatSayisi);
        setTazminat(tazminat);
    }


    @Override
    public double maasHesaplama() {
        return super.maasHesaplama()+getTazminat();
    }

    public GenelMudur(int tazminat) {
        super();
        setTazminat(tazminat);
    }

    public int getTazminat() {
        return tazminat;
    }

    public void setTazminat(int tazminat) {
        this.tazminat = tazminat;
    }

    @Override
    public String toString() {
        return "GenelMudur{" +
                "isim='" + getIsim() + '\'' +
                ", maas=" + getMaas() +
                ", maasKatSayisi=" + getMaasKatSayisi() +
                ", tazminat=" + tazminat +
                ", Odenecek maas=" + maasHesaplama()+
                '}';
    }
}
