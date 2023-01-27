package Gun17;

import java.util.Arrays;

public class _06_JavaArrayMetodlar {
    public static void main(String[] args) {

        String [] isimler={"mirzat","ayajamal","xirzat","tumaris"};

        //diziler string olarak direk yazdirir
        System.out.println("isimler = " + Arrays.toString(isimler));

        //dizi siralama
        Arrays.sort(isimler);
        System.out.println("isimler = " + Arrays.toString(isimler));
        
        // diziler esit mi?
        int [] a={1,8,13,54};
        int [] b={1,8,13,54};
        int [] c={1,13,8,54};
        int [] d={1,7,35,54};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b));
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a, c));
        System.out.println("Arrays.equals(a,d) = " + Arrays.equals(a,d));

        Arrays.sort(c); //sayi bazli dizi siralama
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));

        //contains gibi calisir, var ise pozitif bir deger dondurur,yok ise negatif
        System.out.println("Arrays.binarySearch(b,13) = " + Arrays.binarySearch(b, 13));
        // hocam dediki ancak siralanmis dizilerde dogu sonuc verir
        //ama ben yaptigimda siralamaya gerek kalmiyor

        System.out.println("Arrays.binarySearch(c,13) = " + Arrays.binarySearch(c, 13));
    }
}
