package array.oops;
import java.util.*;
public class e7 {
    public static int fun(int a,int b) throws ArithmeticException{
        int result =0;
        result=a/b;
        return result;
        
    }
    public static void main(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two number");
        int a= scn.nextInt();
        int b= scn.nextInt();
        try{
            int ans=fun(a,b);
            System.out.println(ans);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("code succesfull run");
        }
    }
    
}
