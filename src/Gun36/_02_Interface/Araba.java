package Gun36._02_Interface;

public class Araba implements IYazdirabilir{

    @Override
    public void yazdir() {
        System.out.println("Yazdirma islemi baslasin");
    }
}
