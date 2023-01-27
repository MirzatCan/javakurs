package Gun29._03_Protected.bir;

public class HastaneAnkara {
    public static void main(String[] args) {
        Doctor dok1=new Doctor();
        dok1.adi="Mirzat";
        dok1.bolumu="Dahiliye";
        dok1.hastaneAdi="Ankara Hastanesi";
        //dok1.sicilNo  -> private     ulasilmiyor

        Doctor dok2=new Doctor("Tumaris");


    }
}
