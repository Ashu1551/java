class A
{
    private int x;
    private int y;
    public void setx(int a)
    {
        x=a;
    }
    public void sety(int a)
    {
        y=a;
    }
    public int getx()
    {
        return x;
    }
    public int gety()
    {
        return y;
    }
}
public class o6 {
    public static void main(String[] args) {
        A a1=new A();
        a1.setx(100);
        System.out.println(a1.getx());
    }
}
