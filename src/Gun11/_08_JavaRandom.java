package Gun11;

public class _08_JavaRandom {
    public static void main(String[] args) {
        //math.Random() ： double sayi uretir. 0-0.9999999 arasi

        double sayi=Math.random();
        System.out.println("sayi = " + sayi);

        //0-6 arasi uretsin
        //6 ile carparim
        //0-5.999999
        //int cevirsirsem direk 0-5 sayi verir

        int randomSayi=(int)(Math.random()*6);//carptiktan sonra int ceviricez.yoksa direk 0 verir.
        System.out.println("randomSayi = " + randomSayi);

    }
}

