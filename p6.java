/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
public class p6
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		boolean check=true;
		if(n==1){
		    System.out.println("Not prime");
		}
		for(int d=2;d<=n-1;d++){
		    if(n%d==0)
		    {
		        check=false;
		        break;
		    }
		}
		if(check==true)
		{
		    System.out.println("Prime");
		}else{
		    System.out.println("Not prime");
		}
	}
}