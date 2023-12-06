//binaryTODecimal
import java.util.*;
public class p21 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int ans = decimalTOBinary(n);
        System.out.print(ans);

        
    }
    public static int decimalTOBinary(int n)
{
    int result=0;
    int p=1;
    while(n!=0){
        int d=n%10;
        result=result+d*p;
        p=p*2;
        n=n/10;
        }
        return result;
}    
}
