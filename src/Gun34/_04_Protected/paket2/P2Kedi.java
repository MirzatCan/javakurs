package Gun34._04_Protected.paket2;

import Gun34._04_Protected.paket1.P1Hayvan;

public class P2Kedi extends P1Hayvan {
    public P2Kedi(String ad,String cinsi) {
        this.ad = ad;
        this.cinsi = cinsi;

        // protected   default  dan farkli olarak
        //extend edildiginde diger paketlerden de erisilebilir.
    }
}
