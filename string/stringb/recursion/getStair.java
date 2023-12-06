import java.util.ArrayList;

public class getStair {
    public static void main(String[] args) { 
        int n=4; 
        ArrayList<String> ans = Getstair(n); 
        System.out.println(ans); 
    } 
    public static ArrayList<String> Getstair(int n) { 
        if(n==0) 
        { 
         ArrayList<String> base =new ArrayList<>(); 
         base.add(""); 
         return base; 
        } 
        if(n<0) 
        { 
            return new ArrayList<>(); 
        } 
        ArrayList<String> faith1 = Getstair(n-1); 
        ArrayList<String> faith2 = Getstair(n-2); 
        ArrayList<String> faith3 = Getstair(n-3); 
        ArrayList<String> myans = new ArrayList<>(); 
        for(String s: faith1) 
        { 
            myans.add(1+s); 
        } 
         for(String s: faith2) 
        { 
            myans.add(2+s); 
        } 
         for(String s: faith3) 
        { 
            myans.add(3+s); 
        } 
        return myans; 
         
         
    } 
     
}

