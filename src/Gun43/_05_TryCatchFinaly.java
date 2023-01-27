package Gun43;

public class _05_TryCatchFinaly {
    public static void main(String[] args) {
        long starTime=0;
        String str="";

        try {
            starTime=System.currentTimeMillis();
            System.out.println("Hatadan onceki kisim");
            char ilkHarf=str.charAt(0);
            System.out.println("Hatanin oldugu kisim");
            //hata olma olasiginin oldugu kodlar
        }
        catch (Exception ex){
            System.out.println("catch blogu calisti");
            //hata oldugunda yapilacaklar
        }


        finally //hata olsada olmasada calisacak kisim,
                //bu bolum yukardaki surecler oldugunu
                //gostermek icin finally icinde yazilir
        {
            long gecenSure=System.currentTimeMillis()-starTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("Try-catch bloguyla ilgili son yaoilacak seyler");
        }

        System.out.println("Diger calisan kodlar");

        System.out.println("Program sonu");
    }
}
