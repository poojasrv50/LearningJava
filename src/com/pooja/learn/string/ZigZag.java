package com.pooja.learn.string;

public class ZigZag {

    public static String zigzagString(String input, int row) {
        if (input.length() <= 1 || row <= 1) return input;
        StringBuilder sb = new StringBuilder();
        int currentRow = 1;
        int i = 0;
        int n=row;
        while (currentRow <= row) {
            int currenti = i;
            int counter = 1;
            int prev = Integer.MIN_VALUE;
            while (currenti < input.length()) {
                if (prev != currenti)
                    sb.append(input.charAt(currenti));

                prev = currenti;
                if (counter % 2 != 0) {
                    currenti = currenti + 2 * (n- 1);

                } else {
                    currenti = currenti + 2 * (currentRow - 1);
                }
                counter++;
            }

            i++; n--;
            currentRow++;
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int rows = 4;
        System.out.println(zigzagString(s, rows));


    }
}
