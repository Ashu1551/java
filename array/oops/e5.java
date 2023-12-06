package array.oops;
import java.util.*;
class NegetiveAgeException extends Exception{
    NegetiveAgeException(){
        super();
    }
}
public class e5 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scn.nextInt();
        try{
            if(age<0)
            {
                throw new NegetiveAgeException();
            }
            System.out.println(age);

        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("code succesfull run");

        
    }
}
