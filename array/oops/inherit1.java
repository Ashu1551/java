class Parent{
    private int x;
    private int y;
    Parent()
    {
        System.out.println("I am a Parent constructor 1");
    }
     Parent(int val1)
    {
        System.out.println("I am a Parent constructor 2");
        x=val1;
    }
     Parent(int val1,int val2)
    {
        System.out.println("I am a Parent constructor 3");
        x=val1;
        y=val2;
    }
    public int getx()
    {
     return x;
    }
    public int gety()
    {
     return y;
    }
    public void setx(int val)
    {
      x=val;
    }
    public void sety(int val)
    {
      y=val;
    }

    
}
class Child extends Parent{
    int z;
    Child()
    {
        System.out.println("I am a Child constructor 1");
    }
    Child(int v)
    {
        System.out.println("I am a Child constructor 2");

    }
    Child(int v1,int v2)
    {
        super(v1,v2);
        System.out.println("I am a Child constructor 3");
    }
    public int getz()
    {
     return z;
    }
    public void setz(int val)
    {
      z=val;
    }
}
public class inherit1 {
    public static void main(String[] args) {
         Parent p1=new Parent();
        // p1.setx(10);
        // int gv=p1.getx();
        // System.out.println(gv);
         Child c1=new Child();

        
    }
    
}
