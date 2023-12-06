package array.oops;
import java.util.*;
class NegetiveAgeException extends Exception{
    NegetiveAgeException(){
        super();
    }
}
public class e6 {
    public static int fun(int age) {
        try{
            if(age<0)
            {
                throw new NegetiveAgeException();
            }
            return age+10;

        }catch(Exception e){
            e.printStackTrace();
        }finally{
                System.out.println("code succesfull run");
        }
        
        return 0;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scn.nextInt();
        int ans=fun(age);
        System.out.println(ans);
        

        
    }
}