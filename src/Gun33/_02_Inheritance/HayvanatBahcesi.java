package Gun33._02_Inheritance;

public class HayvanatBahcesi {
    //    Bir hayvanat bahçesi için bir program yazılmak isteniyor.
    //    Kediler için (renk,kilo,cinsi)
    //    kopekler için (renk,kilo, cinsi)
    //    yılanlar için (renk, kilo, cinsi, uzunluk)
    //    ordek için (renk, kilo, cinsi, kanatAcikligi)
    //    bütün hayvanların konustu metodu vardır.(ses cikar)
    public static void main(String[] args) {
        Kopek k1=new Kopek("Beyaz",50,"erkek");
        k1.konustu();
        System.out.println("k1 = " + k1);

        kedi ke1=new kedi("siyah",20,"kiz");
        ke1.konustu();
        System.out.println("ke1 = " + ke1);

        Yilan y1=new Yilan("kirmizi",30,"erkek",70);
        y1.konustu();
        System.out.println("y1 = " + y1);

        Ordek o1=new Ordek("beyaz",4,"kiz",89);
        o1.konustu();
        System.out.println("o1 = " + o1);
    }
}
