package Gun02;

public class _05_EscapeCharacters {
    public static void main(String[] args) {
        //Escope Charracters ne demek?
        //  \n -> yeni satır açıyor, alt satıra geçiyor
        //  \t -> sanki tab tuşuna basılmış gibi boşluk veriyor
        //  \b -> back-space bir karakter geri siler
        //  " -> " tırnak yazmak için kullanılıyor
        //  \ -> \ yazılacak ekrana
        //  \r -> satır başına geri ve satırı silip tekrar baştan yazıyormuş gibi yapar

        System.out.println("MerhabaDunya"); //
        System.out.println("Merhaba\nDunya");
        //print veya println \ gorunce ekrana yazilacak bir karakter degil diyor.
        //ayri bir islem yapmak istiyor, devam eden n karakterini gorunce
        //ayri isleme alt satirdan devam edecegini anliyor.
        System.out.println("merhaba\tDunya"); //merhaba	Dunya
        System.out.println("merhaba\bDunya"); //merhabDunya
        System.out.println("merhaba\"\"Dunya"); //merhaba"Dunya
        System.out.println("merhaba\\Dunya"); //merhaba\Dunya
        System.out.println("merhaba\rDunya"); //Dunya

    }
}
