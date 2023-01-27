package Gun30._01_StaticVariables.Ornek2;

public class School {
    public static void main(String[] args) {

        Student org1=new Student(1,"Mirzat");
        Student org2=new Student(2,"xirzat");
        Student org3=new Student(3,"Tumaris");
        //Problem: hem id yi takip etmek zorundayim
        //hem de hata olasigi yuksek


        Student org10=new Student("memet");
        Student org11=new Student("ehmet");
        Student org12=new Student("semet");
        System.out.println("org10 = " + org10);
        System.out.println("org11 = " + org11);
        System.out.println("org12 = " + org12);

    }
}
