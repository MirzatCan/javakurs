package Gun16;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {

        int orgNot;  //1 tane not saklar

        //50 kisi var
        int org1Not;
        int org2Not;
        int org3Not;
        //....
        //....
        int org50Not;

        // bana bir tanimlamada birden fazla deger tutabilen bir degiskene ihtiyacimiz var.
        //cuzum:
        int[] notlar=new int[50]; // 50 tane int saklayabilen notlar isimli degisken

        notlar[0]=75;
        notlar[1]=88;
        //...
        //...
        notlar[49]=90; //en son elaman toplam elaman sayisi-1 length-1 dir. boylece 0-49 index dir
        // notlar[50]=56;   challanger patlar
        System.out.println(notlar[0]);

        System.out.println(notlar.length); //50.  yani toplam elaman sayisini verir.

        // diziyi nasil okutulur.
        Scanner oku=new Scanner(System.in);
        for (int i=0;i<notlar.length;i++){
            System.out.print("Not giriniz=");
            notlar[i]=oku.nextInt();
        }
        for (int i=0;i<notlar.length;i++){
            System.out.println(notlar[i]);
        }
    }
}
