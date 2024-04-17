package com.pooja.learn.dp;

import static util.ArrayUtils.print2DArray;

public class Coin {

    public static int minCoin(int[] coin, int target) {

        int[][] result = new int[coin.length + 1][target + 1];
        for(int i=0; i<target+1;i++){
            result[0][i] = Integer.MAX_VALUE-1;
        }
        for (int i = 1; i <= coin.length; i++) {
            for (int j = 1; j <= target; j++) {
                if (coin[i - 1] <= j) {
                    result[i][j] = Math.min(result[i][j - coin[i - 1]] + 1, result[i - 1][j]);
                } else {
                    result[i][j] = result[i-1][j];
                }
            }
        }
        if(result[coin.length][target] == Integer.MAX_VALUE-1) return -1;
       else return result[coin.length][target];


    }


    public static void main(String[] args) {
        int[] coin = {2};
        int target = 3;
        System.out.println(minCoin(coin, target));
    }
}
