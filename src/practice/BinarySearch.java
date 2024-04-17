package practice;

public class BinarySearch {

    public static boolean search(int[][] matrix, int target, int left, int right) {
        int col = matrix[0].length;
        int mid = left + (right - left) / 2;
        int midElement = matrix[mid / col][mid % col];
        if (mid == 0 || left == right) {
            if (midElement == target) return true;
            else return false;
        }
        if (midElement == target) {
            return true;
        } else if (midElement < target) {
            left = mid + 1;
            return search(matrix, target, left, right);
        } else
            right = mid - 1;
        return search(matrix, target, left, right);
    }


    public static void main(String[] args) {
        int[][] matrix1 = {{10, 12, 15, 17}, {19, 21, 24, 26}, {30, 32, 34, 36}, {39, 40, 41, 42}};
        int target = 105;
        System.out.println(search(matrix1, target, 0, matrix1.length * matrix1[0].length - 1));

    }

}
