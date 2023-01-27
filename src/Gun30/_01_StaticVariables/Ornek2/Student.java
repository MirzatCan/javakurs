package Gun30._01_StaticVariables.Ornek2;

public class Student {
    private int id; //yoksa istedigi kadar atabilir
    String fulName;

    static int sayac=0;
    // static olmadan her zaman 0 la basliyordu
    // static oldugunda artik bir tane oldugundan
    //degerini korudu ve hep 1 tane artti


    public Student(int id, String fulName) {
        this.id = id;
        this.fulName = fulName;
        //maindeki ilk 3 satir icin gerekli
        //static degiskenden sonra gerek kalmadi
    }
    public Student(String fulName) {
        this.id = sayac++;//once var olan deger veriyor, sonra artiyor
        this.fulName = fulName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fulName='" + fulName + '\'' +
                '}';
    }
}
