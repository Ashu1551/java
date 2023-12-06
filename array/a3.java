package array;
import java.util.*;
public class a3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]arr=new int[n];
        int max;
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
            

        }
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Element at index:"+i+" "+arr[i]);
            
        }
        System.out.println("sum is:"+sum);
    }
}
