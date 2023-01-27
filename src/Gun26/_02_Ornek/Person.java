package Gun26._02_Ornek;

public class Person {
    String name;
    String surname;
    int age;

    //3.yontem
    public  void bilgia1Yazdir(){ //burda kulanirken static kelimesi kulanilmaz
        //() icine Person diye tipini belirlememize gerek yok
        //cunku zaten Person class in icinde yazdik
        System.out.println("bilgi.name = " +name);
        System.out.println("bilgi.surname = " + surname);
        System.out.println("bilgi.age = " + age);
    }

    @Override
    public String toString() { //toString burda
        return name+" "+surname+" "+age;
    }
    public  void getBirthYear(){  //4.adim 1.yontem
        int dogumYili;
        dogumYili=2023-age;
        System.out.println("Dogum Yili = " + dogumYili);
    }
    public  String getBirthYear2() { //4.adim 2.yontem public String olmasi lazim.
        int dogumYili;               //return olarak bilgi gondermesi lazim
        dogumYili = 2023 - age;
        return "Dogum Yili = " + dogumYili;
    }
    public  void getInitials(){
        System.out.println("Adi SoyAdi ilk harflari= " + name.toUpperCase().charAt(0)
                + "." + surname.toUpperCase().charAt(0));
    }
}
