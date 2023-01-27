package Gun32._02_Encepsulation;

public class fields {

    private String renk;
    private int model;
    private double motorHacmi;
    private int kapiSayi;


    public fields(String renk, int model, double motorHacmi, int kapiSayi) {
        setRenk(renk);
        setModel(model);
        setMotorHacmi(motorHacmi);
        setKapiSayi(kapiSayi);
//        this.renk = renk;
//        this.model = model;
//        this.motorHacmi = motorHacmi;
//        this.kapiSayi = kapiSayi;
    } // bunu yamazsak a2 deki gibi direk atanabilir
      //2010 dan buyuk dememize ragmen 1987 atilabildi
      //o yuzden degistirdik.

    public fields() {

    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        if (model>2010)
        this.model = model;
    }

    public double getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(double motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public int getKapiSayi() {
        return kapiSayi;
    }

    public void setKapiSayi(int kapiSayi) {
        this.kapiSayi = kapiSayi;
    }

    @Override
    public String toString() {
        return "fields{" +
                "renk='" + renk + '\'' +
                ", model=" + model +
                ", motorHacmi=" + motorHacmi +
                ", kapiSayi=" + kapiSayi +
                '}';
    }

}
