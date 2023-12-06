import java.util.ArrayList;

public class getMage {
    public static void main(String[] args) {
        
    int n=3;
    int m=3;
    ArrayList<String> ans = getmaze(0,0,n,m);
    System.out.print(ans);
    }
    public static ArrayList<String> getmaze(int sr, int sc, int n, int m){
        if(sr==n || sc==m)
        {
            return new ArrayList<>();
        }
        if(sr==n-1 && sc==m-1)
        {
            ArrayList<String> base =new ArrayList<>(); 
            base.add(""); 
            return base; 
        }
        ArrayList<String> faith1 = getmaze(sr,sc+1,n,m); 
        ArrayList<String> faith2 = getmaze(sr+1,sc,n,m); 
        ArrayList<String> myans = new ArrayList<>(); 
        for(String s: faith1) 
        { 
            myans.add("h"+s); 
        } 
        for(String s: faith2) 
        { 
            myans.add("v"+s); 
        } 
        return myans;
    }
}
