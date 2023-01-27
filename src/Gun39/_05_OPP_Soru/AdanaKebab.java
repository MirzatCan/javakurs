package Gun39._05_OPP_Soru;

public class AdanaKebab implements IFood{

    public void taste() {
        System.out.println("Adana Kebap siparis alindi");
    }

    @Override
    public double ucret() {
        return 55;
    }

    public void marinade(){
        System.out.println("marine edildi");
    }
    public void grill(){
        System.out.println("izgara yapildi");
    }
}
