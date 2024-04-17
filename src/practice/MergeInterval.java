package practice;

import java.util.*;

public class MergeInterval {

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>(){

            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        List<int[]> ans = new ArrayList<>();
        ans.add(new int[]{intervals[0][0], intervals[0][1]});
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1][1] >= intervals[i][0]) {
                ans.remove(ans.size()-1);
                intervals[i][0] = intervals[i - 1][0];
            }

            ans.add(new int[]{intervals[i][0], intervals[i][1]});
        }
        int[][] myans = new int[ans.size()][2];
        int value = 0;
        for (int[] list : ans) {
            myans[value++] = list;
        }
        return myans;

    }


    public static void main(String[] args) {
        int[][] nums = {{1, 4}, {5, 6}};

        System.out.println(Arrays.asList(merge(nums)));

    }
}
