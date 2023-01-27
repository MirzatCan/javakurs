package Gun16;

public class _03_JavaArray {
    public static void main(String[] args) {
        int [] dizi=new int[5]; //0,1,2,3,4 indexli 5 elemanli dizi
        int [] dizi2={5,10,24,35,48};// 5 elamanli bir dizi, hem tanimladim hem de ilk degeri verdim.

        String [] kelimeler=new String[5];//5 tane kelime/cumle saklayabilen bir dizi degisken.
        boolean[] dizi3=new boolean[5]; //5 tane boolean(true/false) saklayabilen bir dizi degiskeni
        double [] dizi4=new double[5]; //5 tane double saklayabilen bir dizi degiskeni
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("dizi = " + dizi[i]);
        }
        for (int i = 0; i < kelimeler.length; i++) {  // sonuc null. bos demek
            System.out.println("kelimeler = " + kelimeler[i]);
        }
        for (int i = 0; i < dizi3.length; i++) {
            System.out.println("dizi3 = " + dizi3[i]);
        }
        for (int i = 0; i < dizi4.length; i++) {
            System.out.println("dizi4 = " + dizi4[i]);
        }

    }
}
