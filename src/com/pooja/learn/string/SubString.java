package com.pooja.learn.string;

public class SubString {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi","issipi"));
       // System.out.println(strStr("sadbutsad","sad"));
       // System.out.println(strStr("leetcode","leeto"));

    }

    public static int strStr(String haystack, String needle) {
        int n = needle.length();
        int h = haystack.length();
        if (n > h) {
            return -1;
        } else {
            char n1 = needle.charAt(0);
            for (int i = 0; i < h; i++) {
                if (haystack.charAt(i) == n1) {
                    int k = 0;
                    int index = i;
                    boolean match = true;
                    while (k < n ) {
                        if(index >= h)
                        {
                            match = false;
                            break;
                        }
                        if (needle.charAt(k++) != haystack.charAt(index++)) {
                            match = false;
                            break;
                        }
                    }
                    if (match) {
                        return i;
                    }
                }

            }
        }
        return -1;
    }
}
