package Gun35._02_polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek k1=new Kopek("karabas");
        k1.ses();
        k1.kokladi();

        Kedi ke1=new Kedi("kopuk");
        ke1.ses();
        ke1.Tirmaladi();

        kopekSsei(k1);
        kedikSsei(ke1);


        //Hayvan ses dedigimizde hangi hayvani versek o metod calisir
        HayvanSesi(k1);
        HayvanSesi(ke1);


        Hayvan hayvan1=new Hayvan("ordek"); // hayvanlardan 1 hayvan
        Hayvan hayvan2=new Kopek("kangal");
        Hayvan hayvan3=new Kedi("boncuk");

        System.out.println("**************");
        hayvan1.ses(); // genel hayvan ses
        hayvan2.ses(); // kopek ses
        hayvan3.ses(); //kedi ses

        hayvan2.ses();// ne kadar kopek de olsa hayvan classindan cagirdigimiz icin
        // buda sadece ses cikiyor, koklama metodu cikmiyor

        //koklama metodunu kulanmak icin
        ((Kopek)hayvan2).kokladi();

        HayvanSesi(hayvan1);


    }

    public static void kopekSsei(Kopek kopek){
        kopek.ses();   }


    public static void kedikSsei(Kedi kedi){
        kedi.ses();   }

    public static void HayvanSesi(Hayvan hayvan){
        // hem kedi hem kopek geliyor
        hayvan.ses();

        //bir classin aslinda kim oldugunu bulma yontemi
        if (hayvan instanceof Kopek) //hayvan aslinda kopek mi
            ((Kopek)hayvan).kokladi();
        if (hayvan instanceof Kedi)  //hayvan aslinda kedi mi
            ((Kedi)hayvan).Tirmaladi();
    }
}

//Hayvan classindan urettigimiz extend yaptigimiz icin
//hayvansesi olarak ekledigimiz metoddan yazdirdigimizda da
//kopek ve kedi icin classlarinda Override yaparak yazdigimiz
//ozellikleri alarak yazdi
//Ama tirmaladi, kokladi, gibi kedi ve kopek classina ozel olarak
//yazdiklarimizi Hayvansessi metoduda yazdirmayiniz


//***************Ogretmenin notu**********************
// hayvan2.ses();   kopek de olsa hayvan Referansı sebebiyle metodlar kısıtlı
//                 peki bu hayvanı kopek formunu nasıl ortaya çıkartırım
//                tip dönüşümü acaba işime yara mı
// ((Kopek)hayvan2).kokladi();       artık diğer metodları kullanabilirim.
// ((int)Math.random()) casting burdaki gibi, tip dönüşümü

// Setlerden HasSet
// Maplerden HashMAp
// Listlerden ArrayList

//        Polymorphism -
//                çok formluluk  - Çok çeşitlilik
//        şizofren bir konu
//
//        :  Bir NESNEN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
//        ve bu şekilde kullanılabilmesine Polymorphism denir.

// öğretmenin okulda "fizik öğretmeniyim" demesi,
// mahallede "öğretmenim" demesi gibi.