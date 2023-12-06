//bottom to top
package array.arraylist;

public class d4 {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15},{16,17,18}};//initilies
    
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
            for(int j=0;j<arr[0].length;j++) //array size update
            {
                
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
            }else{
            
            for(int j=arr[i].length-1;j>=0;j--) //array size update
            {
                
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
            }
        }
    }
    
}
