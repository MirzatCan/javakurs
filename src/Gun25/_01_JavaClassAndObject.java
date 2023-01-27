package Gun25;

// class-tiplerin tanimladigi yer
public class _01_JavaClassAndObject {

    //metodlarin yazildigi yer
    public static void main(String[] args) {//basla
        //ana programin basladigi ve calistigi yer
        int sayi=5;

        araba benimArabam=new araba(); // araba tur, tip adi, benimArabam nesene
        benimArabam.marka="BMW";
        benimArabam.renk="siyah";
        benimArabam.motorHacimi=1600;
        benimArabam.yili=2020;

        System.out.println("benimArabam.yili = " + benimArabam.yili);
        System.out.println("benimArabam.marka = " + benimArabam.marka);
        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam.motorHacimi = " + benimArabam.motorHacimi);


    }//dur

    //metodlarin yazildigi yer
}
// class-tiplerin tanimladigi yer

class araba{
    String renk;
    int yili;
    String marka;
    int motorHacimi;
}