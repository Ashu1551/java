//swap variable does not work
package array;
import java.util.*;
public class a4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=10;
        int b=20;
        System.out.println(a+" "+b );
        swap(a,b);
        System.out.println(a+" "+b);
    }
    public static void swap(int a,int b){
        int temp=a;
            a=b;
            b=temp;
    }      
            
        
    
}
