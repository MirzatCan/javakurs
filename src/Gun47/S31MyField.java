package Gun47;

public class S31MyField {
    int x;
    int y;

    public void doStuff(int x, int y) {
        x = x;
        y=this.y;
    }
    public void display(){
        System.out.println(x+" "+y+":");
    }

    public static void main(String[] args) {
        S31MyField m1=new S31MyField();
        m1.x=100;
        m1.y=200;
        S31MyField m2=new S31MyField();
        m2.doStuff(m1.x, m1.y);
        m1.display();
        m2.display();
    }
}
