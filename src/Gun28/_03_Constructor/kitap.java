package Gun28._03_Constructor;

public class kitap {
    String kitapAdi;
    int yayinYili;
    String yazar;


    public kitap(String kitapAdi, int yayinYili, String yazar) {
        this.kitapAdi = kitapAdi;
        this.yayinYili = yayinYili;
        this.yazar = yazar;
    }

    public kitap(String kitapAdi, int yayinYili) {
        this.kitapAdi = kitapAdi;
        this.yayinYili = yayinYili;
    }

    public kitap(String yazar) {
        this.yazar = yazar;
    }

    public kitap() {
    }

    @Override
    public String toString() {
        return "kitap{" +
                "kitapAdi='" + kitapAdi + '\'' +
                ", yayinYili=" + yayinYili +
                ", yazar='" + yazar + '\'' +
                '}';
    }
}

