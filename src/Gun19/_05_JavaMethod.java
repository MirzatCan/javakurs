package Gun19;

public class _05_JavaMethod {

    // buraya metodlar yazilabilir

    public static void main(String[] args) {// ana metod, diger metodlari burdan cagricaz.
        Math.max(5,6); //bir seyler verilmis, geriye deger alir.
        Math.random(); //veri almiyor, sadece veri veriyor

        System.out.println("Merhaba dunya");
        System.out.println("Merhaba dunya");
        System.out.println("Merhaba dunya");

        merhabayaz();// kullanımı kolay, çağırması kolay, tekrar tekrar kulanabilirsin
        merhabayaz();// mainin daha kolay anlaşılabilir olur.
        merhabayaz();// fonksiyonu çağırma şekli
    }
    public static void merhabayaz(){
        System.out.println("Merhaba dunya");
    }
    // Metodlar tekrarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
    // ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için kullanılır.
    // temiz kod için

    // buraya metodlar yazilabilir

}
