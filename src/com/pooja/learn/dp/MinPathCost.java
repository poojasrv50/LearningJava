package com.pooja.learn.dp;

import static util.ArrayUtils.print2DArray;

public class MinPathCost {

    public static int minPath(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;
        int[][] result = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 && j == 0) {
                    result[0][0] = grid[0][0];
                } else if (i == 0) {
                    result[0][j] = grid[0][j] + result[0][j - 1];

                } else if (j == 0) {
                    result[i][0] = grid[i][0] + result[i - 1][0];
                } else {
                    result[i][j] = grid[i][j] + Math.min(result[i - 1][j], result[i][j - 1]);
                }
            }
        }
       // print2DArray(result);
        return result[row - 1][col - 1];
    }


    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(minPath(grid));
    }
}
