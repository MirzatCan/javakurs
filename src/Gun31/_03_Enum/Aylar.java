package Gun31._03_Enum;

public enum Aylar {
    Ocak(1,31,"Ocak"),
    Subat(2,28,"Subat"),
    Mart(3,31,"Mart"),
    Nisan(4,30,"Nisan"),
    Mayis(5,31,"Mayis"),
    Haziran(6,30,"Haziran"),
    Temuz(7,31,"Temuz"),
    Agustos(8,31,"Agustos"),
    Eylul(9,30,"Eylul"),
    Ekim(10,31,"Ekim"),
    Kasim(11,30,"Kasim"),
    Aralik(12,31,"Aralik");


    final int ayNo;
    final int gunMiktar;
    final String ayAdi;


    Aylar(int ayNo, int gunMiktar, String ayAdi) {
        this.ayNo=ayNo;
        this.gunMiktar=gunMiktar;
        this.ayAdi=ayAdi;

    }

}
