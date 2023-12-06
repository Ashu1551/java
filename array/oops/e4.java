package array.oops;

import java.util.Scanner;

public class e4 {
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
         System.out.println(ex.getMessage());
        //  System.out.println(ex.toString());
        //  System.out.println(ex.printStackTrace());
    }
    }
}
