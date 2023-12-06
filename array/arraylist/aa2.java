package array.arraylist;
import java.util.*;
public class aa2 {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(17);
        a.add(2);
        a.add(4);
        a.add(3);
        a.add(9);
        a.add(6);
        a.add(8);
        a.add(10);
        a.add(19);
        
        for(int i=0;i<=a.size()-1;i++){
        if(a.get(i)%2!=0){
            a.remove(i);
            i--;
        
        }
        
        }
        System.out.println(a);
        
        
    }
    
}
