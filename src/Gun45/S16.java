package Gun45;

import java.util.Arrays;

public class S16 {
    public static void main(String[] args) {
        int num[][]=new int[1][3];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j]=10;
            }
        }

        //yazdirma islemi
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.println("num["+i+"]["+j+"]="+num[i][j]);
            }
        }


    }
}
