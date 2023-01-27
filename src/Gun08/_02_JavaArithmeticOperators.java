package Gun08;

public class _02_JavaArithmeticOperators {
    public static void main(String[] args) {
        int sayac=0;
        sayac=sayac+1; // sayac deger 1 artar
        sayac++;       // sayac deger 1 artar
        ++sayac;       // sayac deger 1 artar

        sayac=sayac-1; // sayac deger 1 azalir
        sayac--;       // sayac deger 1 azalir
        --sayac;       // sayac deger 1 azalir

        System.out.println("sayac = " + sayac);

        int toplam=5+sayac;  // 5 olur.

        toplam=5+sayac++;  //toplam=5+sayac sonra sayac=sayac+1
        // once toplap hesaplanir sonra sayac artar.  toplam=0 sayac=1 oldu
        System.out.println("toplam = " + toplam);

        toplam=5+ ++sayac; //sayac=sayac+1 sonra toplam=5+sayac  / sayac 7 olur.
        System.out.println("toplam = " + toplam);

        // ozet:++lar sagda ise once islem, sonra artis
        //      ++lar solda ise once artis, sonra islem


    }
}
