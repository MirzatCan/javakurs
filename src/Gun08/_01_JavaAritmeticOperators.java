package Gun08;

public class _01_JavaAritmeticOperators {
    public static void main(String[] args) {
        int a=9;
        int b=5;

        System.out.println("(a+b) = " + (a+b));

        System.out.println("(a-b) = " + (a-b));

        System.out.println("(a*b) = " + (a*b));

        System.out.println("(a/b) = " + (a/b));
        // normal sonuc 1.8 , fakat tam sayının tam sayıya bölümünde küsürat atılır.
        // bu sebeple sonuc 1 olur, yuvarlama yapmaz.  çünkü int/int
        // tam sonuç istersen bir tanesini double çevirmen yeterli

        System.out.println("((double)a/b) = " + ((double)a/b));

        System.out.println("(a%b) = " + (a%b));
    }
}
