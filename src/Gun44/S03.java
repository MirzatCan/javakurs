package Gun44;

public class S03 {
    public static void main(String[] args) {
        int [] stack={10,20,30};
        int size=3;
        int idx=0;

        do {
            idx++;
        }while (idx<size-1);


        //budaki idx en son 2 olmali
        System.out.println("The top eleman = " + stack[idx]);
    }
}
