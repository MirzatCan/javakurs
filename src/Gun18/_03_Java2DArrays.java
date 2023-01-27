package Gun18;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz
        
        int [][] sayilar=new int[2][3];
        int miktar=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sayilar[i][j]=(int)(Math.random()*101);
                System.out.print(sayilar[i][j]+" ");
                if (sayilar[i][j]%2!=0)
                    miktar++;
            }
            System.out.println();
        }
        System.out.println("miktar = " + miktar);

    }
}
