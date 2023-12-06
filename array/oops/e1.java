package array.oops;
import java.util.*;
public class e1 {
    public static void main(){
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter two Number");
    try{
        int a=scn.nextInt();
        int b=scn.nextInt();
        int r1=a+b;
        int r2=a/b;
        System.out.println(r1+" "+r2);

    }
    catch(Exception ex)
    {
         System.out.println("Got Exception"+ex);
    }
     System.out.println("Code Succesfull Run");

    }
}

