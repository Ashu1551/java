//swapArray
package array;
import java.util.*;
public class a5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[]arr={10,20};
        
        System.out.println(arr[0]+" "+arr[1] );
        swap(arr);
        System.out.println(arr[0]+" "+arr[1]);
    }
    public static void swap(int[]a){
        int temp=a[0];
            a[0]=a[1];
            a[1]=temp;
    }      
            
        
    
}
