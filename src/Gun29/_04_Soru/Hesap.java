package Gun29._04_Soru;

public class Hesap {
    private int yatan=0;
    private int cekilen=0;
    private int bakiye=0;

     public void paraYatir(int yatan){
        this.yatan+=yatan;
        bakiye+=yatan;

    }

    public void paraCek(int cekilen){
        this.cekilen+=cekilen;
        bakiye-=cekilen;
    }

    @Override
    public String toString() {
        return "Hesap{" +
                "yatan=" + yatan +
                ", cekilen=" + cekilen +
                ", bakiye=" + bakiye +
                '}';
    }
}
