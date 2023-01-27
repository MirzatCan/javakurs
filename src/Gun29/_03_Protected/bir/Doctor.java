package Gun29._03_Protected.bir;

public class Doctor {
    protected String adi; //default ile ayni
    String bolumu; //default
    private String sicilNo; // private
    public String hastaneAdi; // public


    Doctor(){ // default constructor

    }

    public Doctor(String adi) {  // public oldugu icin istanbul ulasabilir
        //ama sadece hastane  adi
        this.adi = adi;
    }
}
