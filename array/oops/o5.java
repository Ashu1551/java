class Student{
    String name;
    int marks;
    int rolln;
    Student(String name,int marks,int rolln)
    {
        this("aman");
      System.out.println("constructor top String");  
     this.name=name;
     this.marks=marks;
     this.rolln=rolln;

    }
    Student(String name)
    {
     
     System.out.println("constructor 1 String");
     this.name=name;

    }
     Student(int marks)
    {
     
     System.out.println("constructor 2 marks");
    this.marks=marks;

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
public class o5 {
    public static void main(String[] args) {
        Student s1=new Student("Ashu",101,01);
        //s1.display();
    }
}

