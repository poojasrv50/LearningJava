package practice;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> findSubstring(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int iValue = nums[i];
            HashSet<Integer> set = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int req = 0 - (iValue + nums[j]);
                if (set.contains(req)) {
                    List<Integer> found = new ArrayList<>();
                    Collections.addAll(found, nums[i], nums[j], req);
                    Collections.sort(found);
                    if (!ans.contains(found)) ans.add(found);
                } else {
                    set.add(nums[j]);
                }

            }
        }
        return ans;
    }
    public static List<List<Integer>> findSubstringOptimized(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j=i+1;
            int k = nums.length-1;
            int iValue = nums[i];
            while(j<k){
                int jValue = nums[j];
                int kValue = nums[k];
                if(j>i+1 && jValue == nums[j-1]) {
                    j++;
                    continue;
                }
                if(k<nums.length-2 && kValue == nums[k+1]) {
                    k++;
                    continue;
                }
                int sum = (jValue+iValue+kValue);
                if(sum < 0)
                    j++;
                else if (sum >0)
                    k--;
                else{
                    List<Integer> found = new ArrayList<>();
                    Collections.addAll(found,nums[i], nums[j], nums[k]);
                    if (!ans.contains(found)) ans.add(found);
                    j++; k--;
                }
            }
        }
        return ans;

    }


    public static void main(String[] args) {
        int[] input = {-1,0,1,2,-1,-4};

        System.out.println(findSubstringOptimized(input));
    }
}
