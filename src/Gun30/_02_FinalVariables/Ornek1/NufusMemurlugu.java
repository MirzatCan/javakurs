package Gun30._02_FinalVariables.Ornek1;

public class NufusMemurlugu {
    public static void main(String[] args) {
        vatandas v1=new vatandas("Mirzat");
        vatandas v2=new vatandas("xirzat");
        vatandas v3=new vatandas("Tumaris");

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

        //v1.tcNo=456;
        //final degiskeni sadece 1 kez veri atanabilir
        //o da ya tanimlanirken, ya da Constructor da

        final double pi=3.14;
        //pi=5;   sonradan degistirelemez
    }
}
// final : değer atandıktan sonra değiştirilmeyi engelliyor
//         bu sebeple, hem sabit değerler için, hem de sonradan
//         değişmesini istemediğimiz değerler için kullanılır
// static sayac ise: her yeni nesne oluşturulduğunda
// yeni artan değer almasını sağlıyor
