public class r5 {
    public static void main(String[] args) {
        int[] arr={5,2,9,2,4,3,6,3,2,2,6};
        int s=0;
        int idx=0;
        int ele=2;
        int[] a=rec(arr,idx,ele,s);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static int[] rec(int[] arr,int idx,int ele,int s) {
if(idx==arr.length)
{
    int[] base=new int[s];
    return base;
}
    if(arr[idx]==ele)
    {
        s++;
    } 
    int [] faith   
    }
}
