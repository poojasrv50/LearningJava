package com.pooja.learn.Matrix;

import static util.ArrayUtils.print2DArray;

public class MatrixOne {
    public static int[][] setMatrix(int[][] matrix){
        if(matrix.length == 0 || matrix[0].length == 0) return matrix;
        int row = matrix.length;
        int col = matrix[0].length;

        int[] rows = new int[row];
        int[] cols = new int[col];
        for(int i=0 ;i< row; i++){
            rows[i] = 1;
        }
        for(int i=0 ;i< col; i++){
            cols[i] = 1;
        }

        for(int i=0; i<row;i++){
            for(int j=0; j< col; j++){
                if( matrix[i][j] == 0){
                    rows[i] = 0;
                    cols[j] = 0;
                }
            }
        }
        for(int i=0 ; i< row; i++){
            for(int j=0; j<col;j++){
                if( rows[i] == 0 || cols[j] == 0 ){
                    matrix[i][j] = 0;
                }
            }

        }

    return matrix;
    }


    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        print2DArray(matrix);
        setMatrix(matrix);
        print2DArray(matrix);

    }
}
