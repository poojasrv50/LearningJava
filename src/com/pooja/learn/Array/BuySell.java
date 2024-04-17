package com.pooja.learn.Array;

public class BuySell {

    public static int bullSell(int[] nums){
        int min = nums[0];
        int profit = 0;
        for(int i=1; i< nums.length;i++){
            if(nums[i]<nums[i-1])
            {
                min = Math.min(min,nums[i]);
            }
            else
                profit=Math.max(profit,nums[i]-min);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] input = {7,1,5,3,6,4};
        int ans = bullSell(input);
        System.out.println(ans);

    }
}
