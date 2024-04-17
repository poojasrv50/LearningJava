package com.pooja.learn.Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> printSpiral(int rowMin, int rowMax, int colMin, int colMax, int[][] matrix, List<Integer> ans){

        int i = colMin;
        int j = rowMin;
        while(i < colMax){
            ans.add(matrix[rowMin][i++]);
        }
         j++;
        while(j<rowMax){
            ans.add(matrix[j++][colMax-1]);
        }
        i--; i--;
        while(colMin-1 < i && rowMax-1 > rowMin){
            ans.add(matrix[rowMax-1][i--]);
        }
        j--;j--;
        while(rowMin < j && colMax-1 > colMin){
            ans.add(matrix[j--][colMin]);
        }
        if(rowMax-rowMin>2 && colMax-colMin >2){
            return printSpiral(rowMin+1,rowMax-1,colMin+1,colMax-1,matrix,ans);
        }

        else return ans;

    }


    public static void main(String[] args) {
        int[][] matrix = {{2,4,8}, {4,0,-1}};
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> and = printSpiral(0,row,0,col,matrix, new ArrayList<>());
        System.out.println(and);
        

    }
}
