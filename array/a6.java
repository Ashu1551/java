//reverse array
package array;

import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[]arr={10,20,30,40,50};
        revers(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        
    }
    public static void revers(int[]arr){
        int i=0,j=arr.length-1;
        while(i<j)
        {
        int t =arr[i];
            arr[i]=arr[j];
            arr[j]= t;
            i++;
            j--;
        }      
            
        
    
    }
}




    /*  public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]arr={1,4,6,8,4};
        int i=0,j=arr.length-1;
        while(i<j)
        {
            int t=a
        }
        {

        }
}*/
