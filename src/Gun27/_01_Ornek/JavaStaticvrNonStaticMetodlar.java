package Gun27._01_Ornek;

public class JavaStaticvrNonStaticMetodlar {
    public static void main(String[] args) {

        int sayi=345;
        String strSayi=String.valueOf(sayi);  // int sayi yi String e cevirme
        int intSati=Integer.parseInt(strSayi); // String sayi yi Intenger e cervirme.
        //valueOf  ve  parseInt  ikisi de birer java metodudur.
        //Math.random da bir metod
        double rndSyi=Math.random();
        // Ctrl ile  random a tikladigimizda metodu gorebilirir
        //bizi baska yere metod yazdigimida new diye bir nesne belirlememiz lazim
        //ama java metodlarini cagirirken belirlemek lazim
        //biz de java gibi nesne beliremeden dirrek metod cagirabilirmiyiz？

        //Ornek:
        Utility ut=new Utility();  // nev ut diye belirlemek zorundayiz
        String strSayi2= ut.getString(sayi);

        //burda gerek kalmadi.  Utility. yaptigimizda getString2 direk cagriyabiliriz.
        String strSayi3=Utility.getString2(sayi);

    }
}
