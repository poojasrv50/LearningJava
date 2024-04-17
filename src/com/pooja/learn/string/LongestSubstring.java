package com.pooja.learn.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubstring {

    public static int subSet(String input) {
        if(input.length() == 1) return 1;
        char[] chaArray = input.toCharArray();
        int maxValue = 1;

        for (int i = 0; i < chaArray.length; i++) {
            List<Character> list = new ArrayList<>();
            list.add(chaArray[i]);
            for (int j = i + 1; j < chaArray.length; j++) {
                if (list.contains(chaArray[j])) {
                    maxValue = Math.max(maxValue, list.size());
                    list.clear();
                }
                list.add(chaArray[j]);
            }
            maxValue = Math.max(maxValue, list.size());
        }
        return maxValue;
    }

    public static int subSetOn(String input){
        if(input.length() == 1) return 1;
        char[] chaArray = input.toCharArray();
        Map<Character,Integer> myList = new HashMap<>();
       int longestSubstring = 1;
       int low = 0;
        for(int i=0; i< chaArray.length;i++)
        {
            char myChar = chaArray[i];
            if(myList.containsKey(myChar) && myList.get(myChar) >= low){
                low = myList.get(myChar)+1;
            }
            myList.put(myChar,i);
            longestSubstring = Math.max(longestSubstring,i-low+1);
        }
        return longestSubstring;


    }

    public static void main(String[] args) {
        String input = "pwwkew";

        System.out.println(subSetOn(input));
    }
}
