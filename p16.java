//countDigit
public class p16 {
    public static void main(String[] args) {
        int n=12345;
        int ans= countDigit(n);
        System.out.print(ans);
        
    }
    public static int countDigit(int n)
    {
        int c=0;
        while(n!=0)
    {
        
        n=n/10;
        c++;
    }
    return c;
    }
    


}
