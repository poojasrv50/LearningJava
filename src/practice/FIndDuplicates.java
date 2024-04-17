package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FIndDuplicates {
    public static List<Integer> findDupes(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> dupes = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (dupes.containsKey(current)) dupes.put(current, dupes.get(current) + 1);
            else dupes.put(current, 1);
        }
        for (Map.Entry<Integer, Integer> entry : dupes.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value > 1) ans.add(key);

        }
        return ans;
    }


    public static void main(String[] args) {
        int[] input = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> ans = findDupes(input);
        System.out.println(ans);
    }

}
