package practice;

import java.util.Arrays;

public class Chocolate {
    public static int getMax(int[] nums, int student) {
        Arrays.sort(nums);

        int min = 0;
        int max = student-1;
        int ans = nums[max] - nums[min];
        while (max < nums.length) {
            ans = Math.min(ans, nums[max++] - nums[min++]);
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};

        System.out.println(getMax(nums, 7));

    }
}
