package array.arraylist;

public class d2 {
    public static void main(String[] args) {
        int [][]arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};//initilies

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++) //array size update
            {
                
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=arr[0].length-1;j>=0;j--) //array size update
            {
                
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
        }
    }
}




