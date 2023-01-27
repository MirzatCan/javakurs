package Gun15;

public class _03_JavaNestedLoop {
    public static void main(String[] args) {
        //asagidaki gorunteyi veren programi yaziniz(yalnizca 1 yildiz ile yapiniz)
        //*           1.satirda 1 yildiz
        //**          2.satirda 2 yildiz
        //***         3.satirda 3 yildiz
        //****        4.satirda 4 yildiz
        //*****       5.satirda 5 yildiz
        int i = 0;
        for (int j = 1; j <=5; j++) { // j satir sayisi 1,2,3,4,5
            for (i = 0; i < j; i++) { // i ise * sayisi. satir j kadar yildiz yaz.  i<j
                System.out.print("*");}
            System.out.println();
        }
    }
}
