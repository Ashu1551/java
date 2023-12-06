import java.util.ArrayList;

public class getStair2 {
    public static void main(String[] args) { 
        int n=4; 
        ArrayList<String> collect = new ArrayList<>(); 
        Getstair2(n,"",collect);
        System.out.println(collect); 
    } 
    public static void Getstair2(int n,String ans,ArrayList<String> collect) { 
        if(n==0) 
        { 
        
            collect.add(ans); 
        return; 
        } 
        if(n<0) 
        { 
            return; 
        } 
        Getstair2(n-1,ans+1, collect); 
        Getstair2(n-2,ans+2, collect); 
        Getstair2(n-3,ans+3, collect); 
            
    } 
    
}
