package com.pooja.learn.Array;

import java.util.Arrays;

public class MergeSort {
    static int[] nums1 = {1, 2, 3, 0, 0, 0};
    static int[] nums2 = {2, 5, 6};
    public static void merge(int m,int n) {
        int i = 0;
        int counter = 0;
        int j = 0;
        int[] temp1 = nums1;

        while (i < m || j < n) {
            if (i >= m) {
                nums1[counter] = nums2[j];
                counter++;
                j++;
                continue;
            }
            if (j >= n) {
                nums1[counter] = temp1[i];
                i++;
                counter++;
                continue;
            }

            int val1 = temp1[i];
            int val2 = nums2[j];

            if (val1 <= val2) {
                nums1[counter] = val1;
                i++;
            } else {
                nums1[counter] = val2;
                j++;
            }
            counter++;
        }
        System.out.println(Arrays.toString(nums1));


    }

    public static void main(String[] args) {

        merge(3,  3);

    }
}
