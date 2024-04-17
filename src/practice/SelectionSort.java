package practice;

public class SelectionSort {

    public static int[] sort(int[] input) {
        // int[] sort = new int[];
        for (int i = 0; i < input.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = input[i];
            input[i] = input[minIndex];
            input[minIndex] = temp;
        }
        return input;

    }

    public static void main(String[] args) {
        int[] input = {0, 9, 1, 8, 2, 2, 3, 4, 8};
        int[] ans = sort(input);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

}
