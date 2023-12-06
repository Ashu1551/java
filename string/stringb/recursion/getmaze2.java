import java.util.ArrayList;

public class getmaze2 {
     public static void main(String[] args) {
        
    int n=3;
    int m=3;
    ArrayList<String> collect = new ArrayList<>();
    getmaze2(0,0,n,m,"",collect);
    System.out.print(collect);
    }
    public static void getmaze2(int sr, int sc, int n, int m,String ans, ArrayList<String> collect){
        if(sr==n || sc==m)
        {
            return;
        }
        if(sr==n-1 && sc==m-1)
        {
            
            collect.add(ans); 
            return; 
        }
        
        getmaze2(sr,sc+1,n,m,"h"+ans,collect);
        
        getmaze2(sr+1,sc,n,m,"v"+ans,collect); 

        
    }
}
