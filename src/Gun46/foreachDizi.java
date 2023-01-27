package Gun46;

public class foreachDizi {
    public static void main(String[] args) {
        int[] dizi=new int[]{1,2,3,4,5,6,};

        int[] dizi1={1,2,3,4,5};

        int[] dizi2=new int[3];
        dizi2[0]=5;
        dizi2[1]=5;
        dizi2[2]=5;

        System.out.println("dizi.length = " + dizi.length);
        System.out.println("dizi1.length = " + dizi1.length);
        System.out.println("dizi2.length = " + dizi2.length);

        for (int i = 0; i < dizi1.length; i++) {
            System.out.print(dizi1[i]+" ");
        }
        System.out.println();
        for (int elaman:dizi1) {
            System.out.print(elaman+" ");
        }
        System.out.println();

        //2 boyutlu dizi
        int[][]tablo1=new int[2][3];
        tablo1[0][0]=4;
        tablo1[0][1]=14;
        tablo1[0][2]=24;
        tablo1[1][0]=8;
        tablo1[1][1]=18;
        tablo1[1][2]=28;


        int[][]tablo2={{5,15,25},{6,16,26}};//eleman verildiginde sayi verilmiyor satir eleman sayisi

        int[][]tablo3=new int[2][3];
        tablo3[0]=new int[]{2,3,4,5};
        tablo3[1]=new int[]{2,9,7,6,4,5,4};

        int tablo4[][]=new int[2][3]; // nesne [] nin onunde de olabilir
        for (int[] a:tablo4) {
            for (int i:a) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
