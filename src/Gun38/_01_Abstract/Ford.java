package Gun38._01_Abstract;

public class Ford extends BinekOto implements IBink{

    public Ford(String marka, int uretimYeri,int vitesAdedi) {
        super(marka, uretimYeri, vitesAdedi);
    }

    @Override
    public int hizlanmaSuresi() {
        return 0;
    }
}
