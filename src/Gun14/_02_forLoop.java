package Gun14;

public class _02_forLoop {
    public static void main(String[] args) {
        // 1 den 5'e kadar olan sayilari ekrana yazdiriniz.

        //1.yontem while ile
        //donguyu kac kere donecegi belli olmayan durumlarda kullanacagiz
        int sayac=0;
        while (sayac<=5){
            System.out.print(sayac +" ");
            sayac++;
        }
        System.out.println(); //1.yontem 2. yontem satir ayirmak icin
        //2.yontem
        //for dongusu, basi belli, sonuc belli, artisi belli ise kullanicaz
        for (sayac=0;sayac<=5;sayac++)
            System.out.print(sayac+" ");


    }
}
