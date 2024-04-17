package com.pooja.learn.string;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
     //  System.out.println(reverse("pooja"));
        compressString("pooja",5);

    }

    public static String reverse(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            result.append(input.charAt(i));
        }
        return result.toString();
    }
    static int  MAX = 26;
    static void compressString(String s, int n) {
        // To store the frequency
        // of the characters
        int freq[] = new int[MAX];

        // Update the frequency array
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Print the frequency in alphatecial order
        for (int i = 0; i < MAX; i++) {

            // If the current alphabet doesn't
            // appear in the string
            if (freq[i] == 0)
                continue;

            System.out.print((char) (i + 'a') + "" + freq[i]);
        }
    }
}
