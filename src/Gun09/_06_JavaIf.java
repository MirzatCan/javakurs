package Gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        // Girilen bir cümlede a harfinin geçip geçmediğini
        // bulunuz geçiyor ise EVET, geçmiyor ise HAYIR yazdırınız
        Scanner cumleOku=new Scanner(System.in);
        System.out.print("Cumle giriniz:");
        String cumle=cumleOku.nextLine();
        if (cumle.contains("a"))
        {System.out.println("Evet");}
        else
        {System.out.println("Evet");}

        //  1.yontem ->  else kulanmadan
        if (cumle.contains("a"))
        {System.out.println("Evet");}
        if (!cumle.contains("a"))
        {System.out.println("Hayir");}

        //2.yontem
        if (cumle.indexOf("a" )!=-1)  //var ise index verir. yok ise -1 verir
        {System.out.println("Evet");}
        if (cumle.indexOf("a" )==-1)
        {System.out.println("Hayir");}

        //3.yontem
        boolean varmi=cumle.contains("a");
        if (varmi==true)  //if var mi
        {System.out.println("Evet");}
        if (varmi==false)
        {System.out.println("Hayir");}


    }
}
