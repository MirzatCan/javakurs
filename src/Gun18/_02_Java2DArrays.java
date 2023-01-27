package Gun18;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int[] dizi=new int[10]; //bos default 0 olan
        int[] dizi2={2,3,4,5,6,7};

        int[][] tablo=new int[2][3]; //2 satir row,3 sutum column,
                                     //bos default deger 0  2*3 kadar 6 adet sayi
        int[][] tablo2={
                {2,3,4},  //0.satir
                {34,35,45}//1.satir
        };
        //tek forlu yontem uzun ve yorucu
        for (int i = 0; i < 2; i++) {
            System.out.print(tablo2[i][0]+" ");
            System.out.print(tablo2[i][1]+" ");
            System.out.print(tablo2[i][2]+" ");

            System.out.println();
        }
        //2 forlu yontem kesin ve hatasiz
        for (int i = 0; i < 2; i++) {  //i-> satir
            for (int j = 0; j < 3; j++) { //j-> sutum
                System.out.print(tablo2[i][j]+" ");
            }
            System.out.println();
        }

    }
}
