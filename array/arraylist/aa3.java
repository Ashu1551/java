//reverse IN Arraylist
package array.arraylist;

import java.util.ArrayList;

public class aa3 {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        int i=0;
        int j=a.size()-1;
        while(i<j)
        {
        int t =a.get(i);
        int p =a.get(j);
            a.set(i,p);
            a.set(j,t);
            i++;
            j--;
        }  
        
        System.out.println(a);
    }
}
    

