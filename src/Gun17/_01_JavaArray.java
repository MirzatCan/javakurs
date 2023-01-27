package Gun17;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1, çift olanlara 0 atayınız  yazdırınız.
        //1.yontem
        int [] sayilar=new int[50];
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i]=(int)(Math.random()*11);
            System.out.println("sayi oncesi= " + sayilar[i]);
            if (sayilar[i]%2==0)
                sayilar[i]=0;
            else
                sayilar[i]=1;
            System.out.println("sayi sonrasi= " + sayilar[i]);
        }
        System.out.println();
        //2.yontem
        int [] sayilar1=new int[50];
        for (int i = 0; i < sayilar1.length; i++) {
            sayilar1[i]=(int)(Math.random()*11);
            System.out.println("sayi oncesi= " + sayilar1[i]);
        }
        for (int i = 0; i < sayilar1.length; i++) {
            if (sayilar1[i]%2==0)
                sayilar1[i]=0;
            else
                sayilar1[i]=1;
            System.out.println("sayi sonrasi= " + sayilar1[i]);
        }

    }
}
