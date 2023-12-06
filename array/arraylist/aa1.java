package array.arraylist;
import java.util.ArrayList;
public class aa1 {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
    /* 
    a.add(11);   //add at last
    a.add(12);
    a.add(13);
    a.add(14);*/
    /* 
    a.add("a");
    a.add("b");
    a.add("c");
    a.add("d");  */
    a.add("apple");
    a.add("mango");
    a.add("orange");
    a.add("pine apple");


    System.out.println(a);
    System.out.println(a.get(2));//access value
    a.add(2,"kiwi");//insert at index
    System.out.println(a);
    System.out.println(a.size());
    a.set(1,"guava"); //update value at index
    System.out.println(a);
    a.remove(2);//remove element
    System.out.println(a);


        
    }
}
