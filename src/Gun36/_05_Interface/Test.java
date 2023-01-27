package Gun36._05_Interface;

public class Test implements IGoster,IYazdir{

    @Override
    public void goster() {
        System.out.println("Gosterildi");

    }

    @Override
    public void yaz() {
        System.out.println("yazildi");

    }

    @Override
    public void yaz(String msg) {
        System.out.println(msg);

    }
}


//         Benzinli arac
//          4 tekerlek
//          direksiyon
//          aynalar
//          kapılar
//          benzin motoru
//
//          Elektrikli arac
//          4 tekerlek
//          direksiyon
//          aynalar
//          kapılar
//          elektirk motoru
//          batarya
//
//          hem Elektrikli hem Benzinli Hibrit
//          4 tekerlek
//          direksiyon
//          aynalar
//          kapılar
//          benzin motoru
//          elektrik motoru
//          batarya
