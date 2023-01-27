package Gun07;

import java.util.Scanner;

public class _06_Soru1 {
    public static void main(String[] args) {
        // Tek seferde girilen bir ad soyadın(tam ad) adını ve soyadını ayırıp,
        //  ayrı ayrı yazdırınız. (sadece ad ve soyad)
        Scanner okuStr=new Scanner(System.in);
        System.out.print("AD-SOYADINIZ=");
        String oku=okuStr.nextLine();

        // mirzat memet
        // ad : 0, boslugun indexine kadar
        // soyad: bosluk+1, sonuna kadar

        int boslukindex=oku.indexOf(" ");  //ayrintili yontem.
        String ad =oku.substring(0,boslukindex);
        String soyad=oku.substring(boslukindex+1);

        System.out.println("Ad= " + oku.substring(0,oku.indexOf(" ")));  // direk yazma.
        System.out.println("Soyad= " + oku.substring(oku.indexOf(" ")+1));




    }
}
