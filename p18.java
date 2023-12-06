import java.util.*;
public class p18 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        
        int ans = rev(n);
        System.out.print(ans);
}
public static int rev(int n) {
    int r=0;
    while(n!=0)
    {
       
      int rem=n%10;
      r=(r*10)+rem;
      n=n/10;
    }
    return r;
    
}
}




