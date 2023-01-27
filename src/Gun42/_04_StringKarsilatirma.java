package Gun42;

public class _04_StringKarsilatirma {
    public static void main(String[] args) {
        //String lerde neden == yerine equal kullanilir?

        //burda ilker tipler kulandik
        //== yapsak da equal de degerleri karsilastirir
        String cumle1="Bugun hava cok guzel";
        String cumle2="Bugun hava cok guzel";

        if (cumle1==cumle2)
            System.out.println("cumle1 esit cumle2");
        else
            System.out.println("esit degil");

        if (cumle1.equals(cumle2))
            System.out.println("cumle1 esit cumle2");
        else
            System.out.println("esit degil");


        //************referans tipler***********
        // burda new String diye referans tip kullandik
        //== isimleri karsilastirir-> yani adresssi
        String cumle3=new String("Bugun hava cok guzel");
        String cumle4=new String("Bugun hava cok guzel");

        if (cumle3==cumle4) //burda adressleri karsilastirir
            System.out.println("cumle3 esit cumle4");
        else
            System.out.println("esit degil");

        if (cumle3.equals(cumle4)) //burda degerleri karsilastirir.
            System.out.println("cumle3 esit cumle4");
        else
            System.out.println("esit degil");




















    }

}
