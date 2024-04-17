package com.pooja.learn.Array;

public class ReverseInteger {

    public static int reverse(int x){
        long input = (long)x;
        long reverse = 0;
        while(input != 0){
            reverse = reverse*10 + input%10;
            input = input/10;
        }
        if (reverse < Math.pow(2,31) ||  reverse > Math.pow(-2,31)) return 0;
        return  (int)reverse;
    }

    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(reverse(x));
    }
}
