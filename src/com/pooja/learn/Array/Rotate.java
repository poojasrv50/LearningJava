package com.pooja.learn.Array;

import java.util.*;

public class Rotate {


      /*  public static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map1 = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map1.put(i, nums[i]);
            }
            List<String> numslist = new ArrayList<>(Arrays.asList(nums));
            for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
                int currentValue = entry.getValue();
                int required = target - currentValue;
                if (map1.containsValue(required)) {
                    System.out.println(currentValue+"  "+required);
                    System.out.println(numslist.indexOf(currentValue));
                   return new int[]{numslist.indexOf(currentValue), numslist.indexOf(required)};
                }
            }
            return null;
    }

    public List<String> summaryRanges(int[] nums) {

        Map<Integer,List<Integer>> map1 = new HashMap<>();
        if(nums.length ==1 ) return new ArrayList<>(nums[0]);
        int counter = 0;
        map1.put(counter, new ArrayList<>());
        map1.get(counter).add(nums[0]);
        for( int i=1; i<nums.length; i++){
            if(nums[i] -1 == nums[i-1]){
                map1.put(counter,map1.get(counter).add(nums[i])) ;
            }
            else{
                map1.put(counter,new ArrayList<>());
                map1.put(counter,nums[i]);
            }
        }
        System.out.println(map1);
        return map.values();

    }*/
    public static void main(String[] args) {
        int[] s = {2, 7, 11, 13};
      //  int t = 9;
     //   System.out.println(twoSum(s,t).toString());


    }
}
