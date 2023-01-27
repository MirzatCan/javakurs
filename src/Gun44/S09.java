package Gun44;

public class S09 {
    public static void main(String[] args) {
        int[] intArr={8,16,32,64,128};

        for (int i:intArr) {  // i=8,16,32,64,128
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]+" ");
        }
    }
}
