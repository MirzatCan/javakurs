package Gun44;

public class S04 {
    public static void main(String[] args) {
        String[] strs=new String[2];
        int idx=0;

        for (String s:strs) {
            strs[idx].concat("Eleman"+idx);
            idx++;
        }
        for (idx = 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);
        }

        //olmayan bir sey ustune concat yapilamiyir
        // null ustune yapilamaz
        //strs[idx]="Eleman"+idx;  diye atarsak
        //sonuc hata vermez.  Eleman0  Eleman1 diye sonuc verir
    }
}
