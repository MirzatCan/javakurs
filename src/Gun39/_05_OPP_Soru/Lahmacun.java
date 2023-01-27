package Gun39._05_OPP_Soru;

public class Lahmacun implements IFood{


    @Override
    public void taste() {
        System.out.println("Lahmancun siparis alindi");
    }

    @Override
    public double ucret() {
        return 33;
    }
    public void dough(){
        System.out.println("Hamur hazirlandi");
    }
    public void addMeat(){
        System.out.println("Et eklendi");
    }
    public void bake(){
        System.out.println("Pisirldi");
    }
}
