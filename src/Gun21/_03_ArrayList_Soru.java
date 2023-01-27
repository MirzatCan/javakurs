package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayList_Soru {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        ArrayList<Integer> notlar=new ArrayList<>();
        String cevap;
        int toplam=0;
        int sayac=0;
        do {System.out.print("Not giriniz:");
            int not=okuInt.nextInt();
            notlar.add(not);
            toplam=toplam+not;
            System.out.println("devam etmek istiyormusunuz (E/H)");
            cevap=okuStr.nextLine();
        }while (cevap.equalsIgnoreCase("E"));

        int ortalam=toplam/notlar.size();
        System.out.println("ortalam = " + ortalam);

        int gecenSayi=0;
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i)>ortalam)
                gecenSayi++;
        }
        System.out.println("gecenSayi = " + gecenSayi);



    }
}
