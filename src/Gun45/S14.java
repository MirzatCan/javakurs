package Gun45;

public class S14 {
    public static void main(String[] args) {
        int date[]={2010,2013,2014,2015,2014};
        int key=2014;
        int count=0;
        for (int e:date) {
            if (e !=key){
                continue;
//                count++;     -> continue dan sonra islem yapilamaz donguye devam eder ondan hata verir

            }
        }
        System.out.println(count+" Forund");
    }
}
