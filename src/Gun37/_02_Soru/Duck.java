package Gun37._02_Soru;

public class Duck implements IFlying,ISailing{
    @Override
    public String flying() {
        return "hem ucuyorr";
    }

    @Override
    public String food() {
        return "yemek yiyor";
    }

    @Override
    public String sailing() {
        return "hem yuzuyor";
    }
}
