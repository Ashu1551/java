//Recursion - printDecreasing
package stringb.recursion;

public class r1 {
    public static void main(String[] args) {
        int n=10;
        printDecreasing(n);

    }
    public static void  printDecreasing(int n){
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);

    }
}
