package Gun15;

public class _04_JavaNestedLoop {
    public static void main(String[] args) {
        //asagidaki gorunteyi veren programi yaziniz(yalnizca 1 yildiz ile yapiniz)

        //*****       1.satirda 5 yildiz
        //****        2.satirda 4 yildiz
        //***         3.satirda 3 yildiz
        //**          4.satirda 2 yildiz
        //*           5.satirda 1 yildiz

        int i = 0;
        for (int j = 1; j <=5; j++) { // j satir sayisi 1,2,3,4,5
            for (i = 0; i < 6-j; i++) { // 6-satir sayisi
                System.out.print("*");}
            System.out.println();}

        //2. yontem
            int x = 0;
            for (int y = 5; y > 0; y--) { // j satir sayisi 5,4,3,2,1
                for (x = 0; x < y; x++) { // i ise * sayisi. satir j kadar yildiz yaz.  x<y
                    System.out.print("*");}
                System.out.println();}

    }
}
