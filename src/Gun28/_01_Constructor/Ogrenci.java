package Gun28._01_Constructor;

public class Ogrenci {
    int id;
    String adi;
    String soyAdi;
    int sinifi;

    public Ogrenci(){ //yapici metodlar: Constructor metodlar
        System.out.println("nesne olusturuldu");
    }//nesne olusturulurken yapmak istediklerin icin burayi kullan
    public Ogrenci(int id,String adi,String soyAdi,int sinifi){
        this.id=id; //this.id class in id si,    id: local degisken parametre
        this.adi=adi;
        this.soyAdi=soyAdi;
        this.sinifi=sinifi;
    }
    public Ogrenci(int id,String adi,String soyAdi){
        this(id,adi,soyAdi,0); //this ogrenci metodunun kendisi
//        this.id=id;
//        this.adi=adi;
//        this.soyAdi=soyAdi;
//        this.sinifi=0;
    }
}
//    mühendisin arabayı çizdiği kağıttaki modeller: class, tipin adı, türün adı
//        buna bakarak yapılmış araba ise nesne, araba üretilirken yapılan işlemlerin
//        yapıldığı metos ise Constructor yani yapıcı metodlar
