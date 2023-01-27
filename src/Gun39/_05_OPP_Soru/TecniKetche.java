package Gun39._05_OPP_Soru;

public class TecniKetche {
    public static void Hazirla(IFood s){
        if (s instanceof AdanaKebab) {
            ((AdanaKebab)s).marinade();
            ((AdanaKebab)s).grill();}
        else
        if (s instanceof Lahmacun) {
            ((Lahmacun)s).dough();
            ((Lahmacun)s).addMeat();
            ((Lahmacun)s).bake();}
        else
        if (s instanceof Borsh) {
            ((Borsh)s).boil();
            ((Borsh)s).eatTomorrow();}
        else
        if (s instanceof Palov) {
            ((Palov)s).fry();
            ((Palov)s).boil();}
    }
}
