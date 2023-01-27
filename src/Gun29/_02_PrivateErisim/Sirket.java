package Gun29._02_PrivateErisim;

public class Sirket {
    public static void main(String[] args) {
        Calisan cal1=new Calisan();
        cal1.id=1;
        cal1.name="Mirzat";
        cal1.surName="Memet";
        //cal1.passWord="123456";
        //+ private kendi paketinden bile cagiramaz

        cal1.sifreAta("1234");
        cal1.sifreAta("M700818abc");

        cal1.sifreGoter();

        cal1.sifreSonunuGoter();
    }
}
