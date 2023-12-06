//anybaseTODecimal and  DecimalTOanyBase
import java.util.*;
public class p22 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int b1=s.nextInt();
        int b2=s.nextInt();
    
        int n1 = anybaseTODecimal(n,b1);
        int ans1=decimalTOanyBase(n1,b2);
        System.out.println(n1);
        System.out.print(ans1);

        
    }
//anybasetodecimal
    public static int anybaseTODecimal(int n, int b1)
{
    int result=0;
    int p=1;
    while(n!=0){
        int d=n%10;
        result=result+d*p;
        p=p*b1;
        n=n/10;
        }
        return result;
} 
//decimaltoanybase
 public static int decimalTOanyBase(int n1, int b2)
{
    int res=0;
    int p=1;
    while(n1!=0){
        int d=n1%b2;
        res=res+d*p;
        p=p*10;
        n1=n1/b2;
        }
        return res;
}    
}
