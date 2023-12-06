class Student{
    String name;
    int marks;
    int rolln;
    Student(String n,int m,int r)
    {
     name=n;
     marks=m;
     rolln=r;

    }
    
    public void display()
    {
        System.out.println(name);
         if(marks<0 || marks>100)
        {
            System.out.println("invalid marks");
        }
        else if(marks>=90)
        {
            System.out.println("A");
        }
        else if(marks>=80)
        {
            System.out.println("b");
        }
        else if(marks>=70)
        {
            System.out.println("c");
        } else if(marks>=60)
        {
            System.out.println("d");
        }
        else 
        {
            System.out.println("e");
        }
    }
}
public class o4 {
    public static void main(String[] args) {
        Student s1=new Student("Ashu",101,01);
        s1.display();
    }
}
