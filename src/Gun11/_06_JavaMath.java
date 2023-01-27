package Gun11;

public class _06_JavaMath {
    public static void main(String[] args) {
        int a = -12;
        int b = 4;

        System.out.println("a nin mutlak degeri=" + Math.abs(a));//12
        System.out.println("a ve b den buyuk olani=" + Math.max(a, b)); //4
        System.out.println("a ve b den kucuk olani=" + Math.min(a, b));//-12
        System.out.println("2 nin 3. kuveti=" + Math.pow(2, 3));//8
        System.out.println("b nin karekoku=" + Math.sqrt(b)); //2
        System.out.println("round3.1     ="+Math.round(3.1)); //3  yuvarlamak
        System.out.println("round3.5     ="+Math.round(3.5)); //4 yuvarlamak

        System.out.println("ceil 3.1="+Math.ceil(3.1));//4
        // bu rakamdan buyuk en yakin tam sayi.
        System.out.println("floor 3.1"+Math.floor(3.1));//3
        // bu rakamdan kucuk en yakin tam sayi.

        int enb=Gun20._01_JavaMethod.enbBul(a,b);   // gun20 diki fonkisyonu kullanip en buyuk olani bulmak
         }
}
