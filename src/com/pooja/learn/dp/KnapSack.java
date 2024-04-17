package com.pooja.learn.dp;

import static util.ArrayUtils.print2DArray;

public class KnapSack {
    public static int maxProfit(int[] weight, int[] profit){
        int maxWeight = 4;
        int[][] result = new int[weight.length][maxWeight+1];
        result[0][0] = 0;
        for(int i=1;i<weight.length;i++){
            for(int j=1;j<=maxWeight;j++){
                if(weight[i]>=j){
                    result[i][j] = Math.max(result[i-1][j],profit[i]+result[i-1][weight[i]-j]);

                }
                else {
                    result[i][j] = result[i-1][j];
                }

            }
        }
        print2DArray(result);
        return result[weight.length-1][maxWeight];

    }



    public static void main(String[] args) {
        int[] weight = {1 ,4, 5 };
        int[] profit = {3,1,2};
        System.out.println( maxProfit(weight,profit));
    }
}
