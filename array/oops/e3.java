package array.oops;

import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {
           Scanner scn=new Scanner(System.in);
    System.out.println("Enter two Number");
    try{
        int[] arr={1,2,3,4,5,6};
        int ans=Integer.parseInt("2897e874fh");
        int a=scn.nextInt();

        int b=scn.nextInt();

         System.out.println(arr[a]);
         System.out.println("enter a number"+ans);
         

    }
     catch(IndexOutOfBoundsException ex)
    {
         System.out.println("please input natural number"+ex);
    }
    catch(NumberFormatException x)
    {
         System.out.println("please input natural number"+x);
    }
    }
}
