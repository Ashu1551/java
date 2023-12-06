//decimalTOBinary With base
import java.util.*;
public class p20 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int b=s.nextInt();
        int ans = decimalTOBinary(n,b);
        System.out.print(ans);

        
    }
    public static int decimalTOBinary(int n,int b)
{
    int bin=0;
    int mul=1;
    while(n!=0){
        int rem=n%b;
        bin=bin+(rem*mul);
        mul=mul*10;
        n=n/b;
        }
        return bin;
}    
}
