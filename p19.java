//decimalTOBinary
public class p19 {
    public static void main(String[] args) {
        int n=13;
        int ans = decimalTOBinary(n);
        System.out.print(ans);

        
    }
    public static int decimalTOBinary(int n)
{
    int bin=0;
    int mul=1;
    while(n!=0){
        int rem=n%2;
        bin=bin+(rem*mul);
        mul=mul*10;
        n=n/2;
        }
        return bin;
}    
}
