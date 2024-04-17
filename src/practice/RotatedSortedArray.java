package practice;

public class RotatedSortedArray {

    public static int minNumber(int[] input) {
        int low = 0;
        int high = input.length - 1;
        int ans = 0;
        if (high == 0)
            return input[0];

        while (low <= high) {
            if (low == high)
                return input[low];
            if (high - low == 1) {
                if (input[low] <= input[high])
                    return input[low];
                else
                    return input[high];
            }
            int mid = low + (high - low) / 2;
            if (input[mid] < (input[mid + 1]) && input[mid] < (input[mid - 1]))
                return input[mid];

            if (input[low] > input[mid]) {
                high = mid - 1;
            } else if (input[high] < input[mid]) {
                low = mid + 1;
            } else
                return input[low];
        }
        return ans;
    }

    public static int search(int[] input, int target) {
        int low = 0;
        int high = input.length - 1;
        while (low <= high) {
            if (low == high || high == 0) {
                if (input[high] == target) return low;
                else return -1;
            }
            int mid = low + (high - low) / 2;
            if (target == input[mid]) return mid;

            if (target > input[mid]) {
                if (input[low] > input[mid] && input[low] <= target) high = mid - 1;
                else low = mid + 1;
            } else {
                if (input[high] < input[mid] && input[high] >= target) low = mid + 1;
                else high = mid - 1;
            }
        }
        return -1;


    }

    public static void main(String[] args) {
        int[] input = {3, 4, 5, 1, 2};
        int ans = search(input, 1);
        System.out.println(ans);
    }
}
