package com.pooja.learn.Array;

public class Palindrome {
    public static boolean isPlaindrome(int input) {
        char[] array = Integer.valueOf(input).toString().toCharArray();
        int i = 0, j = array.length - 1;
        while (i < j) {
            if (array[i] != array[j])
                return false;
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPlaindrome(1001));
    }
}
