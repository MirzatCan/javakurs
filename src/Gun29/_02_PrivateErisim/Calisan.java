package Gun29._02_PrivateErisim;

public class Calisan {

    int id;//default
    String name;//default
    String surName; //default
    private String passWord;  // private
    // sadece bulundugu classdan erisim izini var


    public void sifreAta(String sifre){
        //sifreyi kontrol ederek atayacagim
        if (sifre.length()<8){
            System.out.println("gecersiz sifre");}
        else
        {
            passWord=sifre;
            System.out.println("sifreyi basariyla atandi");
        }
    }
    public void sifreGoter(){
        System.out.println("passWord = " + passWord);
    }
    public void sifreSonunuGoter(){
        System.out.println("****"+passWord.substring(4));
    }
}
