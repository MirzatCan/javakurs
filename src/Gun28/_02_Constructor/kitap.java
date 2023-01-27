package Gun28._02_Constructor;

public class kitap {
    String kitapAdi;
    int yayinYili;
    String yazar;

    public kitap(String kitapAdi,int yayinYili,String yazar){
        this.kitapAdi=kitapAdi;
        this.yayinYili=yayinYili;
        this.yazar=yazar;
    }

    public String toString(){
        return kitapAdi+"  "+yayinYili+"  "+yazar;
    }

    // hocam 3 tane public kitap kulanarak yapti

}
