package Gun13;

import java.util.Scanner;

public class _01_Swich {
    public static void main(String[] args) {
        // Girilen bir Ay numarasına göre ayın kaç gün sürdüğünü yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("ayi sayi giriniz:");
        int gun=oku.nextInt();


        if (gun==1||gun==3||gun==5||gun==7||gun==8||gun==10||gun==12)
            System.out.println("31");
        else{
            if (gun==4||gun==6||gun==9||gun==11)
                System.out.println("30");
            else
                System.out.println("28");}

        switch (gun)
        {   case 1: System.out.println(31);break;
            case 2: System.out.println(28);break;
            case 3: System.out.println(31);break;
            case 4: System.out.println(30);break;
            case 5: System.out.println(31);break;
            case 6: System.out.println(30);break;
            case 7: System.out.println(31);break;
            case 8: System.out.println(31);break;
            case 9: System.out.println(30);break;
            case 10: System.out.println(31);break;
            case 11: System.out.println(30);break;
            case 12: System.out.println(31);break;}

        switch (gun){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println(31);break;

            case 2: System.out.println(28);break;

            case 4:
            case 6:
            case 9:
            case 11:System.out.println(30);break;}



    }
}
