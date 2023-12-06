package array;

import java.util.Arrays;

public class a8 {

    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int a=nums[0];
        int b=nums[1];
        int c=nums[n-1];
        int d=nums[n-2];
        int diff = (c*d)-(a*b);
        return diff;
    }
}

    

