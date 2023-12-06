import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class p7 {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner x=new Scanner(System.in);
        int t=x.nextInt();
        for(int i=1;i<=t;i++)
        {
          int n=x.nextInt();
          boolean check=true;
          if(n==1){
           System.out.println("Not prime");
          }
          for(int d=2;d<=n-1;d++){
             if(n%d==0)
            {
                check=false;
                break;
            }
            }
           if(check==true)
           {
               System.out.println("Prime");
           }else{
             System.out.println("Not prime");
           }
        }
    }
}
