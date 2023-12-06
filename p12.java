
public class p12
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
		        System.out.print("*");
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
