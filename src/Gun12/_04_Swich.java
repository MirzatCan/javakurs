package Gun12;

import java.util.Scanner;

public class _04_Swich {
    public static void main(String[] args) {
        // kulancinin girdigi gun numarasina kaesilik gelen gunu adiniz yaziniz.

        Scanner sayiOku=new Scanner(System.in);
        System.out.print("Gun mo:");
        int gunNo=sayiOku.nextInt();

   //     if (gunNo==1)
   //        System.out.println("pazartesi");
   //     else
   //         if (gunNo==2)
   //             System.out.println("sali");
   //         else
   //             if (gunNo==3)
   //                 System.out.println("carsamba");
   //     ......
   //     ......

        switch (gunNo){
            case 1: System.out.println("pazartesi");break;  ///break islemi kes demek
            case 2: System.out.println("sali");break;
            case 3: System.out.println("carsamba");break;
            case 4: System.out.println("persembe");break;
            case 5: System.out.println("cuma");break;
            case 6: System.out.println("cumartesi");break;
            case 7: System.out.println("pazar");break;
            default:System.out.println("hatali numara"); // default -> bunlardan baskasiysa bu nu yap demek

                //iflerde tek deger olmasi durumunda, 2 den fazla if kullanman gerekirse switch
                // diger durumlarda if.
        }
    }
}
