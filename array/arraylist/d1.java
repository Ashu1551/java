//2D Array print
package array.arraylist;

public class d1 {
    public static void main(String[] args) {
       /*  int [][]arr=new int[5] [3];
        int i;
        int j,c=1;
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[0].length;j++)
            {
                arr[i][j]=c;
                System.out.print(c);
                c++;
            }
            System.out.println();
        } */
        int [][]arr={{10,55,34,56},{45,3,53},{45,67,34,58}};//initilies
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) //array size update
            {
                
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
        }
    }
    
}
