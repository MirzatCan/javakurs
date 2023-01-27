package Gun14;

public class _06_forLoop {
    public static void main(String[] args) {
        // 2 ler çarpım tablosunu , aşağıdaki şekilde olarak yazdırınız.
        //    2 x 1 = 2
        //    2 x 2 = 4
        //    2 x 3 = 6
        //    2 x 4 = 8
        //    2 x 5 = 10
        //    2 x 6 = 12
        //    2 x 7 = 14
        //    2 x 8 = 16
        //    2 x 9 = 18
        //    2 x 10 = 20

        int i=1; int carpi=1;
        for (i=1;i<=10;i++){
            carpi=2*i;
        System.out.println("2*"+i+"="+carpi);}
    }
}
