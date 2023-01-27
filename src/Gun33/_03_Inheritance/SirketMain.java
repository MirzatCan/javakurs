package Gun33._03_Inheritance;

public class SirketMain {
    public static void main(String[] args) {

        Calisan c1=new Calisan("mirzat",5000,2);
        c1.maasHesaplama();

        GenelMudur g1=new GenelMudur("xirzat",7000,3,15000);
        g1.maasHesaplama();

        System.out.println("c1 = " + c1);
        System.out.println("g1 = " + g1);
    }
}
