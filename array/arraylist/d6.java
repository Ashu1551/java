package array.arraylist;

public class d6 {
    public static void main(String[] args) {
        int [][]arr={{1,2,5,3,2},{4,9,1,2,3},{1,5,10,5,2},{7,8,5,10,5},{13,14,15}};//initilies
        
        for(int i=0;i<arr.length;i++){
            int s=0;
            for(int j=0;j<arr[0].length;j++) //array size update
            {
                s=s+arr[i][j];
                
                
            }
            System.out.println(s);
            }
        }
    }
    
    

