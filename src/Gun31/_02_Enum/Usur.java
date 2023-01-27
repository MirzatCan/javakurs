package Gun31._02_Enum;

public class Usur {
    String userName;
    Soru.Rol rolu;
    Soru.Statu statu;


    public Usur(String userName, Soru.Rol rolu, Soru.Statu statu) {
        this.userName = userName;
        this.rolu = rolu;
        this.statu = statu;
    }

    @Override
    public String toString() {
        return "Usur{" +
                "userName='" + userName + '\'' +
                ", rolu=" + rolu +
                ", statu=" + statu +
                '}';
    }
}
