package com.pooja.learn.dp;

public class ClimbingStairs {

    public static int stairs(int stairs) {
        int[] result = new int[stairs];
        result[0] = 1;
        result[1] = 2;
        for(int i=2;i<=stairs;i++){
            result[i] = result[i-1]+result[i-2];
        }
        return result[stairs-1];
    }


    public static void main(String[] args) {
        int starirs = 6;
    }
}
