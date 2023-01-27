package Gun43;

public class _01_JavaExcaption {
    public static void main(String[] args) {
        System.out.println("Program calismaya basladi");
        String kelime=""; // once ; koymadik -> nu compile error
        char harf=kelime.charAt(3);// bu satiri en son ekledik, bu Runtime error

        System.out.println("Program bitti");
    }
}

// daha çalışmadan önce oluşmuş eksikliklerden kaynaklı hatalara
// Derleme zamanı yani COMPILE ERROR, Exception diyoruz.

//program çalıştıktan sonra çalışma zamanı içerisindeki hatalara
//çalışma zamanı yani RUNTIME ERROR, Exception diyoruz.

