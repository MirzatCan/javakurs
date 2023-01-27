package Gun39._02_OPP_Soru;

public class ABmain {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("A.mesaj = " + A.mesaj);  // ilk adimda direk Adan cagirdi  sonuc = A dan meraba

        B b=new B();
        System.out.println("A.mesaj = " + A.mesaj); // ikinci adimda B ni tamamladi O yuzden A dan cagirsa da sonuc B den merhaba

        A a2=new A();
        System.out.println("A.mesaj = " + A.mesaj); //3.adim A dan baska bir nesne tanimladi ama B ni daha once tamamladigi icin
                                                    //hem B ani ectends yaptigi icin en son atanan deger gerli
                                                    //sonuc hala B den merhaba
        System.out.println("a2.mesaj = " + a2.mesaj); //a2.mesaj diyerek cagirsak da deger cokdan degisti icin
                                                      // sonuc Bden Merhaba


        //**************************************************
        //static oldugu icin
    }
}
