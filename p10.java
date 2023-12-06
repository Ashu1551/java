
public class p10
{
	public static void main(String[] args) {
	    int i,j;
	    int n=7;
	    int nst=n;
	    int nsp=0;
		for (i=1;i<=n;i++) 
		{
		    //space
		    for(j=1;j<=nsp;j++)
		    {  
		       
		      
		        System.out.print(" ");
		      
		    }
		    //star
		    for(j=1;j<=nst;j++)
		    {
		        if(i==1||i==n||j==1||j==nst)
		        { 
		            System.out.print("*");
		        }else{
		            System.out.print(" ");
		        }
		        
		    }
		    //line change 
		    System.out.println();
		    if(i<=n/2)
		    {
		        nsp++;
		        nst-=2;
		    }else{
		        nsp--;
		        nst+=2;
		    }
		    
		    
		    
		       
		}
	}
}
