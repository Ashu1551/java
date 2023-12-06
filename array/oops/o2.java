// package array.oops;

class Person{
    String name;
    int age;
    public void formFill(String n, int a)
    {
        System.out.println("My name is:"+n);
        System.out.println("My age is:"+a);
    }
    
    public void greet()
    {
        System.out.println("Hello");
    }
    public void walk()
    {
        System.out.println("i am walking");
    }
    
}
public class o2 {
   public static void main(String[] args) {
    Person p1 = new Person();
    p1.greet();
    p1.walk();
    p1.formFill("Ashu", 22);

}

}
