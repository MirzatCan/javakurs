package Gun08;

public class _06_JavaComparisonOperators {
    public static void main(String[] args) {
        
        int a= 50;
        int b=50;
        
        // = atama isereti,    ==  esit mi?  demek 
        System.out.println("a b ye esit mi ? " + (a==b)); // true
        System.out.println("a b ye farkli mi ? " + (a!=b)); // false

        System.out.println("a dan b buyuk mi? " + (a>b)); //false
        System.out.println("a dan b kucuk mi? " + (a<b)); //false

        System.out.println("a b den buyuk ve esit mi?" + (a>=b)); //true
        System.out.println("a b den kucuk veya esit mi?" + (a<=b)); //true
    }
}
