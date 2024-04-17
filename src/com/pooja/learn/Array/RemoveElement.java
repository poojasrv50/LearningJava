package com.pooja.learn.Array;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        removeDuplicates(nums);


    }

    public static int removeDuplicates(int[] nums) {
        int[] temp = nums;
        int counter = 0;
        for (int i = 0; i < temp.length; i++) {
            int pointer = temp[i];
            int repeatition = 1;
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[j] != pointer) {
                    break;
                }
                else
                    repeatition++;
            }

            nums[counter++] = pointer;
            if (repeatition>=2) {
                nums[counter++] = pointer;
                i=i+repeatition-1;
            }

        }
        System.out.println(Arrays.toString(nums));
        System.out.println(counter);
        return counter;

    }
}
