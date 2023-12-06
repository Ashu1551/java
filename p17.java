import java.util.*;
public class p17 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        int digit =s.nextInt();
        int ans = getfrequancy(n,digit);
        System.out.print(ans);



        
    }
    public static int getfrequancy(int n, int digit)
    {
        int c=0;
        while(n!=0)
    {
        int r=n%10;
        if(r==digit)
        {            
          c++;
        }
         n=n/10;
    }
    return c;
    }
    
}
