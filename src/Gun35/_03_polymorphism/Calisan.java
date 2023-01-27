package Gun35._03_polymorphism;

public class Calisan extends kisi {
    private String departman;

    public Calisan(String ad, String soyad, String görevi,String departman) {
        super(ad, soyad, görevi);
        setDepartman(departman);
    }


    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "departman='" + departman + '\'' +
                "} " + super.toString();
    }
}
