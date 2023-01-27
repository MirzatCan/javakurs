package Gun36._04_Interface;
// 1 class 1 den fazla Interface implements edebilir.
public class Araba implements IYazdirir,IGosterir{
    @Override
    public void goster() {
        System.out.println("Gosterildi");
    }

    @Override
    public void yazdir() {
        System.out.println("Yazdirildi");

    }
}
