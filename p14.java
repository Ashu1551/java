//Return type
public class p14 {
    public static void main(String[] args) {
        int a=5;
        int b=6;
         int ans=sum(a,b);// function calling
         int n=multi(a,b);// function calling
         System.out.print(ans);
         int g=sub(a,b);// function calling
         System.out.print(n);
         System.out.print(g);
         
    }
    public static int sum(int x, int y){
       int z=x+y;       
       return z;
        
    }
    public static int multi(int x, int y){
       int s=x*y;
       return s;
    }
    public static int sub(int x, int y){
       int q=x-y;
    
       return q;
    }
}
