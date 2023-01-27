package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
        double oran=3.2;
        int sayi=5;

        sayi=(int)oran; // buyuk bir alani kucuk bir alana atiyorsun.
        //tehlikeli islem yapiyorsun, bundan dolayi challenger patladi.
        //degerler bak,eger olusan veri kaybini anladiysan ve kabul ediyorsan
        //bana bilerek yaptigini goster.

        System.out.println("sayi = " + sayi); // veri kaybi yasadi 3.2 degil 3 yadirdi

        byte kisaKenar=5;
        byte uzunKenar=7;

        byte cevre=(byte)(kisaKenar+kisaKenar+uzunKenar+uzunKenar);
        // sen esitledigin 2.tarafi rakamlar toplandi, benim toplam burada INT durumunda
        // byte cevre=5+5+7+7;  int -> byte atmaya calisiyorsun.
        // eger veri kaybi olmayacagindan eminden, veri kaybi onemli degilse
        // bana bunu yazarak goster.  onune byte yazmak zorundasin.

        int cerre2=kisaKenar+kisaKenar+uzunKenar+uzunKenar; // ya da direk INT yap
        System.out.println("cevre = " + cevre);
        System.out.println("cerre2 = " + cerre2);




    }
}
