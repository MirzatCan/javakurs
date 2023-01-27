package Gun34._04_Protected.paket1;

public class P1Main {
    public static void main(String[] args) {
        P1Hayvan p1h=new P1Hayvan();
        p1h.ad="kedi"; // public erisildi
        p1h.yas=2;   //default erisildi
        p1h.cinsi="kiz"; //protected erisildi
        //p1h.renk  sadece kendi clasindan erisebilir


    }
}
