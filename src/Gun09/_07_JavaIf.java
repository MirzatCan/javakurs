package Gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // Girilen bir cümledeki küçük veya büyük a harfinin olup olmadığı yazdırınız
        // VAR ve YOK şeklinde
        Scanner cumleOku=new Scanner(System.in);
        System.out.print("Bir cumle girini:");
        String cumle=cumleOku.nextLine();
        //1.yontem
        if (cumle.toLowerCase().contains("a"))
        {System.out.println("var");}
        if (!cumle.toLowerCase().contains("a"))
        {System.out.println("yok");}
        //2.yontem
        if (cumle.toLowerCase().indexOf("a")!=-1)
        {System.out.println("var");}
        if (cumle.toLowerCase().indexOf("a")==-1)
        {System.out.println("yok");}
        //3.yontem
        boolean varmi=cumle.toLowerCase().contains("a");
        if (varmi==true)
        {System.out.println("var");}
        if (varmi==false)
        {System.out.println("yok");}

    }
}
