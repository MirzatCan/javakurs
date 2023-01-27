package Gun35._03_polymorphism;

public class Ogrenci extends kisi {
    private String subesi;

    public Ogrenci(String ad, String soyad, String görevi,String subesi) {
        super(ad, soyad, görevi);
        setSubesi(subesi);
    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "subesi='" + subesi + '\'' +
                "} " + super.toString();
    }


}
