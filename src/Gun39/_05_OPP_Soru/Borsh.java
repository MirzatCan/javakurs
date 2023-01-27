package Gun39._05_OPP_Soru;

public class Borsh implements IFood{
    @Override
    public void taste() {
        System.out.println("Borsh siparis alindi");
    }

    @Override
    public double ucret() {
        return 33;
    }
    public void boil(){
        System.out.println("Kaynatildi");

    }
    public void eatTomorrow(){
        System.out.println("Sipiras hazirlandi");
    }
}
