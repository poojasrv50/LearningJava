package com.pooja.learn.Array;

import java.sql.Array;
import java.util.HashMap;

public class TwoSum {
    public static int[] sumExists(int[] input, int target){
        for(int i=0; i<input.length;i++){
            int current = input[i];
            int required = target - current;
            for(int j=i+1; j<input.length;j++){
                if(input[j] == required)
                    return new int[]{i, j};
            }
        }

        return null;
    }

    public static int[] sumExistsMap(int[] input, int target) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int i=0; i<input.length;i++){
            map1.put(input[i],i);
        }
        System.out.println(map1);
        for(int i=0; i<input.length;i++){
            int current = input[i];
            int required = target - current;
            if(map1.containsKey(required)&&map1.get(required)!=i)
                return new int[] {i,map1.get(required)};
        }
        return null;

    }


    public static void main(String[] args) {
        int[] input = {0,-1,2,-3,-1,-1};
        int sum = -2;
        int[] ans = sumExistsMap(input, sum);
       if (ans != null) {
           System.out.println(ans[0] + " "+ans[1]);
        }

    }
}
