package Gun28._02_Constructor;

public class Kitapci {
    // Book class yazınız.fields: name,publishYear(yayin yili),author(yazar)
    // 3 adet Consructor ekleyiniz.
    // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
    // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.
    public static void main(String[] args) {

        kitap kitap1=new kitap("Yuzuklerin Efendisi",1995,"JRR Tolkien");
        System.out.println(kitap1.kitapAdi+"  "+kitap1.yayinYili+"  "+kitap1.yazar);

        kitap kitap2=new kitap("Kutadgubilik",1000,"kasgarli Mahmut");
        System.out.println(kitap2.kitapAdi+"  "+kitap2.yayinYili+"  "+kitap2.yazar);

        kitap kitap3=new kitap("O panda benim",2020,"Haluk Tatar");
        System.out.println(kitap3.kitapAdi+"  "+kitap3.yayinYili+"  "+kitap3.yazar);

        System.out.println("kitap1 = " + kitap1);
        System.out.println("kitap2 = " + kitap2);
        System.out.println("kitap3 = " + kitap3);
    }
}
