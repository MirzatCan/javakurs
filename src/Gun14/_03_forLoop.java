package Gun14;

public class _03_forLoop {
    public static void main(String[] args) {
        // 0 den 10(dahil) kadar sayıları ekrana yazdırınız.
        // 10 dan 0(dahil) kadar sayıları ekrana yazdırınız.(ayri bir diğer for)
        int i=0;
        for (i=0;i<=10;i++)
            System.out.print(i+" ");

        System.out.println(); //iki sonucun satir ayirmak icin

        for (i=10;i>=0;i--)
            System.out.print(i+" ");
    }
}
