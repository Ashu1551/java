//package array.oops;
class Person{
    String name;
    int age;
    long mn;
}
public class o1 {
public static void game3(Person p1, Person p2) {
    String temp =p1.name;
    p1.name=p2.name;
    p2.name=temp;
    p2 = new Person();
    int temp1 =p1.age;
    p1.age=p2.age;
    p2.age=temp1;    
    

}




    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="ashu";
        p1.age=22;
        p1.mn=7489857522l;
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.mn);


        Person p2=new Person();
        p2.name="aman";
        p2.age=23;
        p2.mn=9165688479l;
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.mn);
        game3(p1,p2);
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.mn);
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.mn);

    }
}
