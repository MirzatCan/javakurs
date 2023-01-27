package Gun20;

public class _01_JavaMethod {
    public static void main(String[] args) {
        System.out.println("merhaba dunya");
        System.out.println("merhaba dunya");

        //
        merhabaYaz();// giden yok , donen yok
        toplamYaz(4,5);//giden var, donen yok
        int enBuyuk=Math.max(4,5);//giden var donen var
        double sayi=Math.random();//giden var donen var (Fonksiyonu bir seye esitleyebilir)

        enbYaz(4,5);  //fonkisyonu esitlemeden en buyuk olani yazdirma

        enBuyuk=enbBul(4,5);   //fonkisyonu esitlemek.
        System.out.println("enBuyuk = " + enBuyuk);
        //fonkisyonda return oldugu icin main de yazdirabiliyoruz
        //yani fonkisyon sonucu olabilir
    }
    public static int enbBul(int a,int b){ //donucek tip
        int donecek=0;
        if (a>b)
            donecek=a;
        else
            donecek=b;
        return donecek; // donucek deger
    }


    public static void enbYaz(int a,int b){
        if (a>b)
            System.out.println(a);
        else
            System.out.println(b);
    }

    public static void toplamYaz(int a,int b){
        System.out.println(a+b);

    }



    public static void merhabaYaz(){
        System.out.println("merhaba dunya");


        // gun11 06 bolume goz at.
    }
}
