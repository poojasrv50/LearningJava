package com.pooja.learn.string;

public class LongestPalindrome {

    public static String longPalindrom(String s) {
        if(s.length() <=1) return s;
        String sb = s.substring(0,1);
        int initial = 1;
        for (int i = 0; i < s.length(); i++) {
            int high = i + 1;
            int current = i;
            int low = i-1;

            while(current>=0 && high < s.length() && s.charAt(current) == s.charAt(high)){
                String temp = s.substring(current, high + 1);
                current--;
                high++;
                if (temp.length() > initial) {
                    sb = temp;
                    initial = temp.length();
                }
            }
             high = i + 1;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                String temp = s.substring(low, high + 1);
                low--;
                high++;
                if (temp.length() > initial) {
                    sb = temp;
                    initial = temp.length();
                }
            }

        }
        return sb;

    }


    public static void main(String[] args) {
        String input = "aaaa";
        System.out.println(longPalindrom(input));

    }
}
