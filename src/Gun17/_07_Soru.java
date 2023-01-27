package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random(10dahil) olarak doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazıdırnız.

        int [] sayilar=new int[10];
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i]=(int)(Math.random()*11);
            System.out.println(sayilar[i]);
        }
        Scanner oku=new Scanner(System.in);
        System.out.print("sayi giriniz:");
        int sayi=oku.nextInt();

        //1.yontem   bu yontemde sadece bir tane bulur,ama yok ise direk yazr
        if (Arrays.binarySearch(sayilar,sayi)>=0)
        System.out.println("var. indexi=" + Arrays.binarySearch(sayilar,sayi));
        else
            System.out.println("yok");
        //2.yontem   bu yontemde kac tane varsa hepini bulur.ama else yapamicaz,o yuzden yok diye yazdiramicaz.
        // yok diye yazdirmak icin daha karsik halle getirmek zorundayiz.
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]==sayi)
                System.out.println("var.indexi="+i);
        }



    }
}
