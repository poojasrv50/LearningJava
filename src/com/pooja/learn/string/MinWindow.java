package com.pooja.learn.string;

import java.util.HashMap;
import java.util.Map;

public class MinWindow {

    public static String minSubstring(String s, String t) {
        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            if (need.containsKey(c)) need.put(c, need.get(c) + 1);
            else need.put(c, 1);
        }
        Map<Character, Integer> have = new HashMap<>();
        int left = 0, right = 0;
        int minwindow = Integer.MAX_VALUE;
        int[] winodow = new int[2];
        while (left < right && right < s.length()) {
            char current = s.charAt(right);
            if (need.containsKey(current)) {
                if (have.containsKey(current)) have.put(current, have.get(current) + 1);
                else need.put(current, 1);
                right++;
            }
            if (have.size() == need.size()) {
                boolean ans = compareMap(need,have);
                if(ans && right-left<minwindow){

                }
            }

        }
    return null;
    }

    public static boolean compareMap(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {

            if (entry.getValue() < map2.get(entry.getKey())) {
                return false;
            }
        }
    return false;
    }


    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
    }

}
