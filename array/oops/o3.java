class Rectangle{
    int length;
    int width;
    Rectangle()
    {
        System.out.println("i am a non perametrized constructor");
        length=10;
        width=20;
    }
     Rectangle(int l, int w)
    {
        System.out.println("i am a perametrized constructor");
        length=l;
        width=w;
    }
    public int area()
    {
       return length*width; 
    } 
    public int pram()
    {
       return 2*(length+width); 
    }    
}
public class o3 {
   public static void main(String[] args) {
    // Rectangle r1 = new Rectangle();
    // r1.length=20;
    // r1.width=40;
    // int v=r1.area();
    // System.out.println(v);
    // int v2=r1.pram();
    // System.out.println(v2);
    Rectangle r2=new Rectangle();
    System.out.println(r2.area());
    Rectangle r3=new Rectangle(20,30);
    System.out.println(r3.area());
}
}
