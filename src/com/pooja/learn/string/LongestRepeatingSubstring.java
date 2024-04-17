package com.pooja.learn.string;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingSubstring {

    public static int longestSubstring(String input, int k){
        int low = 0;
        int maxLength = 0;
        int[] arr = new int[26];
        int maxfrequency = 0;
        for(int i=0; i<input.length();i++){
            char myChar= input.charAt(i);
            arr[myChar-'A']++;
            maxfrequency = Math.max(maxfrequency,arr[myChar-'A']);
            if((i-low)+1-maxfrequency<=k){
                maxLength = Math.max(maxLength,i-low+1);
            }
            else{
                char remove = input.charAt(low);
                arr[remove-'A']--;
                low++;
            }


        }
        return maxLength;


    }

    public static int maxfrequency(Map<Character,Integer> map1){
        int max = 0;
        for(Map.Entry<Character,Integer> entry : map1.entrySet()){
            max = Math.max(max,entry.getValue());
        }
        return max;
    }

    public static void main(String[] args) {
        String input = "AABABBA";
        int k = 1;
        System.out.println(longestSubstring(input,k));
    }
}
