package com.pooja.learn.Array;

import java.util.Arrays;

class TwoSumsIndices {
    public int[] twoSum(int[] nums, int target) {
        int[] out = new int[2];
        for(int i=0 ; i<nums.length;i++){

            for (int j=i+1; j<nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    System.out.println("Value of o and j"+i+j);
                    out = new int[]{i, j};
                }
                System.out.println("Value of o and j"+i+j);
            }

        }

        return out;
    }
    public static void main(String[] args) {
       int[] input = {2,7,11,15};
        TwoSumsIndices test = new TwoSumsIndices();

        int[] output = test.twoSum(input,9);
        System.out.println(Arrays.toString(output));


    }
}