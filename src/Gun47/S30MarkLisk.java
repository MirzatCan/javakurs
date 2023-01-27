package Gun47;

public class S30MarkLisk {
    int num;
    public static void graceMarks(S30MarkLisk obj4){
        obj4.num+=10;
    }

    public static void main(String[] args) {
        S30MarkLisk obj1=new S30MarkLisk();
        S30MarkLisk obj2=obj1;
        S30MarkLisk obj3=null;

        obj2.num=60;
        graceMarks(obj2);
    }
}

