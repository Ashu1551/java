package stringb.recursion;

public class r3 {
    public static void main(String[] args) {
        int n=5;
        printincreasing(n);

    }
    public static void  printincreasing(int n){
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        printincreasing(n-1);//faith 1,2,3,4
        System.out.println(n);
        
        

    }
}
