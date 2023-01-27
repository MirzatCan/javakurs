package Gun21;

import com.sun.java_cup.internal.runtime.Symbol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_ArrayList_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye(ArrayList) atayarak
        // yazdırınız.

        Scanner oku=new Scanner(System.in);
        int [] dizi=new int[6];
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i+1)+".sayi giriniz:");
            dizi[i]= oku.nextInt();
        }
        System.out.println("dizi = " + Arrays.toString(dizi));

        ArrayList<Integer> tekSayilar=new ArrayList<>();

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2!=0)
                tekSayilar.add(dizi[i]);
        }
        System.out.println("tekSayilar = " + tekSayilar);

    }
}
