package Gun31._02_Enum;
public class Soru {
    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER(username,rolu,statu) class ı tanımlayınız

    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.
    // UserSilme isimli fonksiyona bu userları gönderiniz.
    // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim
    enum Rol{ADMIN, MUDUR, SATIS, PERSONEL}
    enum Statu{AKTIF, PASIF}

    public static void main(String[] args) {
        Usur k1=new Usur("Mirzat",Rol.MUDUR,Statu.AKTIF);
        Usur k2=new Usur("Xirzat",Rol.PERSONEL,Statu.PASIF);
        Usur k3=new Usur("Tumaris",Rol.ADMIN,Statu.AKTIF);

        userSil(k1);
        userSil(k2);
        userSil(k3);

        System.out.println("k1 = " + k1);
        System.out.println("k2 = " + k2);
        System.out.println("k3 = " + k3);

    }
    public static void userSil(Usur user){
        if (user.rolu==Rol.ADMIN)
            System.out.println("Admin Silenemez");
    }
}
