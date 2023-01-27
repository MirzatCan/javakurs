package Gun39._04_OPP_Soru;

class C{
    public C(){
        System.out.println("C");
    }
}
class B extends C{
    public B(){
        System.out.println("B");
    }
}
class A extends B{
    public A(){
        System.out.println("A");
    }
}

public class Soru {
    public static void main(String[] args) {
        A a=new A();


    }
}
