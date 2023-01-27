package Gun35._03_polymorphism;

public class kisi {
    private String ad;
    private String soyad;
    private String görevi;

    public kisi(String ad, String soyad, String görevi) {
        setAd(ad);
        setSoyad(soyad);
        setGörevi(görevi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGörevi() {
        return görevi;
    }

    public void setGörevi(String görevi) {
        this.görevi = görevi;
    }

    @Override
    public String toString() {
        return "kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", görevi='" + görevi + '\'' +
                '}';
    }

    public static void kimlikYaz(kisi gelenKisi){
        System.out.println("*******Kimlik bilgileri*******");
        System.out.println("Adi=" + gelenKisi.getAd());
        System.out.println("Soyad= " + gelenKisi.getSoyad());
        System.out.println("getGörevi= " + gelenKisi.getGörevi());

        if (gelenKisi instanceof Ogrenci)
            System.out.println("Subesi= " + ((Ogrenci) gelenKisi).getSubesi());
        if (gelenKisi instanceof Calisan)
            System.out.println("Departman= " + ((Calisan) gelenKisi).getDepartman());

    }
}
