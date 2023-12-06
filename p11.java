
public class p11
{
	public static void main(String[] args) {
		int i,j;
       int n=5;      
        
        for(i=1;i<=n;i++)
        {
            //star
            for(j=1;j<=n;j++)
            {
                if(i==1 || i==n || i==j || i+j==n+1)
               {
                   System.out.print("*");
                
               }else
                  {
                   System.out.print(" ");
                  }
                
            }
            System.out.println();
            
            
            
    
        }

	}
}
