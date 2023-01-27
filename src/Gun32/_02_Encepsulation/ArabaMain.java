package Gun32._02_Encepsulation;

public class ArabaMain {
    // Bir araba nesnesi oluşturulmak isteniyor. fields(Renk, Model, MotorHacmi,KapiSayisi)
    // Bu nesnenin verilerini OOP kurallarına uygun olarak verip alınız.
    // Main de 1 tane nesne oluşturup bunu kontrol ediniz.

    public static void main(String[] args) {
        fields a1=new fields();
        a1.setRenk("kirmizi");
        a1.setModel(2020);
        a1.setMotorHacmi(1200);
        a1.setKapiSayi(4);
        System.out.println("a1 = " + a1);

        fields a2=new fields("Mavi",1987,800,2);
        System.out.println("a2 = " + a2);



        // KURAL: genel yazılım kuralıdır.
        // bütün değişkenler private yapılır.
        // yani Kapsulleme ile kullanılır.
        // Eğer gerekiyorsa private kaldırılır.

    }
}
