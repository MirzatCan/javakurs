package Gun27._02_Ornek;

public class Soru {
    public static void main(String[] args) {
        // Math sınıfndaki metodlarıdan 5 tanesini
        // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
        // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
        // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
        // kullanımlarını yazınız.

        int max=myMath.getMax(4,6);
        int min=myMath.getMin(4,6);
        int rnd=myMath.getRandom(10);
        double usSonuc=myMath.getUsAl(2,3);
        double karaKok=myMath.getKareKok(8);

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("rnd = " + rnd);
        System.out.println("usSonuc = " + usSonuc);
        System.out.println("karaKok = " + karaKok);


    }
}
