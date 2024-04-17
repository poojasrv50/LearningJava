package com.pooja.learn.dp;

import util.ArrayUtils;

import static util.ArrayUtils.print2DArray;

public class LongestCommonSubsequence {
    public static int lcs(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int[][] result = new int[c1.length + 1][c2.length + 1];
        for (int i = 1; i <= c1.length; i++) {
            for (int j = 1; j <= c2.length; j++) {
                if (c1[i - 1] == c2[j - 1]) {
                    result[i][j] = 1 + result[i - 1][j - 1];
                }
                else {
                    result[i][j] = Math.max(result[i-1][j],result[i][j-1]);
                }
            }
        }
        return result[c1.length][c2.length];
    }


    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println(lcs(s1, s2));

    }
}
