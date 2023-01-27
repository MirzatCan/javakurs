package Gun19;

import java.util.Scanner;

public class _07_JavaMethod {
    public static void main(String[] args) {
        tekMiCiftMi(55);

        //kulancidan sayi alarak tek micift mi yazdiriniz
        tekMiCiftMiOku();
    }
    public static void tekMiCiftMi(int sayi){
        if (sayi%2 !=0)
            System.out.println("tek");
        else
            System.out.println("cift");
    }
    public static void tekMiCiftMiOku(){
        Scanner oku=new Scanner(System.in);
        System.out.println("sayi giriniz:");
        int sayi=oku.nextInt();

        tekMiCiftMi(sayi);
    }
}
