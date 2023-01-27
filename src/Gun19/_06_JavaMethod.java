package Gun19;

public class _06_JavaMethod {
    public static void main(String[] args) {
        merhabaYaz();// Math.random();
        merhabaYazIsmet("ismet"); //Math.Abs(-10)

        cokMerhabaYaz(5);

    }
    public static void merhabaYaz(){
        System.out.println("merhaba dunya");
        System.out.println("merhaba dunya");
    }
    public static void merhabaYazIsmet(String isim){ //String isim diye degisken tanimlicaz
        System.out.println(isim+" merhaba");

    }
    public static void cokMerhabaYaz(int miktar){
        for (int i = 0; i < miktar; i++) {
            System.out.println("merhaba");
        }
    }
}
