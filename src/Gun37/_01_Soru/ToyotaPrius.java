package Gun37._01_Soru;

public class ToyotaPrius extends Vehicle implements IElektiric,IGas{

    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changerBattery() {
        return "batariye 5 yil omru var";
    }

    @Override
    public String changeOil() {
        return "Bir depo ile 300 km gider";
    }

    @Override
    public String drive() {
        return "Kendi surme ozelligi var";
    }
}
