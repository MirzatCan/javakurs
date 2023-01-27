package Gun10;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67
        Scanner stringOku=new Scanner(System.in);
        System.out.print("iki sayi giriniz(arasina bosluk ile ayiriniz):");
        String string=stringOku.nextLine();

        String sayi1=string.substring(0,string.indexOf(" "));
        String sayi2=string.substring(string.indexOf(" ")+1);

        if (sayi1.equals(sayi2))
        {System.out.println("Esit");}
        else
        {System.out.println("degil");}
    }
}
