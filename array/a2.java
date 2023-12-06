package array;
import java.util.*;
public class a2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[]arr={23,45,67,89,45,78,54,67,34,67,34};
        arr[5]=12;
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Element at index:"+i+" "+arr[i]);
            
        }
    }
}
