package Gun37._01_Soru;

public class Bus extends Vehicle implements IDeisel{


    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDeisel() {
        return "bir depoda 1000km gider";
    }

    @Override
    public String drive() {
        return "Dayaniklili";
    }
}
