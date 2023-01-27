package Gun07;

public class _13_StringReplaceAll {
    public static void main(String[] args) {
        //ReplaceAll : replace gibi calisir. farkli kriter(regex) verilebiliyor 
        //regex : regular expression / duzenli ifadeler 
        
        String s1="Merhaba dunya123";

        System.out.println("s1 = " + s1);
        System.out.println("s1.replaceAll(\"[abn]\",\"_\") = " + s1.replaceAll("[abn]","_"));
        System.out.println("s1.replaceAll(\"[A-Z]\",\"_\") = " + s1.replaceAll("[A-Z]","_"));
        System.out.println("s1.replaceAll(\"[0-9]\",\"\") = " + s1.replaceAll("[0-9]",""));
        System.out.println("s1.replaceAll(\"[^A-Z]\",\"\") = " + s1.replaceAll("[^A-Z]",""));
    }
}
