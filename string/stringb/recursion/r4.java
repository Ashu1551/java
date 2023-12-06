// Factorial
package stringb.recursion;

public class r4 {
public static void main(String[] args) {
    int n=5;
    int ans =fact(n);
    System.out.print(ans);
}
public static int fact(int n){
    if(n==1)
    {
        return 1;
    }
    int f=fact(n-1);
    int fans=f*n;
    return fans;
    
}
}
