package com.pooja.learn.Tree;

public class MaxIsland {

    public static int maxIsland(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int count = 0;
        boolean[][] visited = {{false, false, false, false, false}, {false, false, false, false, false}, {false, false, false, false, false}, {false, false, false, false, false}};

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int current = arr[i][j];
                if (current == 1 && !visited[i][j]) {
                    count++;
                    search(i, j, arr, visited);
                }
            }
        }

        return count;
    }


    public static void search(int i, int j, int[][] arr, boolean[][] visited) {
        if (i < 0 || j < 0 || i > arr.length - 1 || j > arr[0].length - 1 || visited[i][j] || arr[i][j] == 0) return;

        visited[i][j] = true;

        search(i - 1, j, arr, visited);
        search(i + 1, j, arr, visited);
        search(i, j - 1, arr, visited);
        search(i, j + 1, arr, visited);
    }


    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 1, 1}};
        System.out.println(maxIsland(arr));
    }
}
