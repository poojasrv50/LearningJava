package practice;

public class MergeSort {
    public static void sort(int[] input, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            sort(input, low, mid );
            sort(input, mid + 1, high);
            merge(input, low, mid, high);
        }
    }

   public static void merge(int[] input, int low, int mid, int high) {
        int lowIndex = mid - low + 1;
        int highIndex = high - mid;

        int[] L1 = new int[lowIndex];
        int[] R1 = new int[highIndex];

        for (int i = 0; i < lowIndex; i++) {
            L1[i] = input[low + i];
        }

        for (int i = 0; i < highIndex; i++) {
            R1[i] = input[mid + 1 + i];
        }

        int i = 0, j = 0, k = low;
        while (i < lowIndex && j < highIndex) {
            if (L1[i] <= R1[j]) {
                input[k] = L1[i];
                i++;
            } else {
                input[k] = R1[j];
                j++;
            }
            k++;
        }

        while (i < lowIndex) {
            input[k] = L1[i];
            i++;
            k++;
        }
        while (j < highIndex) {
            input[k] = R1[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
       // int[] input = {0, 9, 1, 8, 2, 2, 3, 4, 8};
        int[] input = {0, 9, 1,8,2,2};
        sort(input, 0, input.length - 1);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
