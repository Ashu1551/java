package array;
import java.util.*;
public class a1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();


        }
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Element at index:"+i+" "+arr[i]);
            
        }
    }
}
