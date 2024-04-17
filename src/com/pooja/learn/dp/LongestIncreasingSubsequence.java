package com.pooja.learn.dp;

import static util.ArrayUtils.printArray;

public class LongestIncreasingSubsequence {

    public static int lis(int[] input){
        int[] result = new int[input.length];
        int max = 1;
        for(int i=0; i<input.length; i++) {
            result[i] = 1;
        }
        for(int i=1; i<input.length; i++) {
           int j=0;
           while(j<i){
               if(input[i]>input[j]){
                   result[i] = Math.max(result[j]+1,result[i]);
               }
               j++;
           }
            max = Math.max(result[i],max);
        }
        printArray(result);
        return max;

    }




    public static void main(String[] args) {
        int[] input = {1,3,6,7,9,4,10,5,6};
        System.out.println(lis(input));
    }
}
