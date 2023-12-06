//print all subarrays
package array;
import java.util.*;
public class a9 {
    public static void main(String[] args) {
        int[]arr={10,20,30,40};
        int n =arr.length;
    for(int s1=0; s1<n;s1++){
        for(int e1=s1;e1<n;e1++){
            for(int k=s1;k<=e1;k++){
            System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
    }
    
    
    } 
}
