package array.oops;

import java.util.*;

public class e2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
    System.out.println("Enter two Number");
    try{
        int a=scn.nextInt();
        int b=scn.nextInt();
        int ans=Integer.parseInt("2897e874fh");

        int r1=a+b;
        int r2=a/b;
        System.out.println(r1+" "+r2);

    }
     catch(ArithmeticException ex)
    {
         System.out.println("please input natural number"+ex);
    }
     catch(NumberFormatException ss)
    {
         System.out.println("Character is found in String please correct"+ss);
    }
    catch(Exception cc)
    {
         System.out.println("input is wrong reason"+cc);
    }
     System.out.println("Code Succesfull Run");
    }
    
}
