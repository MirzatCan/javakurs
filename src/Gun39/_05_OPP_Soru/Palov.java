package Gun39._05_OPP_Soru;

public class Palov implements IFood{
    @Override
    public void taste() {
        System.out.println("Palov siparisi alindi");
    }

    @Override
    public double ucret() {
        return 44;
    }
    public void fry() {
        System.out.println("kizartildi");
    }
    public void boil(){
        System.out.println("Kaynatildi");
    }

}
