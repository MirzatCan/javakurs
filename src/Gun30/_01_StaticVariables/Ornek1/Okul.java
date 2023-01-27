package Gun30._01_StaticVariables.Ornek1;

public class Okul {
    public static void main(String[] args) {
//        Ogrenci ogr1=new Ogrenci("Mirzat","Memet","Yildiz teknik");
//        Ogrenci ogr1=new Ogrenci("xirzat","Memet","Yildiz teknik");
//        Ogrenci ogr1=new Ogrenci("ayjamal","ehet","Yildiz teknik");
//
//        //...
//        //...
//        Ogrenci ogr499=new Ogrenci("tumaris","mirzat","Yildiz teknik");
//        Ogrenci ogr500=new Ogrenci("medine","turak","Yildiz teknik");
//        // Okul adi ayni
        Ogrenci ogr1=new Ogrenci("Mirzat","Memet");
        System.out.println("ogr1 = " + ogr1);

        Ogrenci.okuAdi="istanbul";
        System.out.println("ogr1 tekrar= " + ogr1);
        //Ayni verinin cok kez girisi engellendi
        //Ayni verinin hafizada NESNE sayisi kadar tekrarlanmasini engellendi






    }
}
