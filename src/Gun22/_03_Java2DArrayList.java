package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Java2DArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> matNotlari=new ArrayList<>();
        ArrayList<Integer> fizNotlari=new ArrayList<>();
        ArrayList<Integer> kimNotlari=new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(60);
        matNotlari.add(65);

        fizNotlari.add(62);
        fizNotlari.add(37);

        kimNotlari.add(78);
        kimNotlari.add(65);
        kimNotlari.add(98);
        kimNotlari.add(48);

        // ArrayList in ArrayList ini nasil yapariz
        ArrayList<ArrayList<Integer>> notlarListe=new ArrayList<>(); //listelerin listesi
        notlarListe.add(matNotlari);
        notlarListe.add(fizNotlari);
        notlarListe.add(kimNotlari);

        // Soru 1:
        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız
        // Matematik : 50 60 65
        // Fizik : 62 37
        // Kimya : 78 65 98 48

        ArrayList<String> derslar=new ArrayList<>();
        derslar.add("Matematik");
        derslar.add("Fizik");
        derslar.add("Kimya");

        for (int i = 0; i < notlarListe.size(); i++) {

            System.out.print(derslar.get(i)+":");

            for (int j = 0; j < notlarListe.get(i).size(); j++) {
                System.out.print(notlarListe.get(i).get(j)+"  ");
            }
            System.out.println();
        }

        // Soru 2 :
        // Kullanıcıdan istediği bir dersin  nosunu alarak (0-Mat, 1-Fiz, 2-Kim)
        // sadece istedği derse ait notları bir metodda yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("istediginiz ders notu(0-Mat, 1-Fiz, 2-Kim):");
        int dersNo= oku.nextInt();

        System.out.println(derslar.get(dersNo)+":"+notlarListe.get(dersNo));

        for (int i = 0; i < notlarListe.get(dersNo).size(); i++) {
            System.out.print(notlarListe.get(dersNo).get(i)+" ");
            }

        System.out.println();
        dersNotlariniYzdir(notlarListe,dersNo);
        System.out.println();

        // Soru 3 :
        // Yukarıda verilen derse ait not otlamasını ve geçen sayısını bir metodda yazdırınız.

        dersNorOrtalamasiVeGecenMiktar(notlarListe,dersNo);
    }

    // metod kulamarak yzdirma sekli
    public static void dersNotlariniYzdir(ArrayList<ArrayList<Integer>> notlarListe,int dersNo){
        for (int i = 0; i < notlarListe.get(dersNo).size(); i++) {
            System.out.print(notlarListe.get(dersNo).get(i)+" ");
        }
    }
    public static void dersNorOrtalamasiVeGecenMiktar(ArrayList<ArrayList<Integer>> notlarListe,int dersNo){
        int toplam=0;
        for (int i = 0; i < notlarListe.get(dersNo).size(); i++) {
            toplam+=notlarListe.get(dersNo).get(i);
        }
        int ortalama=toplam/notlarListe.size();

        int gecenler=0;
        for (int i = 0; i < notlarListe.get(dersNo).size(); i++) {
            if (notlarListe.get(dersNo).get(i)>=ortalama)
                gecenler++;
        }
        System.out.println("ortalama = " + ortalama);
        System.out.println("gecenler = " + gecenler);
    }

}
