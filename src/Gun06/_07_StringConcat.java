package Gun06;

public class _07_StringConcat {
    public static void main(String[] args) {
        // conat : bir string digerine birlestiriyor
        String s1="Merhaba";
        String s2="dunya";

        System.out.println("birlesik hali="+s1+s2);
        System.out.println("birlesik hali="+s1.concat(s2));// birlesik hali conat kulannarak
        System.out.println("birlesik hali="+s1.concat(" ").concat(s2));
        System.out.println("birlesik hali="+s1.concat(" "+s2));
        System.out.println("birlesik hali="+s1.concat("virus"));
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

    }
}
