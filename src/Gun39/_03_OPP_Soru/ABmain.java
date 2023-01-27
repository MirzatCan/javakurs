package Gun39._03_OPP_Soru;

public class ABmain {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("a.mesaj = " + a.mesaj);

        B b=new B();
        System.out.println("b.mesaj = " + b.mesaj);

        A a2=new A();
        System.out.println("a2.mesaj = " + a2.mesaj);

        //********************************
        //static degil

        //sadece nesneden cagricaz oyuzden degismez,nerden cagirsak o degeri verir

    }
}
