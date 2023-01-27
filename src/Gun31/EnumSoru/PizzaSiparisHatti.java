package Gun31.EnumSoru;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.
    // TODO: her pizza tipi icin ucret belirleyerek Toplam ucreti yazdiriniz
    public static void main(String[] args) {
        int secim = 0;
        ArrayList<Pizza> sepet=new ArrayList<>();
        Scanner sayiOku=new Scanner(System.in);
        do {menu();
            secim=sayiOku.nextInt();
            switch (secim){
                case 1:Pizza sp=new Pizza(PizzaSize.Small);
                sepet.add(sp);
                break;
                case 2:Pizza mp=new Pizza(PizzaSize.Medium);
                sepet.add(mp);
                break;
                case 3:Pizza lp=new Pizza(PizzaSize.Large);
                sepet.add(lp);
                break;
                case 4:siparisYazdir(sepet);

            }

        }while (secim<=4);



    }
    public static void menu(){
        System.out.println("****Pizza menu****");
        System.out.println("1-Small");
        System.out.println("2-Medium");
        System.out.println("3-Large");
        System.out.println("4-Goster");
        System.out.println("5-cikis");
        System.out.print("Seciminiz:");
    }
    public static void siparisYazdir(ArrayList<Pizza> sepet) {
        int m = 0, s = 0, l = 0;
        int toplam = 0;
        for (Pizza p : sepet) {
            if (p.size == PizzaSize.Small) {
                s++;
                toplam = toplam+PizzaSize.Small.ucret;}
            if (p.size == PizzaSize.Medium) {
                    m++;
                    toplam =toplam+PizzaSize.Medium.ucret;}
            if (p.size == PizzaSize.Large) {
                    l++;
                    toplam = toplam+PizzaSize.Large.ucret;}
        }
            System.out.println("****Siparisleriniz****");
            System.out.println("s = " + s);
            System.out.println("m = " + m);
            System.out.println("l = " + l);
            System.out.println("toplam ucret = " + toplam);
    }

}
