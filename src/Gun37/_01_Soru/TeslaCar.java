package Gun37._01_Soru;

public class TeslaCar extends Vehicle implements IElektiric {

    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changerBattery() {
        return "Batariye 9 yil omru var";
    }

    @Override
    public String drive() {
        return "Auto pilot ozelligi var";
    }
}
