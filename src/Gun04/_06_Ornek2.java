package Gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)

        double agirlik=80.9;
        int boyu=180;

        double kitleIndex= agirlik/(boyu*boyu);

        System.out.println("boyunuz="+boyu+"cm "+"kilonuz="+agirlik+"kg");
        System.out.println("kitleIndex = " + kitleIndex);


    }
}
