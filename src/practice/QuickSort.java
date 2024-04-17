package practice;

public class QuickSort {

    public static void sort(int[] input, int low, int high) {
        if (low < high) {
            int pivot = getPivot(input, low, high);
            sort(input, low, pivot - 1);
            sort(input, pivot + 1, high);
        }

    }

    public static int getPivot(int[] input, int low, int high) {
        int pivot = input[high];
        int i = low - 1;
        for (int j = low; j < input.length; j++) {
            if (input[j] < pivot) {
                i++;
                swap(input, i, j);
            }
        }
        swap(input, i + 1, high);
        return i + 1;
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] input = {0, 9, 1, 8, 2, 2, 3, 4, 8};
        sort(input, 0, input.length - 1);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}

