package Gun34._04_Protected.paket1;

public class P1Hayvan {
    public String ad; // her yerden
    int yas; //sadece bulundugu paketten
    protected String cinsi; // default gibi, ama bazi durumlarda  diger paketlerden de erisebilir
    private String renk; // sadece bulundugu classdan erisilebilir
}
