package Gun42;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        String cumle="";
        cumle=cumle+"Bugun"; //+ isareti stringleride birlestirme yapar
        cumle=cumle+" Hava";
        cumle+=" cok soguk";

        System.out.println("cumle = " + cumle);
        System.out.println("cumle.concat(\" fakat dun sicakti\") = " + cumle.concat(" fakat dun sicakti"));
        //concat de birlestirip yazdi ama cumle degeri degismedi
        System.out.println("cumle = " + cumle);

        cumle=cumle.concat(" fakat dun sicakti"); //burda atadigimiz icin degisti
        System.out.println("cumle = " + cumle);
        // bir kac kelime olursa boyle yapariz, ama cok fazla cumle ya da kelime icin bilgisayari
        //yavaslatiyor. o yuzden java ayri bir sinif vermisler

        //***********StringBuilder*************
        StringBuilder cumle2=new StringBuilder();
        cumle2.append("Bigun "); //append: ekle, atama gerektirmez. direk ekler
        cumle2.append("hava ");
        cumle2.append("soguk ");
        System.out.println("cumle2 = " + cumle2);

        //************  + , concat , StringBuilder

        long starTime=System.currentTimeMillis();
        String test1="";
        for (int i = 0; i < 10000; i++) {
            test1=test1+" Merhaba";
        }
        long stopTime=System.currentTimeMillis();
        System.out.println("+ icin sure="+(stopTime-starTime)+"ms");

        starTime=System.currentTimeMillis();
        String test2="";
        for (int i = 0; i < 10000; i++) {
            test2 = test2.concat(" Merhaba");
        }

        stopTime=System.currentTimeMillis();
        System.out.println("concat icin sure="+(stopTime-starTime)+"ms");

        starTime=System.currentTimeMillis();
        StringBuilder test3=new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            test3.append(" Merhaba");
        }

        stopTime=System.currentTimeMillis();
        System.out.println("String Builder icin sure="+(stopTime-starTime)+"ms");


        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.


        System.out.println("******************");
        //StringBuilder i biraz yakindan taniyalim
        StringBuilder sb=new StringBuilder();
        sb.append("Bugun ");
        sb.append("Hava ");
        sb.append("Guzel ");
        System.out.println("sb = " + sb);

        System.out.println("sb.length() = " + sb.length());
        sb.append(4);  //eklene her seyini toString hali var ise cevirerek ekler
        System.out.println("sb = " + sb);

        sb.reverse(); //Stringi  tersine cevirir
        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb);

        sb.delete(0,5); //index 0 dahil 5 haric olmak uzere siler
        System.out.println("sb = " + sb);

        sb.deleteCharAt(3); // index 3 diler
        System.out.println("sb = " + sb);

        sb.insert(5,"kelime "); // 5 numarali indexe String ekle
        System.out.println("sb = " + sb);

        sb=new StringBuilder();//silindi
        System.out.println("sb = " + sb);
        sb=new StringBuilder("hava cok guzel"); // ilk degeri atadim
        System.out.println("sb = " + sb);

        sb.replace(3,8,"bu"); //3 dahil 8 arasidakileri String ile degistirdi
        System.out.println("sb = " + sb);

        String strSb=sb.toString();// StringBuilder i String tipe degistirme
        System.out.println("strSb = " + strSb);

        StringBuffer sBuffer=new StringBuffer(); //tamamen StringBilder ile ayni
        //tek farki, paralel calisan yazilimlarda, StringBuffer kulanilir

    }
}
