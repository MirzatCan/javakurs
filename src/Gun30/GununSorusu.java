package Gun30;

public class GununSorusu {
    int a;
    static int b=0; // sen bir tanesin, 2 tane zaten olamaz
    
    void artir(){
        a++;
        b++;

    }
    
    public static void main(String[] args) {
        GununSorusu gs1=new GununSorusu();
        gs1.a=5;

        GununSorusu gs2=new GununSorusu();
        gs2.a=7;
        
        // a nin degeri kac oldu su anda :: burda verilecek cevap hangi a yi soruyorsunuz olmali
        //Burda her nesnenin a si var ve gs1 in 5, gs2 in 7 

        System.out.println("gs1.a = " + gs1.a);
        System.out.println("gs2.a = " + gs2.a);
        
        //Soru b nin degeri kactir  : tek bir deger vardir en son deger 
        System.out.println("GununSorusu.b = " + GununSorusu.b);
        
        gs1.artir(); //gs.1  a->6   b ->1
        System.out.println("gs1 = " + gs1.b);  //1
        gs2.artir(); //gs.2  a->8   b ->2
        //soru a nin v b nin degerleri kactir.
        System.out.println("gs1.a = " + gs1.a);
        System.out.println("gs1.b = " + gs1.b); //2
        System.out.println("gs2.a = " + gs2.a);
        System.out.println("gs2.b = " + gs2.b); //2

        // 2 defa b +1 oldu
    }
}
