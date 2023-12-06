public class p13

{
	public static void main(String[] args) {
		int i,j;
		int n=7;
		int nsp=n/2;
		int nst=1;
		for(i=1;i<=n;i++)
		{
		    for(j=1;j<=nsp;j++)
		    {
		        System.out.print(" ");
		    }
		    for(j=1;j<=nst;j++)
		    {
		        if(j==1||j==i*2-1 )
		        {
		            System.out.print("*");
		        }
		        else
		        {
		             System.out.print(" ");
		        }
		    }
		    System.out.println();
		    if(i<=n/2)
		    {
		        nsp--;
		        nst+=2;
		    }
		    else{
		        nsp++;
		        nst-=2;
		    }
		}
		
	

	}
}
