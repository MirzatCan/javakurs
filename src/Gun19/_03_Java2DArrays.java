package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.

        int[][] tablo=new int[3][2];
        Scanner oku=new Scanner(System.in);
        int tekMiktar=0;
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(i+".satir"+j+".sayini yaziniz:");
                tablo[i][j]=oku.nextInt();

                if (tablo[i][j]%2!=0)
                    tekMiktar++;
            }
        }
        System.out.println("tekMiktar = " + tekMiktar);
        int[] teklerDizisi=new int[tekMiktar];
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                if (tablo[i][j]%2!=0){
                    teklerDizisi[tekMiktar-1]=tablo[i][j];
                    tekMiktar--;
                    }

            }
        }
        System.out.println(Arrays.toString(teklerDizisi));

    }
}
