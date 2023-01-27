package Gun34._02_Ornek;

public class Okul {
    public static void main(String[] args) {
        LiseOgrencisi lo1=new LiseOgrencisi("Mirzat",tip.LISE,"say");
        LiseOgrencisi lo2=new LiseOgrencisi("xirzat",tip.LISE,"soz");

        IlkOgrencisi io1=new IlkOgrencisi("tumaris",tip.ILK,"dans");
        IlkOgrencisi io2=new IlkOgrencisi("ayjamal",tip.ILK,"spor");

        System.out.println("lo1 = " + lo1);
        System.out.println("lo2 = " + lo2);
        System.out.println("io1 = " + io1);
        System.out.println("io2 = " + io2);


    }
}
