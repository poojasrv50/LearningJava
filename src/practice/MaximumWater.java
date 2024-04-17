package practice;

public class MaximumWater {

    public static int getMax(int[] input) {
        int left = 0;
        int right = input.length - 1;
        int maxVolume = 0;
        while (left < right) {
            if(input[left]<input[right]){
                left++;
            }
            else right--;
            int volume = Math.min(input[left], input[right]) * (right - left);

            maxVolume = Math.max(volume,maxVolume);
        }
        return maxVolume;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 18, 17, 6};

        System.out.println(getMax(nums));

    }
}
