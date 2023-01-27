package Gun38._03_Abstract;

public class yemekDunyasi {
    public static void main(String[] args) {
        Baklava b1=new Baklava("baklava");
        System.out.println("b1.madeIn() = " + b1.madeIn());
        System.out.println("b1.taste() = " + b1.taste());
        System.out.println("b1.name = " + b1.name);
        System.out.println("b1 = " + b1);

        System.out.println("****************");

        CheeseCake c1=new CheeseCake("Chesse cake");
        System.out.println("c1.madeIn() = " + c1.madeIn());
        System.out.println("c1.taste() = " + c1.taste());
        System.out.println("c1.name = " + c1.name);
        System.out.println("c1 = " + c1);

        System.out.println("****************");

        GreekSalad g1=new GreekSalad("Greek salad");
        System.out.println("g1.madeIn() = " + g1.madeIn());
        System.out.println("g1.taste() = " + g1.taste());
        System.out.println("g1.name = " + g1.name);
        System.out.println("g1 = " + g1);

        System.out.println("****************");

        SezerSalad s1=new SezerSalad("Sezar salad");
        System.out.println("s1.madeIn() = " + s1.madeIn());
        System.out.println("s1.taste() = " + s1.taste());
        System.out.println("s1.name = " + s1.name);
        System.out.println("s1 = " + s1);
    }
}
