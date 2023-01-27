package Gun27._03_Ornek;
import java.util.ArrayList;
public class Ogrenciler {
    String isim;
    int maxSaat;
    ArrayList<dersler> orenciAldigiDers=new ArrayList<>();

    public void dersEkle(dersler ders){
        int suAnToplamSaat=0;
        for (dersler d:orenciAldigiDers) {
            suAnToplamSaat+=d.dersSaat;
        }
        if (suAnToplamSaat+ ders.dersSaat<=maxSaat)
        orenciAldigiDers.add(ders);
        else
            System.out.println("Kredi siniri asildi");
    }
    public void dersleriYzdir(){
        System.out.println("Sayin "+isim);
        System.out.println("Aldiginiz dersler asagdadir");
        for (dersler d:orenciAldigiDers)
            System.out.println(d.dersAdi +" "+ d.dersSaat);
    }

    public static void unversiteKurallariYaz(){
        System.out.println("Kural 1: Çaysız ve üzümsüz derse gelme.");
        System.out.println("Kural 2: Uykunu mutlaka al, sağlık en önemlisi.");
        System.out.println("Kural 3: Her zaman dinç ve dinamik ol ve pozitif ol.");
        System.out.println("Kural 4: En başta verdiğin sözü unutma, şu an kamptasın.");
        System.out.println("Kural 5: İnş, biz bu işi başaracağız.");
    }
}
