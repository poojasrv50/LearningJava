package practice;

import java.util.Arrays;
import java.util.List;

public class MaxSubArray {

    public static int maxSum(int[] nums) {
       int sum = 0;
       int maxGlobal = Integer.MIN_VALUE;
       int startSum = -1, endSum = -1, start = -1;

        for (int i = 0; i < nums.length; i++) {
           if(sum == 0 ) start = i ;
            sum = sum+nums[i];
            if(sum>maxGlobal){
                maxGlobal = sum;
                startSum = start;
                endSum = i;
            }
           // maxGlobal = Math.max(sum,maxGlobal);
         //
           if(sum < 0) sum = 0;

        }
        int[] subarray = Arrays.copyOfRange(nums, startSum, endSum+1);
        System.out.println( Arrays.toString(subarray));
        return maxGlobal;
    }

    public static int maxProduct(int[] nums) {
        int prefix = 1, suffix = 1;
        int ans = Integer.MIN_VALUE;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int currentForward = nums[i];
            int back = nums[len - i - 1];

            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;
            prefix = prefix * currentForward;
            suffix = suffix * back;
            ans = Math.max(ans, (Math.max(prefix, suffix)));


        }
        return ans;
    }

    public static void main(String[] args) {
        int[] input = { -2,-1,-3};
        int ans1 = maxSum(input);
        int ans = maxProduct(input);
        // for (int i = 0; i < ans.length; i++) {
        System.out.println("Max Product- " + ans);
        System.out.println("Max Sum- " + ans1);
        // }
    }
}
