package Gun19;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int[][] tablo={
                {3,50,98},
                {42,235,987}
        };    // 2 satir 3 sutun
        System.out.println("satir uzublugu=" + tablo.length);
        System.out.println("0.satirin uzunlugu=" + tablo[0].length);
        System.out.println("1.satirin uzunlugu=" + tablo[1].length);

        for (int i = 0; i < tablo.length; i++) { // satir sayisi
                           //ilgili satir sutun uzunlugu
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j]+" ");
            }
            System.out.println();
        }

    }
}
