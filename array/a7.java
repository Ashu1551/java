package array;

public class a7 {
    public static int getmax(int[]arr) {
    

        int i,max=arr[0];
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[]arr={2,5,1,7,3,4};
        int max= getmax(arr);  
    while(max>=1){
    for(int i=0;i<arr.length;i++)
    {
        
            if(arr[i]>=max){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        
    }
    System.out.println();
    max--;
    
}
}
}


