package Gun31._01_Enum;

public class OrnekCozum {
    enum  Aylar{
        Ocak,Subat,Mart,Nisan,Mayis,Haziran,
        Temuz,Agustos,Eylul,Ekim,Kasim,Aralik
    }

    public static void main(String[] args) {
        Aylar ay=Aylar.Mayis;

        switch (ay){
            case Subat:System.out.println(28);break;
            case Ocak:
            case Mart:
            case Mayis:
            case Temuz:
            case Agustos:
            case Ekim:
            case Aralik:System.out.println(31);break;
            case Nisan:
            case Haziran:
            case Eylul:
            case Kasim:System.out.println(30);break;
        }
        if (ay == Aylar.Mart){
            System.out.println("zam yapildi");
        }
        System.out.println("ay = " + ay);//toString
        System.out.println("ay.name() = " + ay.name()); //SIMGE Olarak kulanilan kelimeyi
        System.out.println("ay.ordinal() = " + ay.ordinal());//SIMGE nin indexini verir

        for (Aylar a:
        Aylar.values()) {
            System.out.println(a.name() +"="+ a.ordinal());

        }
    }
    // Yazılım dillerinde enum, enumaration ve enum sabitleri
    // olarak adladırılmaktadır. Tanımlanan değişkenlerin
    // sabit değer alması için kullanılır. Tanımlanan
    // bu sabit değerler bir grup oluşturur. Erişilmesi,
    // yönetilmesi ve anlaşılması kolay hale gelir.

    //bir sürü girilmesi gereken datayı  tek seferde
    // parti halinde giriyoruz,daha sonra kullanması
    // da kolay yazması da kolay oluyor
}
