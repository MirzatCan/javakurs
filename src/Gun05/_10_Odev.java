package Gun05;

import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;
import sun.font.TrueTypeFont;

import java.util.Scanner;

public class _10_Odev {
    public static void main(String[] args) {
        // 1- Bir String oluşturun. Konsol'a isminizi girin.İsminizi yazdırın.
        Scanner isimOku=new Scanner(System.in);
        System.out.print("isminiz=");
        String isminiz=isimOku.next();
        System.out.println("isminiz = " + isminiz);
        // 2- Bir int oluşturun.Konsol'a herhangi bir sayı giriniz.Bu sayıyı yazdırın.
        Scanner sayiOku=new Scanner(System.in);
        System.out.print("sayi=");
        int sayi=sayiOku.nextInt();
        System.out.println("sayi = " + sayi);
        // 3- Bir String oluşturun.Konsol'a sevdiğiniz bir meyveyi yazın.O meyveyi yazdırınız.
        Scanner meyveoku=new Scanner(System.in);
        System.out.print("Sevdiginiz meyve=");
        String sevdiginizMeyve=meyveoku.next();
        System.out.println("sevdiginizMeyve = " + sevdiginizMeyve);
        // 4- Bir int oluştur.Konsol'a arabanızdaki kapı sayısını girin.Bu int'i yazdırın.
        Scanner kapiSayiOku=new Scanner(System.in);
        System.out.print("Arabanizdaki kapi sayisi=");
        int kapiSayi=kapiSayiOku.nextInt();
        System.out.println("kapiSayi = " + kapiSayi);
        // 5- Bir String oluştur.Konsol'a 10 sene önceki yaşadığın şehri yazın.Bu String'i yazdırın.
        Scanner sehirOku=new Scanner(System.in);
        System.out.print("10 sene once yasadiginiz sehir=");
        String sehir=sehirOku.next();
        System.out.println("sehir = " + sehir);
        // 6- Bir string oluşturunuz.Doğum gününüzü konsola giriniz.String'i yazdırınız.
        Scanner dogumGunOku=new Scanner(System.in);
        System.out.print("Dogum gununuz=");
        String DogumGununuz=dogumGunOku.next();
        System.out.println("DogumGununuz = " + DogumGununuz);
        // 7- Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
        // Varsa True , yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız.
        Scanner varMiOku=new Scanner(System.in);
        System.out.print("Bir Banka Hesabiniz Var Mi=");
        boolean sonuc=varMiOku.nextBoolean();
        System.out.println("sonuc = " + sonuc);
        // 8- Bir byte oluşturunuz.Konsola kg cinsinden bir ağırlık yazınız.Byte'ı yazdırınız.
        Scanner kilonuzOku=new Scanner(System.in);
        System.out.print("kilonuz=");
        byte kilonuz=kilonuzOku.nextByte();
        System.out.println("kilonuz = " + kilonuz);
        // 9- Bir float oluşturunuz.Konsola boyunuzu giriniz.Float'ı yazdırınız.
        Scanner boyunuzOku=new Scanner(System.in);
        System.out.print("boyunuz=");
        float boyunuz=boyunuzOku.nextFloat();
        System.out.println("boyunuz = " + boyunuz);
    }
}
