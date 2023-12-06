package stringb.recursion;

public class r2 {
    public static void main(String[] args) {
        int n=5;
        printincreasing(n);

    }
    public static void  printincreasing(int n){
        if(n==0)
        {
            return;
        }
        printincreasing(n-1);//faith 1,2,3,4
        System.out.println(n);
        
        

    }
}
